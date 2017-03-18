package com.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.pojo.vo.UserSelectCustom;
import com.base.service.UserSelectService;
import com.common.util.ListWrapper;

@Controller
@RequestMapping("/user")
public class UserSelectAction {
	
	@Autowired
	private UserSelectService userSelectService;
	
	@RequestMapping("/userSelect")
	public @ResponseBody ListWrapper<UserSelectCustom> selectUserCustomList(UserSelectCustom userSelectCustom ) throws Exception{
	 
		
		List<UserSelectCustom> list = userSelectService.selectUserCustomList(userSelectCustom);
		
		ListWrapper<UserSelectCustom> userList = new ListWrapper<UserSelectCustom>();
		
		userList.setList(list);
		
		return userList;
		
	}

}
