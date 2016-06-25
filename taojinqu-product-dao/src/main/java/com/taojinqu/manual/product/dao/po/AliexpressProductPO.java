package com.taojinqu.manual.product.dao.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class AliexpressProductPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2258924992651447331L;

	private Integer id;

	private Integer account_id;

	private String aliexpress_product_id;

	private String sku;

	private String subject;

	private String reduce_strategy;

	private String product_unit;

	private Timestamp ws_offline_date;

	private Integer sizechart_id;

	private Float package_length;

	private Float package_width;

	private Float package_height;

	private Timestamp gmt_create;

	private Timestamp gmt_modified;

	private String ws_display;

	private Integer is_image_dynamic;

	private String image_urls;

	private Integer category_id;

	private String product_status_type;

	private Float gross_weight;

	private Integer delivery_time;

	private Float product_price;

	private String src;

	private Integer create_user_id;

	private Timestamp create_time;

	private Integer modify_user_id;

	private Timestamp modify_time;

	private Integer is_variation;

	private String online_sku;

	private Integer product_stock;

	private String currency;

	private String sku_id;

	private Integer package_type;

	private Integer lot_num;

	private Integer freight_template_id;

	private Integer is_pack_sell;

	private Integer promise_template_id;

	private Integer add_unit;

	private Integer base_unit;

	private Float add_weight;

	private Integer bulk_order;

	private Integer bulk_discount;

//	private AliexpressProductExtendPO productExtendModel;
//	private List<AliexpressProductVariationPO> productVariationList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getAliexpress_product_id() {
		return aliexpress_product_id;
	}

	public void setAliexpress_product_id(String aliexpress_product_id) {
		this.aliexpress_product_id = aliexpress_product_id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getReduce_strategy() {
		return reduce_strategy;
	}

	public void setReduce_strategy(String reduce_strategy) {
		this.reduce_strategy = reduce_strategy;
	}

	public String getProduct_unit() {
		return product_unit;
	}

	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}

	public Timestamp getWs_offline_date() {
		return ws_offline_date;
	}

	public void setWs_offline_date(Timestamp ws_offline_date) {
		this.ws_offline_date = ws_offline_date;
	}

	public Integer getSizechart_id() {
		return sizechart_id;
	}

	public void setSizechart_id(Integer sizechart_id) {
		this.sizechart_id = sizechart_id;
	}

	public Float getPackage_length() {
		return package_length;
	}

	public void setPackage_length(Float package_length) {
		this.package_length = package_length;
	}

	public Float getPackage_width() {
		return package_width;
	}

	public void setPackage_width(Float package_width) {
		this.package_width = package_width;
	}

	public Float getPackage_height() {
		return package_height;
	}

	public void setPackage_height(Float package_height) {
		this.package_height = package_height;
	}

	public Timestamp getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Timestamp gmt_create) {
		this.gmt_create = gmt_create;
	}

	public Timestamp getGmt_modified() {
		return gmt_modified;
	}

	public void setGmt_modified(Timestamp gmt_modified) {
		this.gmt_modified = gmt_modified;
	}

	public String getWs_display() {
		return ws_display;
	}

	public void setWs_display(String ws_display) {
		this.ws_display = ws_display;
	}

	public Integer getIs_image_dynamic() {
		return is_image_dynamic;
	}

	public void setIs_image_dynamic(Integer is_image_dynamic) {
		this.is_image_dynamic = is_image_dynamic;
	}

	public String getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getProduct_status_type() {
		return product_status_type;
	}

	public void setProduct_status_type(String product_status_type) {
		this.product_status_type = product_status_type;
	}

	public Float getGross_weight() {
		return gross_weight;
	}

	public void setGross_weight(Float gross_weight) {
		this.gross_weight = gross_weight;
	}

	public Integer getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(Integer delivery_time) {
		this.delivery_time = delivery_time;
	}

	public Float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Float product_price) {
		this.product_price = product_price;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getCreate_user_id() {
		return create_user_id;
	}

	public void setCreate_user_id(Integer create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public Integer getModify_user_id() {
		return modify_user_id;
	}

	public void setModify_user_id(Integer modify_user_id) {
		this.modify_user_id = modify_user_id;
	}

	public Timestamp getModify_time() {
		return modify_time;
	}

	public void setModify_time(Timestamp modify_time) {
		this.modify_time = modify_time;
	}

	public Integer getIs_variation() {
		return is_variation;
	}

	public void setIs_variation(Integer is_variation) {
		this.is_variation = is_variation;
	}

	public String getOnline_sku() {
		return online_sku;
	}

	public void setOnline_sku(String online_sku) {
		this.online_sku = online_sku;
	}

	public Integer getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(Integer product_stock) {
		this.product_stock = product_stock;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public Integer getPackage_type() {
		return package_type;
	}

	public void setPackage_type(Integer package_type) {
		this.package_type = package_type;
	}

	public Integer getLot_num() {
		return lot_num;
	}

	public void setLot_num(Integer lot_num) {
		this.lot_num = lot_num;
	}

	public Integer getFreight_template_id() {
		return freight_template_id;
	}

	public void setFreight_template_id(Integer freight_template_id) {
		this.freight_template_id = freight_template_id;
	}

	public Integer getIs_pack_sell() {
		return is_pack_sell;
	}

	public void setIs_pack_sell(Integer is_pack_sell) {
		this.is_pack_sell = is_pack_sell;
	}

//	public List<AliexpressProductVariationPO> getProductVariationList() {
//		return productVariationList;
//	}
//
//	public void setProductVariationList(List<AliexpressProductVariationPO> productVariationList) {
//		this.productVariationList = productVariationList;
//	}
//
//	public AliexpressProductExtendPO getProductExtendModel() {
//		return productExtendModel;
//	}
//
//	public void setProductExtendModel(AliexpressProductExtendPO productExtendModel) {
//		this.productExtendModel = productExtendModel;
//	}

	public Integer getPromise_template_id() {
		return promise_template_id;
	}

	public void setPromise_template_id(Integer promise_template_id) {
		this.promise_template_id = promise_template_id;
	}

	public Integer getAdd_unit() {
		return add_unit;
	}

	public void setAdd_unit(Integer add_unit) {
		this.add_unit = add_unit;
	}

	public Integer getBase_unit() {
		return base_unit;
	}

	public void setBase_unit(Integer base_unit) {
		this.base_unit = base_unit;
	}

	public Float getAdd_weight() {
		return add_weight;
	}

	public void setAdd_weight(Float add_weight) {
		this.add_weight = add_weight;
	}

	public Integer getBulk_order() {
		return bulk_order;
	}

	public void setBulk_order(Integer bulk_order) {
		this.bulk_order = bulk_order;
	}

	public Integer getBulk_discount() {
		return bulk_discount;
	}

	public void setBulk_discount(Integer bulk_discount) {
		this.bulk_discount = bulk_discount;
	}
}
