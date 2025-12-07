package com.akkkkltl.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.common.utils.Query;

import com.akkkkltl.mall.product.dao.ProduceAttrValueDao;
import com.akkkkltl.mall.product.entity.ProduceAttrValueEntity;
import com.akkkkltl.mall.product.service.ProduceAttrValueService;


@Service("produceAttrValueService")
public class ProduceAttrValueServiceImpl extends ServiceImpl<ProduceAttrValueDao, ProduceAttrValueEntity> implements ProduceAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProduceAttrValueEntity> page = this.page(
                new Query<ProduceAttrValueEntity>().getPage(params),
                new QueryWrapper<ProduceAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}