package com.akkkkltl.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-08 21:02:40
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

