package com.example.test.db.mapper;

import com.example.test.db.dto.UserDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

    @Autowired
    private SqlSession sqlSession;
    
    public UserDTO selectById(String id) {
    
        return (UserDTO)sqlSession.selectOne("user.selectById", id);
    }
}

