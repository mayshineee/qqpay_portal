package com.base.dao.mapper;

import java.util.List;

import com.base.pojo.po.User;

public interface InsertUserMapper {

	
	//通过用户名判断是否存在
	public List<User> selectUser(String userName);
	
	//插入数据
	public int insertUser(User user);
	
}
