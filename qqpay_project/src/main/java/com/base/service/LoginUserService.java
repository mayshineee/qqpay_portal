package com.base.service;

import com.base.pojo.vo.UserSelectCustom;

public interface LoginUserService {
	
	/**
	 * У���û���Ϣ
	 * @param userid
	 * @return 
	 * @throws Exception
	 */
	public UserSelectCustom checkUserByName(String userName,String pwd) throws Exception;

}
