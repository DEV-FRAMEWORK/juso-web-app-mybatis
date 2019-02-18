package com.frankmoley.boot.landon.roomwebapp.pension.service;

import java.util.List;

import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;
import com.frankmoley.boot.landon.roomwebapp.pension.model.Member;

public interface AdminService {

    public List<AdminModel> selectListAdmin(AdminModel adminModel);
    
    public Member getMemberById(String id);
    
}
