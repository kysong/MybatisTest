package com.test.mybatis;

import java.util.ArrayList;

public interface MemberDAO {

	/* 인터페이스 */ 
	public ArrayList<Member> getMembers();
	public void insertMember(Member member);
	public void updateMember(String name);
	public void deleteMember(String name);

}
   