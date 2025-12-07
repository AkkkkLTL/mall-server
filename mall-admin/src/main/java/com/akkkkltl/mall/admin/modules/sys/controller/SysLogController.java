package com.akkkkltl.mall.admin.modules.sys.controller;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akkkkltl.mall.admin.common.utils.PageUtils;
import com.akkkkltl.mall.admin.common.utils.R;
import com.akkkkltl.mall.admin.modules.sys.service.SysLogService;



/**
 * 系统日志
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-16 18:57:06
 */
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
    @Autowired
	private SysLogService sysLogService;
	
	/**
	 * 列表
	 */
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("sys:log:list")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = sysLogService.queryPage(params);

		return R.ok().put("page", page);
	}

}
