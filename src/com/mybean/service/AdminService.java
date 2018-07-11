package com.mybean.service;

import java.util.List;

import com.mybean.data.Admin;

public interface AdminService {
	
	public void add(Admin admin);		//增
	public void delete(int aId);		//删
	public void update(Admin admin);	//改
	public Admin get(int aId);			//查
	public List<Admin> list();			//获取所有
}
