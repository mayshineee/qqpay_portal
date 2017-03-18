package com.business.pojo.po;

public class ProductStock {
	
	private String P_NAME;
	private String P_PRICE;
	private String S_NUMBER;
	
	public String getP_NAME() {
		return P_NAME;
	}
	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}
	public String getP_PRICE() {
		return P_PRICE;
	}
	public void setP_PRICE(String p_PRICE) {
		P_PRICE = p_PRICE;
	}
	public String getS_NUMBER() {
		return S_NUMBER;
	}
	public void setS_NUMBER(String s_NUMBER) {
		S_NUMBER = s_NUMBER;
	}
	@Override
	public String toString() {
		return "ProductStock [P_NAME=" + P_NAME + ", P_PRICE=" + P_PRICE
				+ ", S_NUMBER=" + S_NUMBER + "]";
	}
}
