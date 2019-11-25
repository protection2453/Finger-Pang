package com.example.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.example.exception.IdPasswordNotMatchingException;
import com.example.test.service.UserService;
import com.example.test.service.UserServiceImpl;
import com.example.test.command.LoginCommand;
import com.example.test.command.joinStep1Command;
import com.example.test.command.joinStep2Command;
import com.example.test.command.joinStepAllCommand;
import com.example.test.db.dto.AuthInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    // before URL start( start first )
    @Autowired
    @Resource(name="userServiceImpl")
    private UserServiceImpl userSer;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView loginSuccess(@Valid LoginCommand loginCommand, BindingResult bindingResult, HttpSession session,
            HttpServletResponse response) throws Exception {
        if (bindingResult.hasErrors()) {
            ModelAndView mv = new ModelAndView("/loginForm");
            return mv;
        }

        try {
            AuthInfo authInfo = userSer.loginAuth(loginCommand);
            session.setAttribute("authInfo", authInfo);

            Cookie rememberCookie = new Cookie("REMEMBER", loginCommand.getId());
            rememberCookie.setPath("/");
            if (loginCommand.isRememberId()) {
                rememberCookie.setMaxAge(60 * 60 * 24 * 7);
            } else {
                rememberCookie.setMaxAge(0);
            }
            response.addCookie(rememberCookie);
        } catch (IdPasswordNotMatchingException e) {
            bindingResult.rejectValue("pw", "notMatch", "아이디와 비밀번호가 맞지 않습니다.");
            ModelAndView mv = new ModelAndView("loginForm");
            return mv;
        }
        ModelAndView mv = new ModelAndView("/loginForm"); // /mainForm으로 변경 예정
        return mv;
    }

    //logout 
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        ModelAndView mv = new ModelAndView("redirect:/");
        return mv;
    }

    @RequestMapping(value="/join/step1", method=RequestMethod.GET)
    public ModelAndView joinStep1(joinStep1Command step1Command) throws Exception {
        
        ModelAndView mv = new ModelAndView("join/joinStep1");
        return mv;
    }

    @RequestMapping(value="/join/step2", method=RequestMethod.GET)
    public ModelAndView joinStep2(joinStep2Command step2Command) throws Exception {
        
        ModelAndView mv = new ModelAndView("join/joinStep2");
        return mv;
    }
    
}