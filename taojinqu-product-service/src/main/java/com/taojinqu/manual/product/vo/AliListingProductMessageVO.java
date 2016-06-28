package com.taojinqu.manual.product.vo;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class AliListingProductMessageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2902463972285899199L;

	private Integer accountID;

	private String platform;

	private AliListingProductVO aliListingProduct;

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public AliListingProductVO getAliListingProduct() {
		return aliListingProduct;
	}

	public void setAliListingProduct(AliListingProductVO aliListingProduct) {
		this.aliListingProduct = aliListingProduct;
	}

	public void setData(String data) {
		AliListingProductVO aliListingProduct = JSONObject.parseObject(data, AliListingProductVO.class);
		this.setAliListingProduct(aliListingProduct);
	}
}
