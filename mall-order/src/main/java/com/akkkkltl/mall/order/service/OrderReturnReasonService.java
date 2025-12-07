package com.akkkkltl.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 22:10:07
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

