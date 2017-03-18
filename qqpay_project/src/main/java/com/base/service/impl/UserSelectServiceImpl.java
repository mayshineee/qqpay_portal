package com.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.base.dao.mapper.UserSelectCustomMapper;
import com.base.pojo.vo.UserSelectCustom;
import com.base.service.UserSelectService;

public class UserSelectServiceImpl implements UserSelectService {
	
	@Autowired
	private UserSelectCustomMapper userSelectCustomMapper;
	
	public List<UserSelectCustom> selectUserCustomList(UserSelectCustom userSelectCustom) throws Exception{
		
		return userSelectCustomMapper.selectUserCustomList( userSelectCustom);
		
	}

}
