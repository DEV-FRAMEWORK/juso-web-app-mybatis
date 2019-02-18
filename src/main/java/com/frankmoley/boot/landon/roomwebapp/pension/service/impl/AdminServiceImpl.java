package com.frankmoley.boot.landon.roomwebapp.pension.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frankmoley.boot.landon.roomwebapp.pension.dao.AdminDao;
import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;
import com.frankmoley.boot.landon.roomwebapp.pension.model.Member;
import com.frankmoley.boot.landon.roomwebapp.pension.service.AdminService; 


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;
	
	public List<AdminModel> selectListAdmin(AdminModel adminModel){
		return adminDao.selectListAdmin(adminModel);
	};
	
	public Member getMemberById(String id){
		return adminDao.getMemberById(id);
	};
}
