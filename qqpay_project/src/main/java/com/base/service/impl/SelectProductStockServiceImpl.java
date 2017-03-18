package com.base.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.mapper.SelectProductStockDao;
import com.base.pojo.vo.SelectProductStock;
import com.base.service.SelectProductStockService;





@Service("service")
public class SelectProductStockServiceImpl implements SelectProductStockService {
	
	@Autowired
	private SelectProductStockDao selectProductStockDao;

	@Override
	public List<SelectProductStock> selectProductStockService()
			throws Exception {
		List<SelectProductStock> select = selectProductStockDao.selectProductStockDao();
		return select;
	}

	

	
	

	

	
	


	
	

}
