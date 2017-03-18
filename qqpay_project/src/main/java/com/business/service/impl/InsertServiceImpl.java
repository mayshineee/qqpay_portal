package com.business.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.mapper.InsertUserMapper;
import com.base.dao.mapper.UserMapper;
import com.base.pojo.po.User;
import com.business.service.InsertService;

@Service("service")
public class InsertServiceImpl implements InsertService {

	
	@Autowired
	private InsertUserMapper insertUser;
	
	@Override
	public int insert(User user) {
		
		int result=0;
		
		
		if(insertUser.selectUser(user.getUserName()).isEmpty()){
			
			//给插入数据添加当前时间
			user.setRegisterTime(new Date());
		
			
			//给数据库插入
			result=insertUser.insertUser(user);
		
		}
		
		return result;
	}

}
