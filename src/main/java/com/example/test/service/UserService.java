package com.example.test.service;

import com.example.test.command.LoginCommand;
import com.example.test.db.dto.AuthInfo;

public interface UserService {
    public AuthInfo loginAuth(LoginCommand loginCommand) throws Exception;
}