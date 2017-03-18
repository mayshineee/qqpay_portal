package com.business.service.impl;

import java.util.List;

import com.business.pojo.po.CheckOrderResponse;
/**
 * 订单查询
 * @author zjx
 *
 */
public interface CheckOrderService {
	
	/**
	 * 根据用户提交的查询条件来进行查询订单记录
	 * @param currentPage
	 * @param selectKind
	 * @param pageSize
	 * @param selectStartYear
	 * @param selectStartMonth
	 * @param selectStartDay
	 * @param selectEndYear
	 * @param selectEndMonth
	 * @param selectEndDay
	 * @param userId
	 * @return
	 */
	CheckOrderResponse findSubmitCondition(int currentPage, int selectKind, int pageSize, int selectStartYear,
			int selectStartMonth, int selectStartDay, int selectEndYear, int selectEndMonth, int selectEndDay,
			String userId);
	/**
	 * 用户进行翻页时进行订单记录的查询
	 * @param currentPage
	 * @param selectKind
	 * @param pageSize
	 * @param selectStartYear
	 * @param selectStartMonth
	 * @param selectStartDay
	 * @param selectEndYear
	 * @param selectEndMonth
	 * @param selectEndDay
	 * @param userId
	 * @return
	 */
	CheckOrderResponse findPaging(int currentPage, int selectKind, int pageSize, int selectStartYear,
			int selectStartMonth, int selectStartDay, int selectEndYear, int selectEndMonth, int selectEndDay,
			String userId);
}
