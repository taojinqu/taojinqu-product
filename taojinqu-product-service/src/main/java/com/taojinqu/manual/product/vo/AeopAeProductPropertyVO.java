package com.taojinqu.manual.product.vo;

import java.io.Serializable;

public class AeopAeProductPropertyVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2369611265754809867L;

	private Integer attrValueId;

	private Integer attrNameId;

	private String attrName;

	private String attrValue;

	public Integer getAttrValueId() {
		return attrValueId;
	}

	public void setAttrValueId(Integer attrValueId) {
		this.attrValueId = attrValueId;
	}

	public Integer getAttrNameId() {
		return attrNameId;
	}

	public void setAttrNameId(Integer attrNameId) {
		this.attrNameId = attrNameId;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
}
