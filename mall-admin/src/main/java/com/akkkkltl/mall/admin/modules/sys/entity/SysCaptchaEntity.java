package com.akkkkltl.mall.admin.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import lombok.Data;

/**
 * 系统验证码
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Data
@TableName("sys_captcha")
public class SysCaptchaEntity {
	/**
	 * uuid
	 */
	@TableId(type = IdType.INPUT)
	private String uuid;
	/**
	 * 验证码
	 */
	private String code;
	/**
	 * 过期时间
	 */
	private Date expireTime;

}
