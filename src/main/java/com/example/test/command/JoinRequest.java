package com.example.test.command;

import javax.persistence.Entity;

@Entity
public class JoinRequest{

    private String nickname;
    private String id;
    private String password;
    private String password_confirm;
    private String phone;
    private String age;
    private String gender;
    private String job;
    private String area;
    private String religion;
    private String hobby;
    private String pet;
    private String marry;

    public boolean isPwEqualToCheckPw(){
        return password.equals(password_confirm);
    }

    public String getId(){ return id; }
    public String getPassword(){ return password; }
    public String getPasswordConfirm(){ return password_confirm; }
    public String getNickname(){ return nickname; }
    public String getPhone(){ return phone; }
    public String getGender(){ return gender; }
    public String getAge(){ return age; }
    public String getJob(){ return job; }
    public String getArea(){ return area; }
    public String getReligion(){ return religion; }
    public String getHobby(){ return hobby; }
    public String getPet(){ return pet; }
    public String getMarry(){ return marry; }

    public void setId(String id){ this.id = id; }
    public void setNickname(String nickname){ this.nickname = nickname; }
    public void setPassword(String password ){ this.password = password; }
    public void setPasswordConfirm(String password_confirm){ this.password_confirm = password_confirm; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setGender(String gender){ this.gender = gender; }
    public void setAge(String age){ this.age = age; }
    public void setJob(String job){ this.job = job; }
    public void setArea(String area){ this.area = area; }
    public void setReligion(String religion){ this.religion = religion; }
    public void setHobby(String hobby){ this.hobby = hobby; }
    public void setPet(String pet){ this.pet = pet; }
    public void setMarry(String marry){ this.marry = marry; }
} 