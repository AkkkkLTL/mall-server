package com.akkkkltl.mall.admin.modules.sys.dao;

import com.akkkkltl.mall.admin.modules.sys.entity.SysMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {
    
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();
}
