package com.example.test.service;

import com.example.exception.IdPasswordNotMatchingException;
import com.example.test.command.LoginCommand;
import com.example.test.db.dto.AuthInfo;
import com.example.test.db.dto.UserDTO;
import com.example.test.db.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public AuthInfo loginAuth(LoginCommand loginCommand) throws Exception {
        UserDTO user = userMapper.selectById(loginCommand.getId());
        if (user == null) {
            throw new IdPasswordNotMatchingException();
        }
        if(!user.matchPassword(loginCommand.getPw())){
            throw new IdPasswordNotMatchingException();
        }
        return new AuthInfo(user.getId(), user.getNickname());
    }
}
