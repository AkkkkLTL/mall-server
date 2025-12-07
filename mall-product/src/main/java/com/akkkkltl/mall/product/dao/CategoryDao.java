package com.akkkkltl.mall.product.dao;

import com.akkkkltl.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-06 20:53:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
