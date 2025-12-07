package com.akkkkltl.mall.admin.modules.sys.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

/**
 * 系统配置信息表
 * 
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Data
@TableName("sys_config")
public class SysConfigEntity {
	@TableId
	private Long id;
	@NotBlank(message = "参数键不能为空")
	private String paramKey;
	@NotBlank(message = "参数值不能为空")
	private String paramValue;
	private String remark;

}
