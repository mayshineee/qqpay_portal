package com.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.service.impl.DeleteUserService;
/**
 * 
 * @author zjx
 *
 */
@Controller
public class DeleteUser {

	@Autowired
	private DeleteUserService deleteUserService;
	
	@RequestMapping("/deleteUser1")
	public void deleteUser1(){
		/*deleteUserService.deleteUser("522b67a745404a529783fc3292089b11");*/
	}
}
