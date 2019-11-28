package com.example.test.db.dto;

// 회원 세션 정보 유지
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class UserDTO{
    String user_id;
    String user_password;
    String user_nickname;
    String user_phone;
    String user_gender;
    String user_job;
    String user_area;
    String user_age;
    String user_religion;
    String user_hobby;
    String user_pet;
    String user_marry;
    String user_grade_point;
    String user_credit;

    @Override
    public String toString() {
        return "ApiDto [user_age=" + user_age + ", user_area=" + user_area + ", user_credit="
                + user_credit + ", user_gender=" + user_gender + ", user_grade_point=" + user_grade_point
                + ", user_hobby=" + user_hobby + ", user_id=" + user_id + ", user_job=" + user_job + ", user_marry="
                + user_marry + ", user_nickname=" + user_nickname + ", user_password=" + user_password + ", user_pet="
                + user_pet + ", user_phone=" + user_phone + ", user_religion=" + user_religion + "]";
    }

    public boolean matchPassword(String pw){
        return user_password.equals(pw);
    }

    public UserDTO(String user_id, String user_password, String user_nickname, String user_phone, String user_gender,
            String user_job, String user_area, String user_age, String user_religion, String user_hobby,
            String user_pet, String user_marry) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.user_nickname = user_nickname;
        this.user_phone = user_phone;
        this.user_gender = user_gender;
        this.user_job = user_job;
        this.user_area = user_area;
        this.user_age = user_age;
        this.user_religion = user_religion;
        this.user_hobby = user_hobby;
        this.user_pet = user_pet;
        this.user_marry = user_marry;
        this.user_grade_point = "0";
        this.user_credit = "0";
    }

    public String getId(){ return user_id; }
    public String getPassword(){ return user_password; }
    public String getNickname(){ return user_nickname; }
    public String getPhone(){ return user_phone; }
    public String getGender(){ return user_gender; }
    public String getAge(){ return user_age; }
    public String getJob(){ return user_job; }
    public String getArea(){ return user_area; }
    public String getReligion(){ return user_religion; }
    public String getHobby(){ return user_hobby; }
    public String getPet(){ return user_pet; }
    public String getMarry(){ return user_marry; }

    public void setId(String id){ this.user_id = id; }
    public void setNickname(String nickname){ this.user_nickname = nickname; }
    public void setPassword(String password ){ this.user_password = password; }
    public void setPhone(String phone){ this.user_phone = phone; }
    public void setGender(String gender){ this.user_gender = gender; }
    public void setAge(String age){ this.user_age = age; }
    public void setJob(String job){ this.user_job = job; }
    public void setArea(String area){ this.user_area = area; }
    public void setReligion(String religion){ this.user_religion = religion; }
    public void setHobby(String hobby){ this.user_hobby = hobby; }
    public void setPet(String pet){ this.user_pet = pet; }
    public void setMarry(String marry){ this.user_marry = marry; }
    
}