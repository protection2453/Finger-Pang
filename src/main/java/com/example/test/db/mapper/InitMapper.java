package com.example.test.db.mapper;

import com.example.test.db.dto.UserDTO;



public interface InitMapper{
    public String selectNickname();
    public String selectId();
    public String selectAll();
    public void insertUser(UserDTO userDTO);
}

