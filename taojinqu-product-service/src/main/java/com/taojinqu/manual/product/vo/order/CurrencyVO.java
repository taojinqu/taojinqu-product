package com.taojinqu.manual.product.vo.order;

import java.io.Serializable;

public class CurrencyVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5286965346657839015L;

	private String currencyCode;

	private Integer defaultFractionDigits;

	private String symbol;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getDefaultFractionDigits() {
		return defaultFractionDigits;
	}

	public void setDefaultFractionDigits(Integer defaultFractionDigits) {
		this.defaultFractionDigits = defaultFractionDigits;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
