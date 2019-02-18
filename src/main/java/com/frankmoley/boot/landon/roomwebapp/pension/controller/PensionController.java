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
import com.frankmoley.boot.landon.roomwebapp.pension.model.Member;
import com.frankmoley.boot.landon.roomwebapp.pension.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PensionController {

	@Autowired
	AdminService adminService;
	

    @RequestMapping("/rooms")
    public List<AdminModel> selectListAdmin(AdminModel adminModel) {
    	System.out.println("addate : ++++++++++++");
       	adminModel.setRoomId("1");
    	adminModel.setBedInfo("2");
    	adminModel.setName("aaa");
    	adminModel.setRoomNumber("3");
    	
        List<AdminModel> list = adminService.selectListAdmin(adminModel);  
       
        System.out.println("addate : "+list.get(0).getRoomId());
    	return list;
    	
    }
    @RequestMapping("/getId")
    public String getMemberById(AdminModel adminModel) {
    	System.out.println("addate : ++++++++++++");
	
        Member rooms = adminService.getMemberById("1");  
       
        System.out.println("addate : "+rooms);
    	return "rooms";
    	
    }
    @RequestMapping("/list")
    public Map<String, String> list(){
        Map<String, String > map = new HashMap<>();
        map.put("row","제대로 나오고 있어용 ");
       
        return map;
    }

}
