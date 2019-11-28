package com.example.test.db.mapper;

import com.example.test.db.dto.UserDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinMapper implements InitMapper{

	@Autowired
	private SqlSession sqlSession;

    @Override
	public String selectNickname(){
		return sqlSession.selectOne("join.selectNickname");
    }
    @Override
    public String selectId(){
    return sqlSession.selectOne("join.selectId");
    }
    @Override
    public String selectAll(){
		return (sqlSession.selectList("join.selectAll")).toString();
    }
    @Override  
    public void insertUser(UserDTO userDTO){
    System.out.println("==============================================");
    System.out.println("userDTO.gender" + userDTO.getGender());
    System.out.println("userDTO.job" + userDTO.getJob());
    sqlSession.insert("join.insertUser", userDTO);
    }
}