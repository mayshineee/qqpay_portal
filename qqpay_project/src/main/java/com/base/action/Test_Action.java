package com.base.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.pojo.po.User;
import com.base.service.impl.Test_service;
import com.common.util.UUIDBuild;

@Controller
@RequestMapping("/test")
public class Test_Action {
	
	@Autowired
	private Test_service test_service;
	
	@RequestMapping("/testInsert")
	public void testInsert( ) throws Exception{
		User u = new User();
		u.setPassword("123");
		u.setRegisterTime(new Date());
		u.setUserName("joker");
		u.setUserId(UUIDBuild.getUUID());
		
		test_service.testInsert(u);
		
	}
	
 
 
	
	@RequestMapping("/testTree")
	public @ResponseBody List<Map<String, String>> testTree( ) throws Exception{
		Map<String, String>  map = new HashMap<String, String> ();
		map.put("id", "0");
		map.put("pId", "");
		map.put("name", "jack");
		
		Map<String, String>  map1 = new HashMap<String, String> ();
		map1.put("id", "1");
		map1.put("pId", "0");
		map1.put("name", "jack_son");
		
		Map<String, String>  map2 = new HashMap<String, String> ();
		map2.put("id", "2");
		map2.put("pId", "1");
		map2.put("name", "jack_grandson");
		
		/*Map<String, Map> maps = new HashMap<String, Map>();
		maps.put("jack",  map);
		maps.put("tom",  map1);
		maps.put("phly",  map2);*/
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		return list;
		
		
 
	} 

  
}
