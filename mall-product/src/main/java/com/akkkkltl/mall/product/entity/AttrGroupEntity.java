package com.akkkkltl.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
// import java.util.Date;
import lombok.Data;

/**
 * 属性分组
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-06 20:53:26
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 组名
	 */
	private String attrGroupName;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 描述
	 */
	private String descript;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 所属分类id
	 */
	private Long catelogId;

}
