package com.akkkkltl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-06 20:53:27
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

