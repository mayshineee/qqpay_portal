package com.business.pojo.po;

import java.util.Date;

/**
 * 用来存放订单查询中,从数据库返回的数据
 * @author zjx
 *
 */
public class CheckOrderResponseRs {
	private String id;//订单ID
	private String username;//用户名称
	private String productName;//商品名称
	private Integer productNumber;//商品数量
	private Double totalPrice;//交易金额
	private Date dealTime;//交易时间
	private String orderStatus;//订单状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "CheckOrderResponse [id=" + id + ", username=" + username + ", productName=" + productName
				+ ", productNumber=" + productNumber + ", totalPrice=" + totalPrice + ", dealTime=" + dealTime
				+ ", orderStatus=" + orderStatus + "]";
	}
}
