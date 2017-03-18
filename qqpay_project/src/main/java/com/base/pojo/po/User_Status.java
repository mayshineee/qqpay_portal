package com.base.pojo.po;

import java.util.Date;

public class User_Status {
    private String id;

    private String userId;

    private String userName;

    private Integer operationTimes;

    private Date lastOperationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getOperationTimes() {
        return operationTimes;
    }

    public void setOperationTimes(Integer operationTimes) {
        this.operationTimes = operationTimes;
    }

    public Date getLastOperationTime() {
        return lastOperationTime;
    }

    public void setLastOperationTime(Date lastOperationTime) {
        this.lastOperationTime = lastOperationTime;
    }
}