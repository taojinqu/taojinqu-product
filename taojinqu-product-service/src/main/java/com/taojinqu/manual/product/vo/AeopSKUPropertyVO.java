package com.taojinqu.manual.product.vo;

import java.io.Serializable;

public class AeopSKUPropertyVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4276489186429774654L;

	private Integer skuPropertyId;

	private Integer propertyValueId;

	private String propertyValueDefinitionName;

	private String skuImage;

	public Integer getSkuPropertyId() {
		return skuPropertyId;
	}

	public void setSkuPropertyId(Integer skuPropertyId) {
		this.skuPropertyId = skuPropertyId;
	}

	public Integer getPropertyValueId() {
		return propertyValueId;
	}

	public void setPropertyValueId(Integer propertyValueId) {
		this.propertyValueId = propertyValueId;
	}

	public String getPropertyValueDefinitionName() {
		return propertyValueDefinitionName;
	}

	public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
		this.propertyValueDefinitionName = propertyValueDefinitionName;
	}

	public String getSkuImage() {
		return skuImage;
	}

	public void setSkuImage(String skuImage) {
		this.skuImage = skuImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
