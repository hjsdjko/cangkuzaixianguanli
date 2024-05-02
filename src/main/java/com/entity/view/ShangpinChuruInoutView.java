package com.entity.view;

import com.entity.ShangpinChuruInoutEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入库
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_churu_inout")
public class ShangpinChuruInoutView extends ShangpinChuruInoutEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 出入库类型的值
		*/
		private String shangpinChuruInoutValue;



	public ShangpinChuruInoutView() {

	}

	public ShangpinChuruInoutView(ShangpinChuruInoutEntity shangpinChuruInoutEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinChuruInoutEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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









}
