package com.base.action;

 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.pojo.po.User;
import com.base.pojo.vo.ActiveUser;
import com.base.pojo.vo.UserSelectCustom;
import com.base.service.LoginUserService;
import com.common.util.SysMessage;

@Controller
@RequestMapping("/user")
public class LoginAction {
	
	@Autowired
	LoginUserService  loginUserService;
	
	/**
	 * 用户登录
	 */
	@RequestMapping("/login")
	public @ResponseBody SysMessage login(User user, HttpSession session, String validateCode) throws Exception{
		
		List <Map> list = new ArrayList<Map>();
		SysMessage sysMessage = new SysMessage();
		
		String username = user.getUserName();
		String pwd = user.getPassword();
		
		if(username==null||username.trim().equals("")){
			
			String message = "用户名必须填写";
			list = this.setMsg(message, list);
			sysMessage.setMessageList(list);
			return sysMessage;
			
		}
		
		if(pwd==null||pwd.trim().equals("")){
			
			String message = "密码必须填写";
			list = this.setMsg(message, list);
			sysMessage.setMessageList(list);
			return sysMessage;
			
		}
		
		if (validateCode==null||validateCode.trim().equals("")||!validateCode.trim().equals(session.getAttribute("validateCode"))){
			
			String message = "验证码为空或验证码错误";
			list = this.setMsg(message, list);
			sysMessage.setMessageList(list);
			return sysMessage;
		}
		
		UserSelectCustom userSelectCustom = new UserSelectCustom();
		
		try{
			
		userSelectCustom = loginUserService.checkUserByName(username, pwd);
		
		}catch (Exception e){
			e.printStackTrace();
			
			String message = e.getLocalizedMessage();
			list=this.setMsg(message, list);
			sysMessage.setMessageList(list);
			return sysMessage;
		}
		
		
		
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(userSelectCustom.getUserId());
		activeUser.setRoleid(userSelectCustom.getRole_id());
		activeUser.setUsername(userSelectCustom.getUserName());
		activeUser.setRolename(userSelectCustom.getRole_name());
		activeUser.setLastOperationTime(userSelectCustom.getLAST_OPERATION_TIME());
		activeUser.setOperationTime(userSelectCustom.getOPERATION_TIMES());
		
		session.setAttribute("activeUser", activeUser);
		
		String message = "登录成功";
		
	 	list=this.setMsg(message, list);
	 	sysMessage.setMessageList(list);
		sysMessage.setSuccess("1");
		return sysMessage;
		
	}
	
	/**
	 * 异常信息包装方法
	 * @param message
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public List<Map> setMsg(String message, List<Map>list) throws Exception{
		
		Map map = new HashMap();
		map.put("message", message);
		list.add(map);
		return list;
		 
	}

 
}
