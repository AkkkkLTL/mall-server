package com.akkkkltl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-06 20:53:26
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

