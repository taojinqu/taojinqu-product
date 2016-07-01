package com.taojinqu.manual.product.vo.order;

import java.io.Serializable;
import java.util.Date;

public class LogisticInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7823919328283840944L;

	private Date gmtSend;

	private String logisticsNo;

	private String logisticsServiceName;

	private String logisticsTypeCode;

	private String receiveStatus;

	public Date getGmtSend() {
		return gmtSend;
	}

	public void setGmtSend(Date gmtSend) {
		this.gmtSend = gmtSend;
	}

	public String getLogisticsNo() {
		return logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getLogisticsServiceName() {
		return logisticsServiceName;
	}

	public void setLogisticsServiceName(String logisticsServiceName) {
		this.logisticsServiceName = logisticsServiceName;
	}

	public String getLogisticsTypeCode() {
		return logisticsTypeCode;
	}

	public void setLogisticsTypeCode(String logisticsTypeCode) {
		this.logisticsTypeCode = logisticsTypeCode;
	}

	public String getReceiveStatus() {
		return receiveStatus;
	}

	public void setReceiveStatus(String receiveStatus) {
		this.receiveStatus = receiveStatus;
	}
}
