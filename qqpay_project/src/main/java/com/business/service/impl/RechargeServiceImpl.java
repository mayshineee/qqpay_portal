package com.business.service.impl;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.business.dao.mapper.RechargeMapper;
import com.business.pojo.po.Order;
import com.business.pojo.po.Product;
import com.business.pojo.po.Stock;
import com.business.service.RechargeService;
import com.common.util.UUIDBuild;


@Service("recharge")
public class RechargeServiceImpl implements RechargeService {


	@Autowired
	private RechargeMapper recharge;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,
	isolation=Isolation.READ_COMMITTED,
	rollbackFor = { Exception.class })
	public int insertRechargeService(String productId, Integer stockNumber)  {
		int result1=0;
		int result2=0;
		try{	
			Stock stock=new Stock();

			//把前台需要更改的商品ID以及数量存到Stock对象中
			stock.setProductId(productId);
			stock.setStockNumber(stockNumber);

			//更新仓库存储表
			result1 =recharge.recharge(stock);


			Product product =new Product();
			product.setProductId(productId);



			//查询当前提交的商品单价
			ArrayList list=(ArrayList)recharge.selectProductPrice(product);
			Product productPrice= (Product)list.get(0);

			//计算出购买的总数
			float totel=stockNumber.intValue()*productPrice.getProductPrice();

			
			

			Order order =new Order();

			order.setId(UUIDBuild.getUUID());
			//用户ID 现在先测试  后面使用session中得到
			order.setUserId("1");
			//商品ID
			order.setProductId(productId);
			//购买数量
			order.setProductNumber(stockNumber);
			//购买总数
			order.setTotalPrice(totel);
			//购买时间
			order.setDealTime(new Date());
			//购买状态
			order.setOrderStatus("success");

			//插入订单
			result2=recharge.insertOrder(order);
		}
		catch (Exception e){

		}

		finally{


		}

		return result1+result2;
	}

}
