package com.example.test;

import com.example.test.dto.AuthInfo;

public interface UserService {
    public AuthInfo loginAuth(LoginCommand loginCommand) throws Exception;
}