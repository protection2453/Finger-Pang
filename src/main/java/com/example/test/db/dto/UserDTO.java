package com.example.test.db.dto;

// 회원 세션 정보 유지
public class UserDTO{
    private int IDX;
    private String ID;
    private String PASSWORD;
    private String NICKNAME;
    private int GENDER;
    private int AGE;
    private int JOB;
    private int AREA;
    private int RELIGION;
    private int HOBBY;
    private int PET;
    private int MARRY;
    private int GRADE_POINT;
    private int CREDIT;

    public boolean matchPassword(String pw){
        return this.PASSWORD.equals(pw);
    }
    public UserDTO(String id, String password, String nickname, int gender, int age, int job, int area, int religion
    , int hobby, int pet, int marry, int grade_point, int credit){
        this.ID = id;
        this.NICKNAME = nickname;
        this.PASSWORD = password;
        this.GENDER = gender;
        this.AGE = age;
        this.JOB = job;
        this.AREA = area;
        this.RELIGION = religion;
        this.HOBBY = hobby;
        this.PET = pet;
        this.MARRY = marry;
        this.GRADE_POINT = grade_point;
        this.CREDIT = credit;
    }

    public String getId(){ return ID; }
    public String getNickname(){ return NICKNAME; }
    public int getGender(){ return GENDER; }
    public int getAge(){ return AGE; }
    public int getJob(){ return JOB; }
    public int getArea(){ return AREA; }
    public int getReligion(){ return RELIGION; }
    public int getHobby(){ return HOBBY; }
    public int getPet(){ return PET; }
    public int getMarry(){ return MARRY; }
    public int getGradepoint(){ return GRADE_POINT; }
    public int getCredit(){ return CREDIT; }

    public void setId(String id){ this.ID = id; }
    public void setNickname(String nickname){ this.NICKNAME = nickname; }
    public void setPassword(String password ){ this.PASSWORD = password; }
    public void setGender(int gender){ this.GENDER = gender; }
    public void setAge(int age){ this.AGE = age; }
    public void setJob(int job){ this.JOB = job; }
    public void setArea(int area){ this.AREA = area; }
    public void setReligion(int religion){ this.RELIGION = religion; }
    public void setHobby(int hobby){ this.HOBBY = hobby; }
    public void setPet(int pet){ this.PET = pet; }
    public void setMarry(int marry){ this.MARRY = marry; }
    public void setGradepoint(int grade_point){ this.GRADE_POINT = grade_point; }
    public void setCredit(int credit){ this.CREDIT = credit; }
    
}