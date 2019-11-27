package com.example.test.db.config;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
 

@Configuration
@MapperScan(basePackages = "com.example.test.db.mapper.**", sqlSessionFactoryRef = "sqlSessionFactory")
@PropertySource("classpath:/application.properties")
public class DatabaseConfiguration{

    @Bean
    public SqlSessionFactory sqlSessionFactory (final DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage("com.example.test.db.dto");
        
        return sqlSessionFactory.getObject();
    }
    
    @Bean
    public SqlSessionTemplate sqlSession (final SqlSessionFactory sqlSessionFactory) {
        
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name="dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
	public DataSource dataSource() {
		return new HikariDataSource();
	}
}

