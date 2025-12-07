package com.akkkkltl.mall.coupon.dao;

import com.akkkkltl.mall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 19:49:00
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
