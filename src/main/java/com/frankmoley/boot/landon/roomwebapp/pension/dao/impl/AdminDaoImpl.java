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
	public Member getMemberById(String id) {
		return sqlSessionTemplate.selectOne("com.frankmoley.boot.landon.roomwebapp.pension.dao.AdminDao.getMemberById", id);
	}

	public List<AdminModel> selectListAdmin(AdminModel adminModel) {
		return sqlSessionTemplate.selectList("com.frankmoley.boot.landon.roomwebapp.pension.dao.AdminDao.selectListAdmin", adminModel);
	}


}

