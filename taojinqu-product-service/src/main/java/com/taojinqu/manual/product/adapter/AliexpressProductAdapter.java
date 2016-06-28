package com.taojinqu.manual.product.adapter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.taojinqu.manual.product.dao.po.AliexpressProductExtendPO;
import com.taojinqu.manual.product.dao.po.AliexpressProductPO;
import com.taojinqu.manual.product.dao.po.AliexpressProductVariationPO;
import com.taojinqu.manual.product.util.DataTimeUtil;
import com.taojinqu.manual.product.vo.AeopAeProductSKUVO;
import com.taojinqu.manual.product.vo.AliListingProductVO;

@Component("aliProductAdapter")
public class AliexpressProductAdapter {

	public AliexpressProductPO adapteAliexpressProductModel(AliListingProductVO aliProductVO) throws Exception {
		AliexpressProductPO model = new AliexpressProductPO();

		Integer accountId = aliProductVO.getAccountId();
		String productId = String.valueOf(aliProductVO.getProductId());

		model.setAccount_id(accountId);
		model.setAliexpress_product_id(productId);
		// model.setSku(sku);
		model.setSubject(aliProductVO.getSubject());
		model.setReduce_strategy(aliProductVO.getReduceStrategy());
		model.setProduct_unit(aliProductVO.getProductUnit());
		model.setWs_offline_date(DataTimeUtil.parseDate2Timestamp(aliProductVO.getWsOfflineDate()));
		model.setSizechart_id(aliProductVO.getSizechartId().intValue());
		model.setPackage_length(aliProductVO.getPackageLength());
		model.setPackage_width(aliProductVO.getPackageWidth());
		model.setPackage_height(aliProductVO.getPackageHeight());
		model.setGmt_create(DataTimeUtil.parseDate2Timestamp(aliProductVO.getGmtCreate()));
		model.setGmt_modified(DataTimeUtil.parseDate2Timestamp(aliProductVO.getGmtModified()));
		model.setWs_display(aliProductVO.getWsDisplay());
		model.setIs_image_dynamic(aliProductVO.getIsImageDynamic() ? 1 : 0);
		model.setImage_urls(aliProductVO.getImageURLs());
		model.setCategory_id(aliProductVO.getCategoryId());
		model.setProduct_status_type(aliProductVO.getProductStatusType());
		model.setGross_weight(aliProductVO.getGrossWeight());
		model.setDelivery_time(aliProductVO.getDeliveryTime());
		model.setProduct_price(aliProductVO.getProductPrice());
		model.setSrc(aliProductVO.getSrc());

		Timestamp current = DataTimeUtil.parseDate2Timestamp(DataTimeUtil.getNowUTC()); // 取当前时间
		model.setCreate_time(current);
		model.setCreate_user_id(aliProductVO.getUserID());
		model.setModify_time(current);
		model.setModify_user_id(aliProductVO.getUserID());

		model.setCurrency(aliProductVO.getCurrencyCode());
		model.setPackage_type(aliProductVO.getPackageType() ? 1 : 0);
		model.setLot_num(aliProductVO.getLotNum());
		model.setFreight_template_id(aliProductVO.getFreightTemplateId());
		model.setPromise_template_id(aliProductVO.getPromiseTemplateId().intValue());
		model.setIs_pack_sell(aliProductVO.getIsPackSell() ? 1 : 0);
		model.setAdd_unit(aliProductVO.getAddUnit());
		model.setBase_unit(aliProductVO.getBaseUnit());
		model.setAdd_weight(Float.valueOf(aliProductVO.getAddWeight()));
		model.setBulk_order(aliProductVO.getBulkOrder());
		model.setBulk_discount(aliProductVO.getBulkDiscount());

		// 取aeopAeProductSKUs节点中的值===begin
		// model.setIs_variation(0);
		// model.setOnline_sku(online_sku);
		// model.setProduct_stock();
		// model.setSku_id(sku_id);
		this.updateAliexpressProduct(model, aliProductVO.getAeopAeProductSKUList().get(0));
		// 取aeopAeProductSKUs节点中的值===end

		model.setProductExtendModel(adapteAliexpressProductExtendModel(aliProductVO));
		model.setProductVariationList(adapteAliexpressProductVariationModel(aliProductVO));
		return model;
	}

	private void updateAliexpressProduct(AliexpressProductPO model, AeopAeProductSKUVO productSkuVo) {
		String firstOnlineSku = productSkuVo.getSkuCode();// Sku商家编码
		String firstSku = "";// EncryptSKUUtil.getAliRealSku(firstOnlineSku);
		firstSku = StringUtils.isEmpty(firstSku) ? firstOnlineSku : firstSku;

		model.setSku(firstSku);
		model.setOnline_sku(firstOnlineSku);
		model.setProduct_stock(productSkuVo.getIpmSkuStock().intValue());
		model.setProduct_price(productSkuVo.getSkuPrice());
		model.setIs_variation(0);// 是否为多属性

		String skuID = productSkuVo.getId();
		skuID = (StringUtils.isEmpty(skuID) || StringUtils.equalsIgnoreCase("<none>", skuID)) ? "" : skuID;
		model.setSku_id(skuID);
	}

	public List<AliexpressProductVariationPO> adapteAliexpressProductVariationModel(AliListingProductVO aliProductVO) {
		List<AliexpressProductVariationPO> modelList = new ArrayList<AliexpressProductVariationPO>();
		List<AeopAeProductSKUVO> skuVoList = aliProductVO.getAeopAeProductSKUList();
		if (null != skuVoList && !skuVoList.isEmpty()) {
			for (AeopAeProductSKUVO skuVo : skuVoList) {
				AliexpressProductVariationPO skuModel = adapteAliexpressProductVariationModel(skuVo);
				// skuModel.setProduct_id(aliProductVO.getProductId().intValue());
				modelList.add(skuModel);
			}
		}
		return modelList;
	}

	public AliexpressProductVariationPO adapteAliexpressProductVariationModel(AeopAeProductSKUVO aeopAeProductSKUVO) {
		AliexpressProductVariationPO skuModel = new AliexpressProductVariationPO();

		// skuModel.setId(id);TODO:主键，自增
		// skuModel.setProduct_id(product_id);
		skuModel.setIpm_sku_stock(aeopAeProductSKUVO.getIpmSkuStock());

		String skuCode = aeopAeProductSKUVO.getSkuCode();
		String sku = "";// EncryptSKUUtil.getAliRealSku(skuCode);
		sku = StringUtils.isEmpty(sku) ? skuCode : sku;
		skuModel.setSku_code(skuCode);
		skuModel.setSku(sku);

		skuModel.setSku_price(aeopAeProductSKUVO.getSkuPrice());

		long ipmSkuStock = aeopAeProductSKUVO.getIpmSkuStock();
		ipmSkuStock = ipmSkuStock > 0 ? 1L : 0L;
		skuModel.setSku_stock(ipmSkuStock); // 是否有库存标记(1=有库存 0=没有库存)

		skuModel.setSku_id(aeopAeProductSKUVO.getId());
		skuModel.setSku_property(aeopAeProductSKUVO.getAeopSKUProperty());
		// skuModel.setProfit_rate(profit_rate); //TODO:产品利润率，接口没有该字段，需要计算
		return skuModel;
	}

	public AliexpressProductExtendPO adapteAliexpressProductExtendModel(AliListingProductVO aliProductVO) {
		AliexpressProductExtendPO productExtendModel = new AliexpressProductExtendPO();

		// productExtendModel.setProduct_id(aliProductVO.getProductId().intValue());
		// //ueb_aliexpress_product表中的id列（外键）
		productExtendModel.setDetail(aliProductVO.getDetail());
		productExtendModel.setProduct_property(aliProductVO.getProductProperty());
		// productExtendModel.setKeywords(keywords); //接口没有该字段
		// productExtendModel.setProduct_more_keywords1(product_more_keywords1);
		// //接口没有该字段
		// productExtendModel.setProduct_more_keywords2(product_more_keywords2);
		// //接口没有该字段

		productExtendModel.setImage_URLs(aliProductVO.getImageURLs());
		productExtendModel.setSku_property(aliProductVO.getSkuProperty()); // 取aeopAeProductSKUs节点第0个元素

		return productExtendModel;
	}
}
