package com.taojinqu.manual.product.vo.order;

import java.io.Serializable;

public class ChildOrderExtInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -389113216102897629L;

	private Long productId;

	private String productName;

	private Integer quantity;

	private String sku;

	private String unitPrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
}
