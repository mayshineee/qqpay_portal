package com.business.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.business.pojo.po.Stock;
import com.business.service.RechargeService;

@Controller("rechargeAction")
public class RechargeAction {

	@Autowired
	private RechargeService rechargeService;
	
	@RequestMapping("recharge")
	public String testRecharge(Stock stock) throws Exception {
		
		
		int result=rechargeService.insertRechargeService(stock.getProductId(), stock.getStockNumber());
		
		if(result==2){
			
			return "success";
		}
		
		
		return "fail";
	}
	
}
