package com.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.mapper.UpdateUserDao;
import com.base.pojo.po.User;
import com.base.service.UpdateUserService;

@Service("service")
public class UpdateUserServiceImpl implements UpdateUserService{
	
	@Autowired
	private UpdateUserDao updateUserDao;
	
	@Override
	public int updateUserService(User user)throws Exception {
		
		int result=updateUserDao.updateUserDao(user);
		
		if(result!=0){
			
			return 1;
		}else {
			
			return 0;
		}
	}
	
	

}
