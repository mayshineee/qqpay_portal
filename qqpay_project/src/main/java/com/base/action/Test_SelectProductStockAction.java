package com.base.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.pojo.vo.SelectProductStock;
import com.base.service.impl.SelectProductStockServiceImpl;

@Controller
public class Test_SelectProductStockAction{
	
	@Autowired
	private SelectProductStockServiceImpl selectProductStockServiceImpl;
	
	@RequestMapping("/textSelectProductStock")
	public String selectSelectProductStock(HttpServletRequest request,HttpServletResponse response ) throws Exception{
		
		
		List<SelectProductStock>  list =  selectProductStockServiceImpl.selectProductStockService();
		
		request.setAttribute("productList", list);
		
		return "/projectMap";
		
	}
}
