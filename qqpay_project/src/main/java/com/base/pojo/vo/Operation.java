package com.base.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单下的操作模型类，配置菜单下各各操作链接是为了进行用户权限拦截
 * @author mrt
 *
 */
public class Operation implements Serializable {


	private static final long serialVersionUID = -5432351755716171044L;

	/**action的地�?*/
	private String actionUrl;
	
	/**操作的图标，暂时不用*/
	private String icon;
	
	/**操作的id，唯�?标识，暂时不�?*/
	private String operationId;
	
	/**操作的名�?*/
	private String operationName;

	public Operation(){
		
	}
	public Operation(String actionUrl){
		this.actionUrl = actionUrl;
	}
	
	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actionUrl == null) ? 0 : actionUrl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operation other = (Operation) obj;
		if (actionUrl == null) {
			if (other.actionUrl != null)
				return false;
		} else if (actionUrl.indexOf(other.actionUrl)<0 && other.actionUrl.indexOf(actionUrl)<0)
			return false;
		return true;
	}
	
	
	
	
	
}
