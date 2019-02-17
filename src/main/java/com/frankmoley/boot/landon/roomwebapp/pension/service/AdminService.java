package com.frankmoley.boot.landon.roomwebapp.pension.service;

import java.util.List;

import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;

public interface AdminService {

    public List<AdminModel> selectListAdmin(AdminModel adminModel);
    
}
