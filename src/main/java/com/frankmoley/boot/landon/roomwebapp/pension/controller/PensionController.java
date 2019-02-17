package com.frankmoley.boot.landon.roomwebapp.pension.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.math.NumberUtils;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.boot.landon.roomwebapp.pension.model.AdminModel;
import com.frankmoley.boot.landon.roomwebapp.pension.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PensionController {

	@Autowired
	AdminService adminService;
	

    @RequestMapping("/selectListAdmin")
  //  @PreAuthorize("hasAnyRole('ADMIN')")
    public String selectListAdmin(@RequestParam Map<String, String> param, AdminModel adminModel, Model model) {

        List<AdminModel> list = adminService.selectListAdmin(adminModel);  
       
        System.out.println("addate : "+list.get(0).getAdminId());
    	return "rooms";
    	
    }

}
