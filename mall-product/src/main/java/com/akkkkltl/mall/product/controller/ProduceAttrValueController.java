package com.akkkkltl.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akkkkltl.mall.product.entity.ProduceAttrValueEntity;
import com.akkkkltl.mall.product.service.ProduceAttrValueService;
import com.akkkkltl.common.utils.PageUtils;
import com.akkkkltl.common.utils.R;



/**
 * spu属性值
 *
 * @author akkkkltl
 * @email chengqian567@foxmail.com
 * @date 2025-08-07 22:59:50
 */
@RestController
@RequestMapping("product/produceattrvalue")
public class ProduceAttrValueController {
    @Autowired
    private ProduceAttrValueService produceAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:produceattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = produceAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:produceattrvalue:info")
    public R info(@PathVariable("id") Long id){
		ProduceAttrValueEntity produceAttrValue = produceAttrValueService.getById(id);

        return R.ok().put("produceAttrValue", produceAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:produceattrvalue:save")
    public R save(@RequestBody ProduceAttrValueEntity produceAttrValue){
		produceAttrValueService.save(produceAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:produceattrvalue:update")
    public R update(@RequestBody ProduceAttrValueEntity produceAttrValue){
		produceAttrValueService.updateById(produceAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:produceattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		produceAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
