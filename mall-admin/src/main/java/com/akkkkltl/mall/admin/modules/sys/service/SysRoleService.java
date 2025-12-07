package com.akkkkltl.mall.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.mall.admin.common.utils.PageUtils;
import com.akkkkltl.mall.admin.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 角色
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}

