package com.business.pojo.po;

public class CheckOrderRequest {
	private String checkStartDate;
	private String checkEndDate;
	private String selectKind;
	private int currentPage;
	private int pageSize;
	private String userId;
	public String getCheckStartDate() {
		return checkStartDate;
	}
	public void setCheckStartDate(String checkStartDate) {
		this.checkStartDate = checkStartDate;
	}
	public String getCheckEndDate() {
		return checkEndDate;
	}
	public void setCheckEndDate(String checkEndDate) {
		this.checkEndDate = checkEndDate;
	}
	public String getSelectKind() {
		return selectKind;
	}
	public void setSelectKind(String selectKind) {
		this.selectKind = selectKind;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "CheckOrderRequest [checkStartDate=" + checkStartDate + ", checkEndDate=" + checkEndDate
				+ ", selectKind=" + selectKind + ", currentPage=" + currentPage + ", pageSize=" + pageSize + ", userId="
				+ userId + "]";
	}
	
}
