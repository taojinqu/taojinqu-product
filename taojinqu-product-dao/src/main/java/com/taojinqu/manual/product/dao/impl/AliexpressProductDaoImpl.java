package com.taojinqu.manual.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taojinqu.manual.product.dao.IAliexpressProductDao;
import com.taojinqu.manual.product.dao.mapper.IAliexpressProductMapper;
import com.taojinqu.manual.product.dao.po.AliexpressProductPO;

@Repository("aliexpressProductDao")
@Transactional(value = "mytx", rollbackFor = { Exception.class })
public class AliexpressProductDaoImpl implements IAliexpressProductDao {

	@Autowired
	private IAliexpressProductMapper aliProductMapper;

	@Override
	public Integer insert(AliexpressProductPO model) {
		return aliProductMapper.insert(model);
	}

	@Override
	public Integer insertBatch(List<AliexpressProductPO> modelList) {
		return aliProductMapper.insertBatch(modelList);
	}

	@Override
	public AliexpressProductPO getAliexpressProduct(Integer accountId, String productId) {
		return aliProductMapper.getAliexpressProduct(accountId, productId);
	}

	@Override
	public Integer updateAliexpressProductById(AliexpressProductPO model) {
		return aliProductMapper.updateAliexpressProductById(model);
	}
}
