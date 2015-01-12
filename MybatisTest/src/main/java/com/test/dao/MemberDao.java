package com.test.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.test.mybatis.Member;
import com.test.mybatis.MemberMapper;

@Repository
public class MemberDao extends BaseDao {
	
	public ArrayList<Member> getMembers() {
		ArrayList<Member> result = new ArrayList<Member>();
		MemberMapper memberMapper = getSqlSession().getMapper(MemberMapper.class);
		//getMember()의 메소드명과 mapper.mxl과 id는 동일해야한다. 
		result = memberMapper.getMembers();
		
		return result;
	}	

	public void insertMember(Member member) {
		MemberMapper memberMapper = getSqlSession().getMapper(MemberMapper.class);
		memberMapper.insertMember(member);
	}	
	
	public void updateMember(String name) {
		// TODO Auto-generated method stub
	}

	public void deleteMember(String name) {
		MemberMapper memberMapper = getSqlSession().getMapper(MemberMapper.class);
		memberMapper.deleteMember(name);
	}	
}