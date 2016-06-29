package com.taojinqu.manual.product.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taojinqu.manual.product.dao.IAliexpressProductDao;
import com.taojinqu.manual.product.dao.po.AliexpressProductPO;
import com.taojinqu.manual.product.service.IAliexpressProductService;

@Service("aliProductService")
public class AliexpressProductServiceImpl implements IAliexpressProductService {

	private Logger logger = LoggerFactory.getLogger(AliexpressProductServiceImpl.class);

	@Autowired
	private IAliexpressProductDao aliexpressProductDao;

	@Override
	public Integer insert(AliexpressProductPO model) throws Exception {
		try {
			return aliexpressProductDao.insert(model);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}
}
