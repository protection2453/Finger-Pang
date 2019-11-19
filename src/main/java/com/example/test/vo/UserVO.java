package com.example.test.vo;

public class UserVO{

    private int IDX;
    private String ID;
    private String PASSWORD;
    private String NICKNAME;
    private int GENDER;
    private int AGE;
    private int JOB;
    private int AREA;
    private int RELIGION;

    //비밀번호 확인
    public boolean matchPassword(String pw){
        return this.PASSWORD.equals(pw);
    }

    public int getIdx() { return IDX; }
    public String getId(){ return ID; }
    public String getNickname(){ return NICKNAME; }
    public int getGender(){ return GENDER; }
    public int getAge(){ return AGE; }
    public int getJob(){ return JOB; }
    public int getArea(){ return AREA; }
    public int getReligion(){ return RELIGION; }

    public void setIdx(int IDX) {this.IDX = IDX; }
    public void setId(String ID){ this.ID = ID; }
    public void setNickname(String NICKNAME){ this.NICKNAME = NICKNAME; }
    public void setGender(int GENDER){ this.GENDER = GENDER; }
    public void setAge(int AGE){ this.AGE = AGE; }
    public void setJob(int JOB){ this.JOB = JOB; }
    public void setArea(int AREA){ this.AREA = AREA; }
    public void setReligion(int RELIGION){ this.RELIGION = RELIGION; }


}