package com.example.test.service;

import com.example.test.db.dto.UserDTO;

public interface JoinService {
    public String selectNickname();
    public String selectId();
    public String selectAll();
    public void insertUser(UserDTO userDTO);
}