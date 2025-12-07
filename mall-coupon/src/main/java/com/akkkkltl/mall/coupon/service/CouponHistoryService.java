package com.akkkkltl.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 19:49:00
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

