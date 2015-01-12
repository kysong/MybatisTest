package com.test.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseDao extends SqlSessionDaoSupport {
	
	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@Resource(name="sqlSessionFactory")
	protected void setSuperSqlSessionFactory(SqlSessionFactory s) {
		log.info("##### called setSuperSqlSessionFactory()");
		super.setSqlSessionFactory(s);
	}

	protected void syslog(Object o) {
		
	}
	
	protected Object getObject(String query) {
		return getSqlSession().selectOne(query);
	}
	
	protected Object getList(String query) {
		return getSqlSession().selectList(query);
	}
	
	protected int update(String query) {
		return getSqlSession().update(query);
	}
	
	protected int update(String query, Object args) {
		return getSqlSession().update(query, args);
	}
	
}
