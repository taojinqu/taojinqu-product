package com.taojinqu.manual.product.dao;

import java.util.List;

import com.taojinqu.manual.product.dao.po.AliexpressProductPO;

public interface IAliexpressProductDao {

	Integer insert(AliexpressProductPO model);

	Integer insertBatch(List<AliexpressProductPO> modelList);

	AliexpressProductPO getAliexpressProduct(Integer accountId, String productId);

	Integer updateAliexpressProductById(AliexpressProductPO model);
}
