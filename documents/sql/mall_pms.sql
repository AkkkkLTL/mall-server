drop table if exists pms_attr;

drop table if exists pms_attr_attrgroup_relation;

drop table if exists pms_attr_group;

drop table if exists pms_brand;

drop table if exists pms_category;

drop table if exists pms_category_brand_relation;

drop table if exists pms_comment_replay;

drop table if exists pms_product_attr_value;

drop table if exists pms_sku_images;

drop table if exists pms_sku_info;

drop table if exists pms_sku_sale_attr_value;

drop table if exists pms_spu_comment;

drop table if exists pms_spu_images;

drop table if exists pms_spu_info;

drop table if exists pms_spu_info_desc;

CREATE TABLE `pms_attr`  (
  `attr_id` bigint NOT NULL AUTO_INCREMENT COMMENT '属性id',
  `attr_name` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性名',
  `search_type` tinyint NULL DEFAULT NULL COMMENT '是否需要检索【0->不需要，1->需要】',
  `value_type` tinyint NULL DEFAULT NULL COMMENT '值类型【0->为单个值，1->可以选择多个值】',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性图标',
  `value_select` char(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '可选值列表【用逗号分隔】',
  `attr_type` tinyint NULL DEFAULT NULL COMMENT '属性类型【0->销售属性，1->基本属性】',
  `enable` bigint NULL DEFAULT NULL COMMENT '启用状态【0->禁用，1->启用】',
  `catelog_id` bigint NULL DEFAULT NULL COMMENT '所属分类',
  `show_desc` tinyint NULL DEFAULT NULL COMMENT '快速展示【是否展示在介绍上：0->否，1->是】，在sku中仍然可以调整',
  PRIMARY KEY (`attr_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品属性' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_attr_attrgroup_relation`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `attr_id` bigint NULL DEFAULT NULL COMMENT '属性id',
  `attr_group_id` bigint NULL DEFAULT NULL COMMENT '属性分组id',
  `attr_sort` int NULL DEFAULT NULL COMMENT '属性组内排序',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '属性&属性分组关联' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_attr_group`  (
  `attr_group_id` bigint NOT NULL AUTO_INCREMENT COMMENT '分组id',
  `attr_group_name` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '组名',
  `sort` int NULL DEFAULT NULL COMMENT '排序',
  `descript` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图标',
  `catelog_id` bigint NULL DEFAULT NULL COMMENT '所属分类id',
  PRIMARY KEY (`attr_group_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '属性分组' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_brand`  (
  `brand_id` bigint NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` char(50) NULL COMMENT '品牌名',
  `logo` varchar(2000) NULL COMMENT '品牌logo地址',
  `descript` longtext NULL COMMENT '介绍',
  `show_status` tinyint NULL COMMENT '显示状态【0->不显示；1->显示】',
  `first_letter` char(1) NULL COMMENT '检索首字母',
  `sort` int NULL COMMENT '排序',
  PRIMARY KEY (`brand_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '品牌表' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_category`  (
  `cat_id` bigint NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `name` char(50) NULL COMMENT '分类名称',
  `parent_cid` bigint NULL COMMENT '父分类id',
  `cat_level` int NULL COMMENT '层级',
  `show_status` tinyint NULL COMMENT '是否显示【0->不显示；1->显示】',
  `sort` int NULL COMMENT '排序',
  `icon` char(255) NULL COMMENT '图标地址',
  `product_unit` char(50) NULL COMMENT '计量单位',
  `product_count` int NULL COMMENT '商品数量',
  PRIMARY KEY (`cat_id`),
  INDEX `parent_cid`(`parent_cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品三级分类' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_comment_replay`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `comment_id` bigint NULL COMMENT '评论id',
  `reply_id` bigint NULL COMMENT '回复id',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品评价回复关系' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_produce_attr_value`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `spu_id` bigint NULL DEFAULT NULL COMMENT '商品id',
  `attr_id` bigint NULL DEFAULT NULL COMMENT '属性id',
  `attr_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性名',
  `attr_value` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性值',
  `attr_sort` int NULL DEFAULT NULL COMMENT '顺序',
  `quick_show` tinyint NULL DEFAULT NULL COMMENT '快速展示【是否展示在介绍上：0->否；1->是】',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'spu属性值' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_sku_images`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT 'sku_id',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `img_sort` int NULL DEFAULT NULL COMMENT '排序',
  `default_img` int NULL DEFAULT NULL COMMENT '默认图【0->不是默认图；1->是默认图】',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'sku图片' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_sku_info`  (
  `sku_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'skuId',
  `spu_id` bigint NULL COMMENT 'spuId',
  `sku_name` varchar(255) NULL COMMENT 'sku名称',
  `sku_desc` varchar(2000) NULL COMMENT 'sku介绍描述',
  `catalog_id` bigint NULL COMMENT '所属分类id',
  `brand_id` bigint NULL COMMENT '品牌id',
  `sku_default_img` varchar(255) NULL COMMENT '默认图片',
  `sku_title` varchar(255) NULL COMMENT '标题',
  `sku_subtitle` varchar(2000) NULL COMMENT '副标题',
  `price` decimal(18, 4) NULL COMMENT '价格',
  `sale_count` bigint NULL COMMENT '销量',
  PRIMARY KEY (`sku_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci COMMENT = 'sku信息' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_sku_sale_attr_value`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT 'sku_id',
  `attr_id` bigint NULL DEFAULT NULL COMMENT 'attr_id',
  `attr_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '销售属性名',
  `attr_value` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '销售属性值',
  `attr_sort` int NULL DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'sku销售属性&值' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_spu_comment`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT 'sku_id',
  `spu_id` bigint NULL DEFAULT NULL COMMENT 'spu_id',
  `spu_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名字',
  `member_nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '会员昵称',
  `star` tinyint NULL DEFAULT NULL COMMENT '星级',
  `member_ip` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '会员ip',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `show_status` tinyint NULL DEFAULT NULL COMMENT '显示状态【0->不显示；1->显示】',
  `spu_attributes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '购买时属性组合',
  `likes_count` int NULL DEFAULT NULL COMMENT '点赞数',
  `reply_count` int NULL DEFAULT NULL COMMENT '回复数',
  `resources` json NULL COMMENT '评论图片/视频[json数据]；[{type:文件类型，url:资源路径}]',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '内容',
  `member_icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `comment_type` tinyint NULL DEFAULT NULL COMMENT '评论类型【0->对商品的直接评论；1->对评论的回复】',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品评价' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_spu_images`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `spu_id` bigint NULL DEFAULT NULL COMMENT 'spu_id',
  `img_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片名',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `img_sort` int NULL DEFAULT NULL COMMENT '顺序',
  `default_img` tinyint NULL DEFAULT NULL COMMENT '是否默认图【0->否；1->是】',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'spu图片' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_spu_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `spu_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `spu_description` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `catalog_id` bigint NULL DEFAULT NULL COMMENT '所属分类id',
  `brand_id` bigint NULL DEFAULT NULL COMMENT '品牌id',
  `weight` decimal(18, 4) NULL DEFAULT NULL,
  `publish_status` tinyint NULL DEFAULT NULL COMMENT '上架状态【0->下架；1->上架】',
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'spu信息' ROW_FORMAT = DYNAMIC;

CREATE TABLE `pms_spu_info_desc`  (
  `spu_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '商品介绍',
  PRIMARY KEY (`spu_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'spu信息介绍' ROW_FORMAT = DYNAMIC;

