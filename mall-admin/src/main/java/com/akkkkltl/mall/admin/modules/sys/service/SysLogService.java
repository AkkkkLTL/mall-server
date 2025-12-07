package com.akkkkltl.mall.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.mall.admin.common.utils.PageUtils;
import com.akkkkltl.mall.admin.modules.sys.entity.SysLogEntity;


import java.util.Map;

/**
 * 系统日志
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

