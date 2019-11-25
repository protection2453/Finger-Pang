package com.example.test.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import com.example.test.command.joinStepAllCommand;
import com.example.test.db.dto.JoinDTO;
import com.example.test.service.JoinService;
import com.example.test.service.JoinServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/join/*")
public class JoinController{


    

    @RequestMapping(value="/join/stepall", method=RequestMethod.GET)
    public ModelAndView joinStepAll(@Valid joinStepAllCommand stepallCommand, BindingResult bindingResult) throws Exception {
        
        if(bindingResult.hasErrors()){
            ModelAndView mv = new ModelAndView("join/joinAll");
            return mv;
        }

        boolean checkPw = stepallCommand.isPwEqualToCheckPw();
        if(!checkPw){
            bindingResult.rejectValue("password_confirm", "noMatch", "비밀번호를 확인해주세요.");
            ModelAndView mv = new ModelAndView("join/joinAll");
            return mv;
        }

        ModelAndView mv = new ModelAndView("join/joinAll");
        return mv;
    }
    
    @Resource(name="joinServiceImpl")
    private JoinServiceImpl joinSer;

    @RequestMapping(value="/join/joinfin", method=RequestMethod.POST)
    @ResponseBody
    public ModelAndView joinFin(@Valid JoinDTO joinDTO, Errors errors)throws Exception{
        
        if(errors.hasErrors()){
            ModelAndView mv = new ModelAndView("index");
            return mv;
        }
        try{
        joinSer.insertMember(joinDTO);
        }catch(Exception e){
            ModelAndView mv = new ModelAndView("index");
            return mv;
        }
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }
    
}
