package com.taojinqu.manual.product.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.taojinqu.manual.product.ProductApp;
import com.taojinqu.manual.product.adapter.AliexpressProductAdapter;
import com.taojinqu.manual.product.dao.po.AliexpressProductPO;
import com.taojinqu.manual.product.js.ReadTestJsFile;
import com.taojinqu.manual.product.util.CompressUtil;
import com.taojinqu.manual.product.vo.AliListingProductMessageVO;
import com.taojinqu.manual.product.vo.AliListingProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductApp.class)
public class AliexpressProductServiceTest extends BaseTest {

	@Autowired
	private IAliexpressProductService aliProductService;

	@Autowired
	private AliexpressProductAdapter aliProductAdapter;

	@Autowired
	private CompressUtil compressUtil;

	private AliexpressProductPO getModel() throws Exception {
		String cotent = ReadTestJsFile.readFileByLines("aliProductListing.js");
		cotent = compressUtil.uncompressGzip(cotent.getBytes("UTF-8"), "");

		AliListingProductMessageVO aliProductMessageVO = JSON.parseObject(cotent, AliListingProductMessageVO.class);

		AliListingProductVO aliProductVO = aliProductMessageVO.getAliListingProduct();
		aliProductVO.setAccountId(aliProductMessageVO.getAccountID());

		AliexpressProductPO productModel = aliProductAdapter.adapteAliexpressProductModel(aliProductVO);
		return productModel;
	}

	@Test
	public void testInsert() throws Exception {
		try {
			aliProductService.insert(getModel());
		} catch (Exception e) {
			Assert.assertFalse(true);
			throw e;
		}
	}
}
