package com.common.util;

import java.util.ArrayList;
import java.util.List;

public class ListWrapper<T> {
	
	private List<T> list = new ArrayList<T>();

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	

}
