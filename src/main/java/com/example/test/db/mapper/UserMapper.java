package com.example.test.db.mapper;

import com.example.test.db.mapper.AbstractMapper;
import com.example.test.db.dto.UserDTO;

import org.springframework.stereotype.Repository;


@Repository("userMapper")
public class UserMapper extends AbstractMapper{
public UserDTO selectById(String id) {
        return (UserDTO) selectOne("user.selectById", id);
    }
}
