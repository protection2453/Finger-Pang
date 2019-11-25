package com.example.test.command;

import javax.validation.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class joinStepAllCommand{

    @Column
    @NotEmpty(message="닉네임을 입력해주세요.")
    private String nickname;

    @Column
    @NotEmpty(message="아이디를 입력해주세요.")
    private String id;

    @Column
    @NotEmpty(message="비밀번호를 입력해주세요.")
    private String password;

    @Column
    @NotEmpty(message="비밀번호를 재입력해주세요.")
    private String password_confirm;

    public boolean isPwEqualToCheckPw(){
        return password.equals(password_confirm);
    }
} 