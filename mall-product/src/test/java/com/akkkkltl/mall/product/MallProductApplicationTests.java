package com.akkkkltl.mall.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.akkkkltl.mall.product.entity.BrandEntity;
import com.akkkkltl.mall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();

		// 品牌创建测试
		// brandEntity.setDescript("");
		// brandEntity.setName("华为");
		// brandService.save(brandEntity);
		// System.out.println("保存成功...");

		// 品牌更新测试
		// brandEntity.setBrandId(1L);
		// brandEntity.setDescript("华为222");
		// brandService.updateById(brandEntity);

		// 品牌查询测试
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", brandEntity.getBrandId()));
		list.forEach(item -> {
			System.out.println(item);
		});
	}

}
