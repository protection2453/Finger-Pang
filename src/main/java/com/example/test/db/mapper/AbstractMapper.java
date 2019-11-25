package com.example.test.db.mapper;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractMapper {
    protected Log log = LogFactory.getLog(AbstractMapper.class); 

    @Autowired
    private SqlSessionTemplate sqlSession; 
    protected void printQueryId(String queryId) { 
        if(log.isDebugEnabled()){ 
            log.debug("\t QueryId \t: " + queryId); 
        } 
    } 
    public Object insert(String queryId, Object params){ 
        printQueryId(queryId); 
        return sqlSession.insert(queryId, params); 
    } 
    public void insertMember(String queryId, Object... params){
        printQueryId(queryId);
        sqlSession.insert(queryId, params);
    }
    public Object update(String queryId, Object params){ 
        printQueryId(queryId); 
        return sqlSession.update(queryId, params); 
    } 
    public Object delete(String queryId, Object params){ 
        printQueryId(queryId); 
        return sqlSession.delete(queryId, params); 
    } 
    public Object selectOne(String queryId){ 
        printQueryId(queryId); 
        return sqlSession.selectOne(queryId); 
    } 
    public Object selectOne(String queryId, Object params){ 
        printQueryId(queryId); 
        return sqlSession.selectOne(queryId, params); 
    } 
    @SuppressWarnings("rawtypes") 
    public List selectList(String queryId){ 
        printQueryId(queryId); 
        return sqlSession.selectList(queryId); 
    } 
    @SuppressWarnings("rawtypes") 
    public List selectList(String queryId, Object params){ 
        printQueryId(queryId); 
        return sqlSession.selectList(queryId,params); 
    } 
}

