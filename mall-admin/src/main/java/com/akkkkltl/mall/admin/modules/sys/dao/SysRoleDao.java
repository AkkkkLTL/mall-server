package com.akkkkltl.mall.admin.modules.sys.dao;

import com.akkkkltl.mall.admin.modules.sys.entity.SysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * 角色
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
