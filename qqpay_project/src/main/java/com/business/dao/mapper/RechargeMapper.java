package com.business.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.business.pojo.po.Order;
import com.business.pojo.po.Product;
import com.business.pojo.po.Stock;

public interface RechargeMapper {

	
	//定义商品充值后，库存表对应商品库存减少的数量
	public int recharge(@Param("stock") Stock stock);
	
	
	//根据商品的ID查询商品的单价
	public List<Product> selectProductPrice(@Param("product") Product product);
	
	
	//向订单表中插入订单表
	public int insertOrder(Order order);
	
	
	
}
