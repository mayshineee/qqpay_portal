package com.base.dao.mapper;

/**
 * 
 * @author zjx
 *
 */
public interface DeleteUserMapper {
	
	int deleteUser(String userId);
	int deleteOrder(String userId);
	int deleteUser_Status(String userId);
	int deleteUser_Role(String userId);
}
