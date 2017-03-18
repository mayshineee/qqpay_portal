package com.base.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.mapper.UserMapper;
import com.base.pojo.po.User;

@Service("service")
public class Test_service {
	
	@Autowired
	private UserMapper userMapper;
	
	public void testInsert (User user) throws Exception{
		
		userMapper.insert(user);
		
	}
	
	
	public void testSelectByPrimaryKey(User user){
		
	
		User us=userMapper.selectByPrimaryKey(user.getUserId());
		
	}
	

}
