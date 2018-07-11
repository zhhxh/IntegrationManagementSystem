package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Admin;

public interface AdminMapper {
	public void add(Admin admin);		//增
	public void delete(int id);			//删
	public void update(Admin admin);	//改
	public Admin get(int id);			//查
	public List<Admin> list();			//获取所有
}
