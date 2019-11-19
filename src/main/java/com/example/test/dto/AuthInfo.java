package com.example.test.dto;

// 회원 세션 정보 유지
public class AuthInfo{
    private String id;
    private String nickname;
    private int gender;
    private int age;
    private int job;
    private int area;
    private int religion;

    public AuthInfo(String id, String nickname, int gender, int age, int job, int area, int religion){
        this.id = id;
        this.nickname = nickname;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.area = area;
        this.religion = religion;
    }

    public String getId(){ return id; }
    public String getNickname(){ return nickname; }
    public int getGender(){ return gender; }
    public int getAge(){ return age; }
    public int getJob(){ return job; }
    public int getArea(){ return area; }
    public int getReligion(){ return religion; }
    public void setId(String id){ this.id = id; }
    public void setNickname(String nickname){ this.nickname = nickname; }
    public void setGender(int gender){ this.gender = gender; }
    public void setAge(int age){ this.age = age; }
    public void setJob(int job){ this.job = job; }
    public void setArea(int area){ this.area = area; }
    public void setReligion(int religion){ this.religion = religion; }
}