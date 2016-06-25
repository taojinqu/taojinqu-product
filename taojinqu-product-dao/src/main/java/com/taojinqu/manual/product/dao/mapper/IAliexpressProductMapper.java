package com.taojinqu.manual.product.dao.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.taojinqu.manual.product.dao.po.AliexpressProductPO;

@Repository("aliProductMapper")
public interface IAliexpressProductMapper {

	@Insert("<script> "
			+ "insert into ueb_aliexpress_product(account_id,aliexpress_product_id,sku,subject,reduce_strategy,product_unit,"
			+ "ws_offline_date,sizechart_id,package_length,package_width,package_height,gmt_create,gmt_modified,ws_display,is_image_dynamic,"
			+ "image_urls,category_id,product_status_type,gross_weight,delivery_time,product_price,src,"
			+ "create_user_id,create_time,modify_user_id,modify_time,is_variation,online_sku,product_stock,currency,sku_id,package_type,"
			+ "lot_num,freight_template_id,promise_template_id,is_pack_sell,add_unit,base_unit,add_weight,bulk_order,bulk_discount) "
			+ " VALUES(#{item.account_id},#{item.aliexpress_product_id},#{item.sku},#{item.subject},#{item.reduce_strategy},#{item.product_unit},"
			+ "#{item.ws_offline_date},#{item.sizechart_id},#{item.package_length},#{item.package_width},#{item.package_height},#{item.gmt_create},#{item.gmt_modified},#{item.ws_display},#{item.is_image_dynamic},"
			+ "#{item.image_urls},#{item.category_id},#{item.product_status_type},#{item.gross_weight},#{item.delivery_time},#{item.product_price},#{item.src},"
			+ "#{item.create_user_id},#{item.create_time},#{item.modify_user_id},#{item.modify_time},#{item.is_variation},#{item.online_sku},#{item.product_stock},#{item.currency},#{item.sku_id},#{item.package_type},"
			+ "#{item.lot_num},#{item.freight_template_id},#{item.promise_template_id},#{item.is_pack_sell},#{item.add_unit},#{item.base_unit},#{item.add_weight},#{item.bulk_order},#{item.bulk_discount})"
			+ "</script>")
	@Results({ @Result(property = "ws_offline_date", column = "ws_offline_date", javaType = Timestamp.class),
			@Result(property = "gmt_create", column = "gmt_create", javaType = Timestamp.class),
			@Result(property = "gmt_modified", column = "gmt_modified", javaType = Timestamp.class),
			@Result(property = "create_time", column = "create_time", javaType = Timestamp.class),
			@Result(property = "modify_time", column = "modify_time", javaType = Timestamp.class) })
	@SelectKey(before = false, statement = "select last_insert_id()", keyProperty = "item.id", resultType = java.lang.Integer.class)
	Integer insert(@Param("item") AliexpressProductPO model);

	@Insert("<script> "
			+ "insert into ueb_aliexpress_product(account_id,aliexpress_product_id,sku,subject,reduce_strategy,product_unit,"
			+ "ws_offline_date,sizechart_id,package_length,package_width,package_height,gmt_create,gmt_modified,ws_display,is_image_dynamic,"
			+ "image_urls,category_id,product_status_type,gross_weight,delivery_time,product_price,src,"
			+ "create_user_id,create_time,modify_user_id,modify_time,is_variation,online_sku,product_stock,currency,sku_id,package_type,"
			+ "lot_num,freight_template_id,promise_template_id,is_pack_sell,add_unit,base_unit,add_weight,bulk_order,bulk_discount) "
			+ " VALUES <foreach collection=\"modelList\" item=\"item\" index=\"index\" separator=\",\">"
			+ "( #{item.account_id},#{item.aliexpress_product_id},#{item.sku},#{item.subject},#{item.reduce_strategy},#{item.product_unit},"
			+ "#{item.ws_offline_date},#{item.sizechart_id},#{item.package_length},#{item.package_width},#{item.package_height},#{item.gmt_create},#{item.gmt_modified},#{item.ws_display},#{item.is_image_dynamic},"
			+ "#{item.image_urls},#{item.category_id},#{item.product_status_type},#{item.gross_weight},#{item.delivery_time},#{item.product_price},#{item.src},"
			+ "#{item.create_user_id},#{item.create_time},#{item.modify_user_id},#{item.modify_time},#{item.is_variation},#{item.online_sku},#{item.product_stock},#{item.currency},#{item.sku_id},#{item.package_type},"
			+ "#{item.lot_num},#{item.freight_template_id},#{item.promise_template_id},#{item.is_pack_sell},#{item.add_unit},#{item.base_unit},#{item.add_weight},#{item.bulk_order},#{item.bulk_discount})"
			+ " </foreach></script>")
	@Results({ @Result(property = "ws_offline_date", column = "ws_offline_date", javaType = Timestamp.class),
			@Result(property = "gmt_create", column = "gmt_create", javaType = Timestamp.class),
			@Result(property = "gmt_modified", column = "gmt_modified", javaType = Timestamp.class),
			@Result(property = "create_time", column = "create_time", javaType = Timestamp.class),
			@Result(property = "modify_time", column = "modify_time", javaType = Timestamp.class) })
	Integer insertBatch(@Param("modelList") List<AliexpressProductPO> modelList);

	@Select("<script>SELECT id, account_id,aliexpress_product_id,sku,subject,reduce_strategy,product_unit,ws_offline_date,sizechart_id,"
			+ "package_length,package_width,package_height,gmt_create,gmt_modified,ws_display,is_image_dynamic,image_urls,category_id,"
			+ "product_status_type,gross_weight,delivery_time,product_price,src,create_user_id,create_time,modify_user_id,modify_time,"
			+ "is_variation,online_sku,product_stock,currency,sku_id,package_type,lot_num,freight_template_id,promise_template_id,is_pack_sell,"
			+ "add_unit,base_unit,add_weight,bulk_order,bulk_discount FROM ueb_aliexpress_product WHERE account_id=#{accountId} and aliexpress_product_id=#{productId}</script>")
	AliexpressProductPO getAliexpressProduct(@Param("accountId") Integer accountId,
			@Param("productId") String productId);

	@Update("<script>update ueb_aliexpress_product <trim prefix='set' suffixOverrides=','>"
			+ "<if test='null!=item.sku and \"\"!=item.sku'>sku = #{item.sku},</if>"
			+ "<if test='null!=item.subject and \"\"!=item.subject'>subject = #{item.subject},</if>"
			+ "<if test='null!=item.reduce_strategy and \"\"!=item.reduce_strategy'>reduce_strategy = #{item.reduce_strategy},</if>"
			+ "<if test='null!=item.product_unit and \"\"!=item.product_unit'>product_unit = #{item.product_unit},</if>"
			+ "<if test='null!=item.ws_offline_date'>ws_offline_date = #{item.ws_offline_date},</if>"
			+ "<if test='null!=item.sizechart_id'>sizechart_id = #{item.sizechart_id},</if>"
			+ "<if test='null!=item.package_length'>package_length = #{item.package_length},</if>"
			+ "<if test='null!=item.package_width'>package_width = #{item.package_width},</if>"
			+ "<if test='null!=item.package_height'>package_height = #{item.package_height},</if>"
			+ "<if test='null!=item.gmt_create'>gmt_create = #{item.gmt_create},</if>"
			+ "<if test='null!=item.gmt_modified'>gmt_modified = #{item.gmt_modified},</if>"
			+ "<if test='null!=item.ws_display and \"\"!=item.ws_display'>ws_display = #{item.ws_display},</if>"
			+ "<if test='null!=item.is_image_dynamic'>is_image_dynamic = #{item.is_image_dynamic},</if>"
			+ "<if test='null!=item.image_urls and \"\"!=item.image_urls'>image_urls = #{item.image_urls},</if>"
			+ "<if test='null!=item.category_id'>category_id = #{item.category_id},</if>"
			+ "<if test='null!=item.product_status_type and \"\"!=item.product_status_type'>product_status_type = #{item.product_status_type},</if>"
			+ "<if test='null!=item.gross_weight'>gross_weight = #{item.gross_weight},</if>"
			+ "<if test='null!=item.delivery_time'>delivery_time = #{item.delivery_time},</if>"
			+ "<if test='null!=item.product_price'>product_price = #{item.product_price},</if>"
			+ "<if test='null!=item.src and \"\"!=item.src'>src = #{item.src,jdbcType=VARCHAR},</if>"
			+ "<if test='null!=item.modify_user_id'>modify_user_id = #{item.modify_user_id},</if>"
			+ "<if test='null!=item.modify_time'>modify_time = #{item.modify_time},</if>"
			+ "<if test='null!=item.is_variation'>is_variation = #{item.is_variation},</if>"
			+ "<if test='null!=item.online_sku and \"\"!=item.online_sku'>online_sku = #{item.online_sku},</if>"
			+ "<if test='null!=item.product_stock'>product_stock = #{item.product_stock},</if>"
			+ "<if test='null!=item.currency and \"\"!=item.currency'>currency = #{item.currency},</if>"
			+ "<if test='null!=item.sku_id and \"\"!=item.sku_id'>sku_id = #{item.sku_id},</if>"
			+ "<if test='null!=item.package_type'>package_type = #{item.package_type},</if>"
			+ "<if test='null!=item.lot_num'>lot_num = #{item.lot_num},</if>"
			+ "<if test='null!=item.freight_template_id'>freight_template_id = #{item.freight_template_id},</if>"
			+ "<if test='null!=item.is_pack_sell'>is_pack_sell = #{item.is_pack_sell},</if>"
			+ "<if test='null!=item.promise_template_id'>promise_template_id = #{item.promise_template_id},</if>"
			+ "<if test='null!=item.add_unit'>add_unit = #{item.add_unit},</if>"
			+ "<if test='null!=item.base_unit'>base_unit = #{item.base_unit},</if>"
			+ "<if test='null!=item.add_weight'>add_weight = #{item.add_weight},</if>"
			+ "<if test='null!=item.bulk_order'>bulk_order = #{item.bulk_order},</if>"
			+ "<if test='null!=item.bulk_discount'>bulk_discount = #{item.bulk_discount}</if>"
			+ "</trim> where id=#{item.id}</script>")
	Integer updateAliexpressProductById(@Param("item") AliexpressProductPO model);
}
