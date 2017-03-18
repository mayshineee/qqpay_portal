package com.common.util;

import java.util.List;
import java.util.Map;


public class SysMessage {
	
	private String message;
	
	private List<Map> messageList;
	
	private String success;
	
	

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Map> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Map> messageList) {
		this.messageList = messageList;
	}
	
	 
}
