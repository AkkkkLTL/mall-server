package com.akkkkltl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.product.entity.ProduceAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-06 20:53:27
 */
public interface ProduceAttrValueService extends IService<ProduceAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

