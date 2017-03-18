package com.business.pojo.po;

import java.util.List;

public class CheckOrderResponse {
	private Double sumPrice;
	private int totalCount;
	private List<CheckOrderResponseRs> resultList;
	public Double getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(Double sumPrice) {
		this.sumPrice = sumPrice;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<CheckOrderResponseRs> getResultList() {
		return resultList;
	}
	public void setResultList(List<CheckOrderResponseRs> resultList) {
		this.resultList = resultList;
	}
	@Override
	public String toString() {
		return "CheckOrderResponse [sumPrice=" + sumPrice + ", totalCount=" + totalCount + ", resultList=" + resultList
				+ "]";
	}
	
}
