package com.taojinqu.manual.product.vo.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class AliOrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4704363555320313270L;

	private String buyerInfo;

	private String buyerSignerFullname;

	private String buyerloginid;

	private List<ChildOrderExtInfoVO> childOrderExtInfo;

	private List<ChildOrderVO> childOrder;

	private String escrowFee;

	private String frozenStatus;

	private String fundStatus;

	private Date gmtCreate;

	private Date gmtModified;

	private Date gmtPaySuccess;

	private Date gmtTradeEnd;

	private Long id;

	private String initOderAmount;

	private Boolean isPhone;

	private String issueInfo;

	private String issueStatus;

	private String loanInfo;

	private String loanStatus;

	private List<LogisticInfoVO> logisticInfo;

	private String logisticsAmount;

	private String logisticsStatus;

	private List<OprLogDtoVO> oprLogDtos;

	private String orderAmount;

	// orderMsgList

	private String orderStatus;

	private String paymentType;

	private String receiptAddress;

	private String refundInfo;

	private String sellerOperatorLoginId;

	private String sellerSignerFullname;

	public void setChildOrderExtInfoList(String childOrderExtInfo) {
		List<ChildOrderExtInfoVO> infoList = JSON.parseArray(childOrderExtInfo, ChildOrderExtInfoVO.class);
		this.setChildOrderExtInfo(infoList);
	}

	public List<ChildOrderExtInfoVO> getChildOrderExtInfo() {
		return childOrderExtInfo;
	}

	public void setChildOrderExtInfo(List<ChildOrderExtInfoVO> childOrderExtInfo) {
		this.childOrderExtInfo = childOrderExtInfo;
	}

	public void setChildOrderList(String childOrder) {
		List<ChildOrderVO> childOrderList = JSON.parseArray(childOrder, ChildOrderVO.class);
		this.setChildOrder(childOrderList);
	}

	public List<ChildOrderVO> getChildOrder() {
		return childOrder;
	}

	public void setChildOrder(List<ChildOrderVO> childOrder) {
		this.childOrder = childOrder;
	}

	public void setLogisticInfoList(String logisticInfo) {
		List<LogisticInfoVO> logisticInfoList = JSON.parseArray(logisticInfo, LogisticInfoVO.class);
		this.setLogisticInfo(logisticInfoList);
	}

	public List<LogisticInfoVO> getLogisticInfo() {
		return logisticInfo;
	}

	public void setLogisticInfo(List<LogisticInfoVO> logisticInfo) {
		this.logisticInfo = logisticInfo;
	}

	public void setOprLogDtoList(String oprLogDto) {
		List<OprLogDtoVO> oprLogDtos = JSON.parseArray(oprLogDto, OprLogDtoVO.class);
		this.setOprLogDtos(oprLogDtos);
	}

	public List<OprLogDtoVO> getOprLogDtos() {
		return oprLogDtos;
	}

	public void setOprLogDtos(List<OprLogDtoVO> oprLogDtos) {
		this.oprLogDtos = oprLogDtos;
	}

	public String getBuyerInfo() {
		return buyerInfo;
	}

	public void setBuyerInfo(String buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getBuyerSignerFullname() {
		return buyerSignerFullname;
	}

	public void setBuyerSignerFullname(String buyerSignerFullname) {
		this.buyerSignerFullname = buyerSignerFullname;
	}

	public String getBuyerloginid() {
		return buyerloginid;
	}

	public void setBuyerloginid(String buyerloginid) {
		this.buyerloginid = buyerloginid;
	}

	public String getEscrowFee() {
		return escrowFee;
	}

	public void setEscrowFee(String escrowFee) {
		this.escrowFee = escrowFee;
	}

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

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtPaySuccess() {
		return gmtPaySuccess;
	}

	public void setGmtPaySuccess(Date gmtPaySuccess) {
		this.gmtPaySuccess = gmtPaySuccess;
	}

	public Date getGmtTradeEnd() {
		return gmtTradeEnd;
	}

	public void setGmtTradeEnd(Date gmtTradeEnd) {
		this.gmtTradeEnd = gmtTradeEnd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInitOderAmount() {
		return initOderAmount;
	}

	public void setInitOderAmount(String initOderAmount) {
		this.initOderAmount = initOderAmount;
	}

	public Boolean getIsPhone() {
		return isPhone;
	}

	public void setIsPhone(Boolean isPhone) {
		this.isPhone = isPhone;
	}

	public String getIssueInfo() {
		return issueInfo;
	}

	public void setIssueInfo(String issueInfo) {
		this.issueInfo = issueInfo;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getLoanInfo() {
		return loanInfo;
	}

	public void setLoanInfo(String loanInfo) {
		this.loanInfo = loanInfo;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getLogisticsAmount() {
		return logisticsAmount;
	}

	public void setLogisticsAmount(String logisticsAmount) {
		this.logisticsAmount = logisticsAmount;
	}

	public String getLogisticsStatus() {
		return logisticsStatus;
	}

	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getReceiptAddress() {
		return receiptAddress;
	}

	public void setReceiptAddress(String receiptAddress) {
		this.receiptAddress = receiptAddress;
	}

	public String getRefundInfo() {
		return refundInfo;
	}

	public void setRefundInfo(String refundInfo) {
		this.refundInfo = refundInfo;
	}

	public String getSellerOperatorLoginId() {
		return sellerOperatorLoginId;
	}

	public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
		this.sellerOperatorLoginId = sellerOperatorLoginId;
	}

	public String getSellerSignerFullname() {
		return sellerSignerFullname;
	}

	public void setSellerSignerFullname(String sellerSignerFullname) {
		this.sellerSignerFullname = sellerSignerFullname;
	}
}
