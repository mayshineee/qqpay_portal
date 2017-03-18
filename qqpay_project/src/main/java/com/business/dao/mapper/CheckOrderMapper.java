package com.business.dao.mapper;

import java.util.List;

import com.business.pojo.po.CheckOrderRequest;
import com.business.pojo.po.CheckOrderResponse;
import com.business.pojo.po.CheckOrderResponseRs;

public interface CheckOrderMapper {

	List<CheckOrderResponseRs> conditionCheck(CheckOrderRequest checkOrderRequest);

	List<CheckOrderResponse> checkSumPriceAndCount(CheckOrderRequest checkOrderRequest);
}
