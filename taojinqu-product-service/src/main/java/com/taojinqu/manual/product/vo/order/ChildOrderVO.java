package com.taojinqu.manual.product.vo.order;

import java.io.Serializable;

public class ChildOrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 187049987779923979L;

	private String frozenStatus;

	private String fundStatus;

	private Long id;

	private String initOrderAmt;

	private String issueStatus;

	private Integer lotNum;

	private String orderStatus;

	private String productAttributes;

	private Integer productCount;

	private Long productId;

	private String productName;

	private String productPrice;

	private String productUnit;

	private Float skuCode;

	public String getFrozenStatus() {
		return frozenStatus;
	}

	public void setFrozenStatus(String frozenStatus) {
		this.frozenStatus = frozenStatus;
	}

	public String getFundStatus() {
		return fundStatus;
	}

	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInitOrderAmt() {
		return initOrderAmt;
	}

	public void setInitOrderAmt(String initOrderAmt) {
		this.initOrderAmt = initOrderAmt;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public Integer getLotNum() {
		return lotNum;
	}

	public void setLotNum(Integer lotNum) {
		this.lotNum = lotNum;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(String productAttributes) {
		this.productAttributes = productAttributes;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

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

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public Float getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(Float skuCode) {
		this.skuCode = skuCode;
	}
}
