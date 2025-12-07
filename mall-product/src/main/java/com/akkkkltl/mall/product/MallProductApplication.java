package com.akkkkltl.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合MyBatis-Plus
 * 	1.1 导入依赖
 * 	1.2 配置
* 		1.2.1 配置数据源
 * 			1.2.1.1 导入数据库驱动
 * 			1.2.1.2 在application.yml配置数据源相关属性
 * 		1.2.2 配置 MyBatis-Plus
 * 			1.2.2.1 配置MapperScan
 * 			1.2.2.2 告诉 Mybatis-Plus, sql映射文件位置

 */
@MapperScan("com.akkkkltl.mall.product.dao")
@SpringBootApplication()
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
