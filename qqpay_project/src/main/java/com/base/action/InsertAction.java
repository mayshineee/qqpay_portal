package com.base.action;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.pojo.po.User;
import com.business.service.InsertService;

@Controller("contorl")
public class InsertAction {

	@Autowired
	private InsertService service;
	
	@RequestMapping("insert")
	public String testInsert(User user){
		
		
		int count=service.insert(user);
		
		if(count!=0){
			
			//跳转成功页面，显示插入成功
			return "success";
		}else{
			
			//跳转失败页面，显示用户名已经存在
			return "fail";
		}
	}
	
}
