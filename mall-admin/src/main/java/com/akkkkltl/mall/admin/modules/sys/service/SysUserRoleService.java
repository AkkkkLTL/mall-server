package com.akkkkltl.mall.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.mall.admin.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {

    void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}

