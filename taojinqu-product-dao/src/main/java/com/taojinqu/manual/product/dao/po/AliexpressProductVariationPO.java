package com.taojinqu.manual.product.dao.po;

import java.io.Serializable;

public class AliexpressProductVariationPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6579043811599504608L;

	private Integer id;

	private Integer product_id;

	private Long ipm_sku_stock;

	private String sku_code;

	private String sku;

	private Float sku_price;

	private Long sku_stock;

	private String sku_id;

	private String sku_property;

	private Float profit_rate;

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

	public Long getIpm_sku_stock() {
		return ipm_sku_stock;
	}

	public void setIpm_sku_stock(Long ipm_sku_stock) {
		this.ipm_sku_stock = ipm_sku_stock;
	}

	public String getSku_code() {
		return sku_code;
	}

	public void setSku_code(String sku_code) {
		this.sku_code = sku_code;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Float getSku_price() {
		return sku_price;
	}

	public void setSku_price(Float sku_price) {
		this.sku_price = sku_price;
	}

	public Long getSku_stock() {
		return sku_stock;
	}

	public void setSku_stock(Long sku_stock) {
		this.sku_stock = sku_stock;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public String getSku_property() {
		return sku_property;
	}

	public void setSku_property(String sku_property) {
		this.sku_property = sku_property;
	}

	public Float getProfit_rate() {
		return profit_rate;
	}

	public void setProfit_rate(Float profit_rate) {
		this.profit_rate = profit_rate;
	}
}
