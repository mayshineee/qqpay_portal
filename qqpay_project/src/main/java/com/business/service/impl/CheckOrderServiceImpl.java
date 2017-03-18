package com.business.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.business.dao.mapper.CheckOrderMapper;
import com.business.pojo.po.CheckOrderRequest;
import com.business.pojo.po.CheckOrderResponse;
import com.business.pojo.po.CheckOrderResponseRs;
import com.common.util.AsssempeldDate;

/**
 * 查询用户的订单记录
 * 
 * @author zjx
 *
 */

public class CheckOrderServiceImpl implements CheckOrderService {

	@Autowired
	private CheckOrderMapper checkOrderMapper;

	private CheckOrderRequest checkOrderRequest;

	
	/**
	 * 根据用户提交或默认的查询条件来进行查询订单记录
	 */
	@Override
	public CheckOrderResponse findSubmitCondition(int currentPage, int selectKind, int pageSize, int selectStartYear,
			int selectStartMonth, int selectStartDay, int selectEndYear, int selectEndMonth, int selectEndDay,
			String userId) {
		CheckOrderResponse checkOrderResponse;
		String selectKind1 = "" + selectKind;
		String selectStartTime = AsssempeldDate.assempldDate(selectStartYear, selectStartMonth, selectStartDay);
		String selectEndTime = AsssempeldDate.assempldDate(selectEndYear, selectEndMonth, selectEndDay);
		checkOrderRequest = new CheckOrderRequest();
		checkOrderRequest.setCheckStartDate(selectStartTime);
		checkOrderRequest.setCheckEndDate(selectEndTime);
		checkOrderRequest.setSelectKind(selectKind1);
		checkOrderRequest.setPageSize(pageSize);
		checkOrderRequest.setCurrentPage(currentPage);
		checkOrderRequest.setUserId(userId);
		checkOrderResponse = ((List<CheckOrderResponse>) checkOrderMapper.checkSumPriceAndCount(checkOrderRequest))
				.get(0);
		List<CheckOrderResponseRs> resultList = checkOrderMapper.conditionCheck(checkOrderRequest);
		checkOrderResponse.setResultList(resultList);
		return checkOrderResponse;
	}

	/**
	 * 用户进行翻页时进行订单记录的查询
	 */
	@Override
	public CheckOrderResponse findPaging(int currentPage, int selectKind, int pageSize, int selectStartYear,
			int selectStartMonth, int selectStartDay, int selectEndYear, int selectEndMonth, int selectEndDay,
			String userId) {
		CheckOrderResponse checkOrderResponse;
		String selectKind1 = "" + selectKind;
		String selectStartTime = AsssempeldDate.assempldDate(selectStartYear, selectStartMonth, selectStartDay);
		String selectEndTime = AsssempeldDate.assempldDate(selectEndYear, selectEndMonth, selectEndDay);
		checkOrderRequest = new CheckOrderRequest();
		checkOrderRequest.setCheckStartDate(selectStartTime);
		checkOrderRequest.setCheckEndDate(selectEndTime);
		checkOrderRequest.setSelectKind(selectKind1);
		checkOrderRequest.setPageSize(pageSize);
		checkOrderRequest.setCurrentPage(currentPage);
		checkOrderRequest.setUserId(userId);
		checkOrderResponse = ((List<CheckOrderResponse>) checkOrderMapper.checkSumPriceAndCount(checkOrderRequest))
				.get(0);
		List<CheckOrderResponseRs> resultList = checkOrderMapper.conditionCheck(checkOrderRequest);
		checkOrderResponse.setResultList(resultList);
		return checkOrderResponse;
	}

}
