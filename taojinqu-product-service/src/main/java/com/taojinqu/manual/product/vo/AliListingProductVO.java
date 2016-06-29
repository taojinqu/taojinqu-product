package com.taojinqu.manual.product.vo;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.taojinqu.manual.product.util.DataTimeUtil;

public class AliListingProductVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534556239546906389L;

	private String detail;

	private Integer deliveryTime;

	private String ownerMemberId;

	private String ownerMemberSeq;

	private Long productId;

	private Integer categoryId;

	private String subject;

	private Boolean packageType;

	private Integer lotNum;

	private Float packageLength;

	private Float packageWidth;

	private Float packageHeight;

	private Float grossWeight;

	private String reduceStrategy;

	private String groupIds;

	/*
	 * 产品的主图列表
	 */
	private String imageURLs;

	private String productUnit;

	private String wsValidNum;

	/*
	 * 产品的下架日期
	 */
	private Date wsOfflineDate;

	/*
	 * 产品所关联的尺码模版ID。如果这个商品没有关联任何的尺码模版，那么返回-1
	 */
	private Long sizechartId;

	/*
	 * 是否是动态图产品
	 */
	private Boolean isImageDynamic;

	private String wsDisplay;

	private String productStatusType;

	/*
	 * 产品的货币单位。美元: USD, 卢布: RUB
	 */
	private String currencyCode;

	private Integer freightTemplateId;

	private String groupId;

	/*
	 * 单品产品的价格
	 */
	private Float productPrice;

	/*
	 * 产品的来源
	 */
	private String src;

	/*
	 * 产品所关联的服务模版
	 */
	private Long promiseTemplateId;

	private String success;

	private String addWeight;

	private Integer addUnit;

	/*
	 * 是否支持是自定义计重
	 */
	private Boolean isPackSell;

	/*
	 * 自定义计重的基本产品件数
	 */
	private Integer baseUnit;

	/*
	 * 享受批发价的产品数
	 */
	private Integer bulkOrder;

	/*
	 * 产品的批发折扣
	 */
	private Integer bulkDiscount;

	/*
	 * 速卖通接口中没有该字段，前端附加该字段到消息中
	 */
	private Integer accountId;

	/*
	 * 速卖通接口中没有该字段，前端附加该字段到消息中
	 */
	private Integer userID;

	/*
	 * 产品发布时间（在"商品列表查询接口"返回结果aeopAEProductDisplayDTOList字段中）
	 */
	private Date gmtCreate;

	/*
	 * 商品最后更新时间（系统更新时间也会记录）（在"商品列表查询接口"返回结果aeopAEProductDisplayDTOList字段中）
	 */
	private Date gmtModified;

	private List<AeopAeProductPropertyVO> aeopAeProductPropertyList;
	private String productProperty;

	private List<AeopAeProductSKUVO> aeopAeProductSKUList;
	private String skuProperty;

	private List<String> groupIdList;

	public void setGroupIds(String groupIds) {
		List<String> groupIdList = JSONArray.parseArray(groupIds, String.class);
		this.setGroupIdList(groupIdList);
	}

	public void setAeopAeProductSKUs(String aeopAeProductSKUs) {
		List<AeopAeProductSKUVO> aeopAeProductSKUList = JSONArray.parseArray(aeopAeProductSKUs,
				AeopAeProductSKUVO.class);
		this.setAeopAeProductSKUList(aeopAeProductSKUList);
		this.setSkuProperty(aeopAeProductSKUs);
	}

	public void setAeopAeProductPropertys(String aeopAeProductPropertys) {
		List<AeopAeProductPropertyVO> aeopAeProductPropertyList = JSONArray.parseArray(aeopAeProductPropertys,
				AeopAeProductPropertyVO.class);
		this.setAeopAeProductPropertyList(aeopAeProductPropertyList);
		this.setProductProperty(aeopAeProductPropertys);
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Integer deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getOwnerMemberId() {
		return ownerMemberId;
	}

	public void setOwnerMemberId(String ownerMemberId) {
		this.ownerMemberId = ownerMemberId;
	}

	public String getOwnerMemberSeq() {
		return ownerMemberSeq;
	}

	public void setOwnerMemberSeq(String ownerMemberSeq) {
		this.ownerMemberSeq = ownerMemberSeq;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Boolean getPackageType() {
		if (null == packageType) {
			return Boolean.valueOf(false);
		}
		return packageType;
	}

	public void setPackageType(Boolean packageType) {
		this.packageType = packageType;
	}

	public Integer getLotNum() {
		return lotNum;
	}

	public void setLotNum(Integer lotNum) {
		this.lotNum = lotNum;
	}

	public Float getPackageLength() {
		return packageLength;
	}

	public void setPackageLength(Float packageLength) {
		this.packageLength = packageLength;
	}

	public Float getPackageWidth() {
		return packageWidth;
	}

	public void setPackageWidth(Float packageWidth) {
		this.packageWidth = packageWidth;
	}

	public Float getPackageHeight() {
		return packageHeight;
	}

	public void setPackageHeight(Float packageHeight) {
		this.packageHeight = packageHeight;
	}

	public Float getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Float grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getReduceStrategy() {
		return reduceStrategy;
	}

	public void setReduceStrategy(String reduceStrategy) {
		this.reduceStrategy = reduceStrategy;
	}

	public String getGroupIds() {
		return groupIds;
	}

	public String getImageURLs() {
		return imageURLs;
	}

	public void setImageURLs(String imageURLs) {
		this.imageURLs = imageURLs;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getWsValidNum() {
		return wsValidNum;
	}

	public void setWsValidNum(String wsValidNum) {
		this.wsValidNum = wsValidNum;
	}

	public Date getWsOfflineDate() {
		return wsOfflineDate;
	}

	/**
	 * 
	 * @param wsOfflineDate
	 *            带时区
	 */
	public void setWsOfflineDate(String wsOfflineDate) {
		Date date = null;
		try {
			date = DataTimeUtil.getUTCDate(DataTimeUtil.YYYYMMDDTZ, wsOfflineDate, DataTimeUtil.TIMEZONE_UTC);
		} catch (ParseException e) {
			date = DataTimeUtil.getNowUTC();
		}
		this.wsOfflineDate = date;
	}

	public String getWsDisplay() {
		return wsDisplay;
	}

	public void setWsDisplay(String wsDisplay) {
		this.wsDisplay = wsDisplay;
	}

	public String getProductStatusType() {
		return productStatusType;
	}

	public void setProductStatusType(String productStatusType) {
		this.productStatusType = productStatusType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getFreightTemplateId() {
		return freightTemplateId;
	}

	public void setFreightTemplateId(Integer freightTemplateId) {
		this.freightTemplateId = freightTemplateId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Boolean getIsImageDynamic() {
		if (null == isImageDynamic) {
			return Boolean.valueOf(false);
		}
		return isImageDynamic;
	}

	public void setIsImageDynamic(Boolean isImageDynamic) {
		this.isImageDynamic = isImageDynamic;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Long getPromiseTemplateId() {
		if (null == promiseTemplateId) {
			return Long.valueOf(0L);
		}
		return promiseTemplateId;
	}

	public void setPromiseTemplateId(Long promiseTemplateId) {
		this.promiseTemplateId = promiseTemplateId;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<AeopAeProductPropertyVO> getAeopAeProductPropertyList() {
		return aeopAeProductPropertyList;
	}

	public void setAeopAeProductPropertyList(List<AeopAeProductPropertyVO> aeopAeProductPropertyList) {
		this.aeopAeProductPropertyList = aeopAeProductPropertyList;
	}

	public List<AeopAeProductSKUVO> getAeopAeProductSKUList() {
		return aeopAeProductSKUList;
	}

	public void setAeopAeProductSKUList(List<AeopAeProductSKUVO> aeopAeProductSKUList) {
		this.aeopAeProductSKUList = aeopAeProductSKUList;
	}

	public List<String> getGroupIdList() {
		return groupIdList;
	}

	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public String getSkuProperty() {
		return skuProperty;
	}

	public void setSkuProperty(String skuProperty) {
		this.skuProperty = skuProperty;
	}

	public String getProductProperty() {
		return productProperty;
	}

	public void setProductProperty(String productProperty) {
		this.productProperty = productProperty;
	}

	public String getAddWeight() {
		if (StringUtils.isBlank(addWeight)) {
			addWeight = "0.0";
		}
		return addWeight;
	}

	public void setAddWeight(String addWeight) {
		this.addWeight = addWeight;
	}

	public Integer getAddUnit() {
		if (null == addUnit) {
			addUnit = Integer.valueOf(0);
		}
		return addUnit;
	}

	public void setAddUnit(Integer addUnit) {
		this.addUnit = addUnit;
	}

	public Boolean getIsPackSell() {
		if (null == isPackSell) {
			return Boolean.valueOf(false);
		}
		return isPackSell;
	}

	public void setIsPackSell(Boolean isPackSell) {
		this.isPackSell = isPackSell;
	}

	public Integer getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(Integer baseUnit) {
		this.baseUnit = baseUnit;
	}

	public Integer getBulkOrder() {
		return bulkOrder;
	}

	public void setBulkOrder(Integer bulkOrder) {
		this.bulkOrder = bulkOrder;
	}

	public Integer getBulkDiscount() {
		return bulkDiscount;
	}

	public void setBulkDiscount(Integer bulkDiscount) {
		this.bulkDiscount = bulkDiscount;
	}

	public Long getSizechartId() {
		if (null == sizechartId) {
			sizechartId = Long.valueOf(-1L);
		}
		return sizechartId;
	}

	public void setSizechartId(Long sizechartId) {
		this.sizechartId = sizechartId;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
}
