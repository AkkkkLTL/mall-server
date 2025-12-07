package com.akkkkltl.mall.order.dao;

import com.akkkkltl.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 22:10:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
