package com.akkkkltl.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
// import java.util.Date;
import lombok.Data;

/**
 * 采购详细信息
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 22:21:51
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 采购单id
	 */
	private Long purchaseId;
	/**
	 * 采购商品id
	 */
	private Long skuId;
	/**
	 * 采购数量
	 */
	private Integer skuNum;
	/**
	 * 采购金额
	 */
	private BigDecimal skuPrice;
	/**
	 * 仓库id
	 */
	private Long wareId;
	/**
	 * 状态【0->新建；1->已分配；2->正在采购；3->已完成；4->采购失败】
	 */
	private Integer status;

}
