package com.taojinqu.manual.product.vo;

import java.io.Serializable;

public class AeopAeProductSKUVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5077200522151807079L;

	/**
	 * Sku价格。取值范围:0.01-100000;单位:美元
	 */
	private Float skuPrice;

	/**
	 * Sku商家编码
	 */
	private String skuCode;

	/**
	 * Sku库存,有货true，无货false；
	 */
	private boolean skuStock;

	/**
	 * SKU实际可售库存
	 */
	private Long ipmSkuStock;

	/**
	 * SKU ID
	 */
	private String id;

	/**
	 * 货币单位 ：USD;RUB
	 */
	private String currencyCode;

	// private List<AeopSKUPropertyVO> aeopSKUPropertyList;

	private String aeopSKUProperty;

	public Float getSkuPrice() {
		return skuPrice;
	}

	public void setSkuPrice(Float skuPrice) {
		this.skuPrice = skuPrice;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public boolean isSkuStock() {
		return skuStock;
	}

	public void setSkuStock(boolean skuStock) {
		this.skuStock = skuStock;
	}

	public Long getIpmSkuStock() {
		return ipmSkuStock;
	}

	public void setIpmSkuStock(Long ipmSkuStock) {
		this.ipmSkuStock = ipmSkuStock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	// public List<AeopSKUPropertyVO> getAeopSKUPropertyList() {
	// return aeopSKUPropertyList;
	// }
	//
	// public void setAeopSKUPropertyList(List<AeopSKUPropertyVO>
	// aeopSKUPropertyList) {
	// this.aeopSKUPropertyList = aeopSKUPropertyList;
	// }

	public String getAeopSKUProperty() {
		return aeopSKUProperty;
	}

	public void setAeopSKUProperty(String aeopSKUProperty) {
		this.aeopSKUProperty = aeopSKUProperty;
	}

	// // TODO:解析aeopSKUProperty节点
	// public void setAeopSKUProperty(String aeopSKUProperty) {
	// List<AeopSKUPropertyVO> aeopSKUPropertyList =
	// JSONArray.parseArray(aeopSKUProperty, AeopSKUPropertyVO.class);
	// this.setAeopSKUPropertyList(aeopSKUPropertyList);
	// }
}
