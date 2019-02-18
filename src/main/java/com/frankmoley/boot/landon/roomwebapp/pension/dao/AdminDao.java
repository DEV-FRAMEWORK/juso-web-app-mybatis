package com.frankmoley.boot.landon.roomwebapp.pension.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;
import com.frankmoley.boot.landon.roomwebapp.pension.model.Member;

//@Mapper
public interface AdminDao {
	
	public Member getMemberById(String id);


	public List<AdminModel> selectListAdmin(AdminModel adminModel); 

}

