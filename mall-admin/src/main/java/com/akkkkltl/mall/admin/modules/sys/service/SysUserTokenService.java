package com.akkkkltl.mall.admin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.akkkkltl.mall.admin.common.utils.R;
import com.akkkkltl.mall.admin.modules.sys.entity.SysUserTokenEntity;

/**
 * 系统用户Token
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

    /**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);
}

