package com.example.test.db.mapper;

import com.example.test.db.dto.JoinDTO;

import org.springframework.stereotype.Repository;

@Repository("joinMapper")
public class JoinMapper extends AbstractMapper{
public void insertMember(JoinDTO joinDTO){

        insertMember("join.insertMember", joinDTO.getId(), joinDTO.getPassword(), joinDTO.getPhone(), joinDTO.getGender(), joinDTO.getAge(), 
        joinDTO.getJob(), joinDTO.getArea(), joinDTO.getReligion(), joinDTO.getHobby(), joinDTO.getPet(), joinDTO.getMarry(), 
        joinDTO.getGradepoint(), joinDTO.getCredit());
    }
}