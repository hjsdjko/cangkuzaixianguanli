package com.entity.vo;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物品信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangpin")
public class ShangpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物品编号
     */

    @TableField(value = "shangpin_uuid_number")
    private String shangpinUuidNumber;


    /**
     * 物品名称
     */

    @TableField(value = "shangpin_name")
    private String shangpinName;


    /**
     * 物品类型
     */

    @TableField(value = "shangpin_types")
    private Integer shangpinTypes;


    /**
     * 物品库存
     */

    @TableField(value = "shangpin_kucun_number")
    private Integer shangpinKucunNumber;


    /**
     * 供货方
     */

    @TableField(value = "gonghuofang_types")
    private Integer gonghuofangTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品编号
	 */
    public String getShangpinUuidNumber() {
        return shangpinUuidNumber;
    }


    /**
	 * 获取：物品编号
	 */

    public void setShangpinUuidNumber(String shangpinUuidNumber) {
        this.shangpinUuidNumber = shangpinUuidNumber;
    }
    /**
	 * 设置：物品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 设置：物品库存
	 */
    public Integer getShangpinKucunNumber() {
        return shangpinKucunNumber;
    }


    /**
	 * 获取：物品库存
	 */

    public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
        this.shangpinKucunNumber = shangpinKucunNumber;
    }
    /**
	 * 设置：供货方
	 */
    public Integer getGonghuofangTypes() {
        return gonghuofangTypes;
    }


    /**
	 * 获取：供货方
	 */

    public void setGonghuofangTypes(Integer gonghuofangTypes) {
        this.gonghuofangTypes = gonghuofangTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
