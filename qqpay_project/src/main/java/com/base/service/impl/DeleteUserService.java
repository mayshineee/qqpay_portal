package com.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mapper.DeleteUserMapper;
import com.base.dao.mapper.UserMapper;
import com.base.dao.mapper.User_RoleMapper;
import com.base.dao.mapper.User_StatusMapper;
import com.base.pojo.po.User;
import com.base.pojo.po.User_Role;
import com.base.pojo.po.User_Status;
import com.base.pojo.po.User_StatusExample;
import com.business.dao.mapper.OrderMapper;
import com.business.pojo.po.Order;
/**
 * 
 * @author zjx
 *
 */
public class DeleteUserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeleteUserMapper deleteUserMapper;
	
	public int deleteUser(String userId){
		User user = userMapper.selectByPrimaryKey(userId);
		if(user == null){
			return 0;
		}else{
			deleteUserMapper.deleteOrder(userId);
			deleteUserMapper.deleteUser_Role(userId);
			deleteUserMapper.deleteUser_Status(userId);
			int ret = deleteUserMapper.deleteUser(userId);
			return ret;
		}
		
	}
}
