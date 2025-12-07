package com.akkkkltl.mall.admin.modules.sys.dao;

import com.akkkkltl.mall.admin.modules.sys.entity.SysUserTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {
	SysUserTokenEntity queryByToken(String token);
}
