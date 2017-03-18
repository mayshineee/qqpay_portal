package com.base.service;

import com.base.pojo.vo.UserSelectCustom;

public interface LoginUserService {
	
	/**
	 * 校验用户信息
	 * @param userid
	 * @return 
	 * @throws Exception
	 */
	public UserSelectCustom checkUserByName(String userName,String pwd) throws Exception;

}
