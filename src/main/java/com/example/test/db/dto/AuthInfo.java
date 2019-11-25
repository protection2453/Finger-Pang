package com.example.test.db.dto;

// 회원 세션 정보 유지
public class AuthInfo{
    private String id;
    private String nickname;


    public AuthInfo(String id, String nickname){
        this.id = id;
        this.nickname = nickname;
    }

    public String getId(){ return id; }
    public String getNickname(){ return nickname; }

    public void setId(String id){ this.id = id; }
    public void setNickname(String nickname){ this.nickname = nickname; }

}