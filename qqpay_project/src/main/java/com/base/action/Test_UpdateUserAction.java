package com.base.action;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.pojo.po.User;
import com.base.service.impl.UpdateUserServiceImpl;

@Controller
public class Test_UpdateUserAction {
	//调用SERVICE层
	@Autowired
	private UpdateUserServiceImpl updateUserServiceImpl;
	
	@RequestMapping("/textUpdateUser")
	public String textUpdateUser(User user) throws Exception{
	 		
		//导入当前系统时间
		user.setRegisterTime(new Date());
		
		int result=updateUserServiceImpl.updateUserService(user);
		
		if(result!=0){
			
			return "/updatesuccess";			
		}
		
		else{
			
			return "/updatefail";			
		}
		
	}

}
