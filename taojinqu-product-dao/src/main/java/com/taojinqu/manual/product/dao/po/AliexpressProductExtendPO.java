package com.taojinqu.manual.product.dao.po;

import java.io.Serializable;

public class AliexpressProductExtendPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -643364991460714150L;

	private Integer id;

	private Integer product_id;

	private String detail;

	private String product_property;

	private String keywords;

	private String product_more_keywords1;

	private String product_more_keywords2;

	private String image_URLs;

	private String sku_property;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getProduct_property() {
		return product_property;
	}

	public void setProduct_property(String product_property) {
		this.product_property = product_property;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getProduct_more_keywords1() {
		return product_more_keywords1;
	}

	public void setProduct_more_keywords1(String product_more_keywords1) {
		this.product_more_keywords1 = product_more_keywords1;
	}

	public String getProduct_more_keywords2() {
		return product_more_keywords2;
	}

	public void setProduct_more_keywords2(String product_more_keywords2) {
		this.product_more_keywords2 = product_more_keywords2;
	}

	public String getImage_URLs() {
		return image_URLs;
	}

	public void setImage_URLs(String image_URLs) {
		this.image_URLs = image_URLs;
	}

	public String getSku_property() {
		return sku_property;
	}

	public void setSku_property(String sku_property) {
		this.sku_property = sku_property;
	}
}
