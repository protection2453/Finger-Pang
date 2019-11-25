package com.example.test.service;

import javax.annotation.Resource;

import com.example.test.db.dto.JoinDTO;
import com.example.test.db.mapper.JoinMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository("joinServiceImpl")
public class JoinServiceImpl implements JoinService{

    @Autowired
    @Resource(name="joinMapper")
    public JoinMapper joinMapper;

    @Override
    public void insertMember(JoinDTO joinDTO){
        joinMapper.insertMember(joinDTO);
    }
}