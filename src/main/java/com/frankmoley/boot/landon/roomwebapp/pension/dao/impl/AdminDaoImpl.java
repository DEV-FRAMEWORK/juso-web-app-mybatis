package com.frankmoley.boot.landon.roomwebapp.pension.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.frankmoley.boot.landon.roomwebapp.pension.dao.AdminDao;
import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;
import com.frankmoley.boot.landon.roomwebapp.pension.model.Member;

public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertAdminUser(Member member) {
		sqlSessionTemplate.insert("com.ktds.dao.AdminDao.insertAdminUser", member);
	}
	
	@Override
	public Member getUser(String username) {
		return sqlSessionTemplate.selectOne("com.ktds.dao.AdminDao.getMember");
	}

	@Override
	public void createMember(Member member) {
		
	}

	@Override
	public Member getMemberById(String id) {
		return sqlSessionTemplate.selectOne("com.ktds.dao.AdminDao.getMemberById", id);
	}

	@Override
	public List<Member> getMember() {
		return sqlSessionTemplate.selectList("com.ktds.dao.AdminDao.getMember");
	}

	public List<AdminModel> selectListAdmin(AdminModel adminModel) {
		return sqlSessionTemplate.selectList("com.ktds.dao.AdminDao.selectListAdmin", adminModel);
	}


}

