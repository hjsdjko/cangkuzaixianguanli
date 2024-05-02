package com.entity.view;

import com.entity.ShangpinChuruInoutListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入库详情
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_churu_inout_list")
public class ShangpinChuruInoutListView extends ShangpinChuruInoutListEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shangpin
			/**
			* 物品编号
			*/
			private String shangpinUuidNumber;
			/**
			* 物品名称
			*/
			private String shangpinName;
			/**
			* 物品类型
			*/
			private Integer shangpinTypes;
				/**
				* 物品类型的值
				*/
				private String shangpinValue;
			/**
			* 物品库存
			*/
			private Integer shangpinKucunNumber;
			/**
			* 供货方
			*/
			private Integer gonghuofangTypes;
				/**
				* 供货方的值
				*/
				private String gonghuofangValue;

		//级联表 shangpin_churu_inout
			/**
			* 出入库流水号
			*/
			private String shangpinChuruInoutUuidNumber;
			/**
			* 出入库名称
			*/
			private String shangpinChuruInoutName;
			/**
			* 出入库类型
			*/
			private Integer shangpinChuruInoutTypes;
				/**
				* 出入库类型的值
				*/
				private String shangpinChuruInoutValue;
			/**
			* 收货单位
			*/
			private String shangpinDanwei;
			/**
			* 经手人
			*/
			private String shangpinJingshouren;
			/**
			* 备注
			*/
			private String shangpinChuruInoutContent;

	public ShangpinChuruInoutListView() {

	}

	public ShangpinChuruInoutListView(ShangpinChuruInoutListEntity shangpinChuruInoutListEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinChuruInoutListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set shangpin
					/**
					* 获取： 物品编号
					*/
					public String getShangpinUuidNumber() {
						return shangpinUuidNumber;
					}
					/**
					* 设置： 物品编号
					*/
					public void setShangpinUuidNumber(String shangpinUuidNumber) {
						this.shangpinUuidNumber = shangpinUuidNumber;
					}
					/**
					* 获取： 物品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 物品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}
					/**
					* 获取： 物品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 物品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 物品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 物品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}
					/**
					* 获取： 物品库存
					*/
					public Integer getShangpinKucunNumber() {
						return shangpinKucunNumber;
					}
					/**
					* 设置： 物品库存
					*/
					public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
						this.shangpinKucunNumber = shangpinKucunNumber;
					}
					/**
					* 获取： 供货方
					*/
					public Integer getGonghuofangTypes() {
						return gonghuofangTypes;
					}
					/**
					* 设置： 供货方
					*/
					public void setGonghuofangTypes(Integer gonghuofangTypes) {
						this.gonghuofangTypes = gonghuofangTypes;
					}


						/**
						* 获取： 供货方的值
						*/
						public String getGonghuofangValue() {
							return gonghuofangValue;
						}
						/**
						* 设置： 供货方的值
						*/
						public void setGonghuofangValue(String gonghuofangValue) {
							this.gonghuofangValue = gonghuofangValue;
						}


				//级联表的get和set shangpin_churu_inout
					/**
					* 获取： 出入库流水号
					*/
					public String getShangpinChuruInoutUuidNumber() {
						return shangpinChuruInoutUuidNumber;
					}
					/**
					* 设置： 出入库流水号
					*/
					public void setShangpinChuruInoutUuidNumber(String shangpinChuruInoutUuidNumber) {
						this.shangpinChuruInoutUuidNumber = shangpinChuruInoutUuidNumber;
					}
					/**
					* 获取： 出入库名称
					*/
					public String getShangpinChuruInoutName() {
						return shangpinChuruInoutName;
					}
					/**
					* 设置： 出入库名称
					*/
					public void setShangpinChuruInoutName(String shangpinChuruInoutName) {
						this.shangpinChuruInoutName = shangpinChuruInoutName;
					}
					/**
					* 获取： 出入库类型
					*/
					public Integer getShangpinChuruInoutTypes() {
						return shangpinChuruInoutTypes;
					}
					/**
					* 设置： 出入库类型
					*/
					public void setShangpinChuruInoutTypes(Integer shangpinChuruInoutTypes) {
						this.shangpinChuruInoutTypes = shangpinChuruInoutTypes;
					}


						/**
						* 获取： 出入库类型的值
						*/
						public String getShangpinChuruInoutValue() {
							return shangpinChuruInoutValue;
						}
						/**
						* 设置： 出入库类型的值
						*/
						public void setShangpinChuruInoutValue(String shangpinChuruInoutValue) {
							this.shangpinChuruInoutValue = shangpinChuruInoutValue;
						}
					/**
					* 获取： 收货单位
					*/
					public String getShangpinDanwei() {
						return shangpinDanwei;
					}
					/**
					* 设置： 收货单位
					*/
					public void setShangpinDanwei(String shangpinDanwei) {
						this.shangpinDanwei = shangpinDanwei;
					}
					/**
					* 获取： 经手人
					*/
					public String getShangpinJingshouren() {
						return shangpinJingshouren;
					}
					/**
					* 设置： 经手人
					*/
					public void setShangpinJingshouren(String shangpinJingshouren) {
						this.shangpinJingshouren = shangpinJingshouren;
					}
					/**
					* 获取： 备注
					*/
					public String getShangpinChuruInoutContent() {
						return shangpinChuruInoutContent;
					}
					/**
					* 设置： 备注
					*/
					public void setShangpinChuruInoutContent(String shangpinChuruInoutContent) {
						this.shangpinChuruInoutContent = shangpinChuruInoutContent;
					}










}
