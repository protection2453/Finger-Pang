package com.example.test.command;

import javax.validation.constraints.NotEmpty;
import javax.persistence.Entity;

@Entity
public class JoinStep2Command{
    @NotEmpty(message="전체 동의를 해주세요.(1/2)")
    private boolean join_check1;

    @NotEmpty(message="전체 동의를 해주세요.(2/2)")
    private boolean join_check2;

    public boolean getCheck1(){
        return join_check1;
    }
    public boolean getCheck2(){
        return join_check2;
    }
    public void setCheck1(boolean check1){
        this.join_check1 = check1;
    }
    public void setCheck2(boolean check2){
        this.join_check2 = check2;
    }
    public void setCheckAll(boolean checkAll){
        this.join_check1 = checkAll;
        this.join_check2 = checkAll;
    }
} 