package com.example.test.controller;

import com.example.test.command.JoinRequest;
import com.example.test.db.dto.UserDTO;
import com.example.test.service.JoinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JoinController{

    @Autowired
    private JoinService joinSer;


    @GetMapping(path="/join/step1")
    public ModelAndView joinStep1() throws Exception {
        
        ModelAndView mv = new ModelAndView("join/joinStep1");
        return mv;
    }

    @GetMapping(path="/join/step2")
    public void joinStep2Get(){

    }
    @PostMapping(path="/join/step2")
    public ModelAndView joinStep2(@RequestParam(value="join_chk1", defaultValue = "false") Boolean join_chk1, @RequestParam(value="join_chk2", defaultValue = "false") Boolean join_chk2) throws Exception {
        
        if(!join_chk1 || !join_chk2){
        ModelAndView mv = new ModelAndView("join/joinStep1");
        return mv;
        }
        ModelAndView mv = new ModelAndView("join/joinStep2");
        mv.addObject("joinRequest", new JoinRequest());
        return mv;
    }

    @GetMapping(path="/join/step3")
    public void joinStep3Get(){

    }
    @PostMapping(path="/join/step3")
    public ModelAndView joinStep3(JoinRequest joinRequest, Errors errors)throws Exception{
        
        if(errors.hasErrors()){
            ModelAndView mv = new ModelAndView("index");
            return mv;
        }
        System.out.println("==============================================");
        System.out.println("userDTO.gender" + joinRequest.getGender());
        System.out.println("userDTO.job" + joinRequest.getJob());
       
            UserDTO userDTO = new UserDTO(joinRequest.getId(), joinRequest.getNickname(), joinRequest.getPassword(), joinRequest.getPhone(), joinRequest.getGender(), joinRequest.getAge(), joinRequest.getJob(), joinRequest.getArea(), joinRequest.getReligion(), joinRequest.getHobby(), joinRequest.getPet(), joinRequest.getMarry());
            joinSer.insertUser(userDTO);
        
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }
    
}
