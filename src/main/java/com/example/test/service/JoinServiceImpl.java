package com.example.test.service;

import com.example.test.db.dto.UserDTO;
import com.example.test.db.mapper.JoinMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinServiceImpl implements JoinService{
    
    @Autowired
    private JoinMapper joinMapper;
    
    @Override
    public String selectNickname(){
        return joinMapper.selectNickname();
    }

    @Override
    public String selectId(){
        return joinMapper.selectId();
    }

    @Override
    public String selectAll(){
        return joinMapper.selectAll();
    }
    
    @Override
    public void insertUser(UserDTO userDTO){
        joinMapper.insertUser(userDTO);
    }

}