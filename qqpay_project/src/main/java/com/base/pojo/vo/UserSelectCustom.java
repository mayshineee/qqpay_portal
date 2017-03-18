package com.base.pojo.vo;

import java.util.Date;

import lombok.Data;

import com.base.pojo.po.User;

@Data
public class UserSelectCustom extends User {
	
	String role_id;
	
	String role_name;
	
	Integer OPERATION_TIMES;
	
	Date LAST_OPERATION_TIME;
 
	
	String userstatusid;
	
	

	public String getUserstatusid() {
		return userstatusid;
	}

	public void setUserstatusid(String userstatusid) {
		this.userstatusid = userstatusid;
	}
 
 

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Integer getOPERATION_TIMES() {
		return OPERATION_TIMES;
	}

	public void setOPERATION_TIMES(Integer oPERATION_TIMES) {
		OPERATION_TIMES = oPERATION_TIMES;
	}

	public Date getLAST_OPERATION_TIME() {
		return LAST_OPERATION_TIME;
	}

	public void setLAST_OPERATION_TIME(Date lAST_OPERATION_TIME) {
		LAST_OPERATION_TIME = lAST_OPERATION_TIME;
	}
	
	

}
