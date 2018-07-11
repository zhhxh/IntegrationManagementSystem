package com.mybean.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Admin;
import com.mybean.service.AdminService;

@Controller
@RequestMapping("")
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@RequestMapping("listAdmin")
	 public ModelAndView listAdmin(){
        ModelAndView mav = new ModelAndView();
        Admin admin= adminservice.get(1);
         
        // 放入转发参数
        mav.addObject("Admin", admin);
        // 放入jsp路径
        mav.setViewName("listAdmin");
        return mav;
    }
}
