drop table if exists wms_purchase;

drop table if exists wms_purchase_detail;

drop table if exists wms_ware_info;

drop table if exists wms_ware_order_task;

drop table if exists wms_ware_order_task_detail;

drop table if exists wms_ware_sku;

CREATE TABLE `wms_purchase`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '采购单id',
  `assignee_id` bigint NULL DEFAULT NULL COMMENT '采购人id',
  `assignee_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '采购人名',
  `phone` char(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `priority` int NULL DEFAULT NULL COMMENT '优先级',
  `status` int NULL DEFAULT NULL COMMENT '状态',
  `ware_id` bigint NULL DEFAULT NULL COMMENT '仓库id',
  `amount` decimal(18, 4) NULL DEFAULT NULL COMMENT '总金额',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '采购信息' ROW_FORMAT = DYNAMIC;

CREATE TABLE `wms_purchase_detail`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `purchase_id` bigint NULL DEFAULT NULL COMMENT '采购单id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT '采购商品id',
  `sku_num` int NULL DEFAULT NULL COMMENT '采购数量',
  `sku_price` decimal(18, 4) NULL DEFAULT NULL COMMENT '采购金额',
  `ware_id` bigint NULL DEFAULT NULL COMMENT '仓库id',
  `status` int NULL DEFAULT NULL COMMENT '状态【0->新建；1->已分配；2->正在采购；3->已完成；4->采购失败】',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '采购详细信息' ROW_FORMAT = DYNAMIC;

CREATE TABLE `wms_ware_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '仓库名',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '仓库地址',
  `areacode` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '区域编码',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '仓库信息' ROW_FORMAT = DYNAMIC;

CREATE TABLE `wms_ware_order_task`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `order_id` bigint NULL DEFAULT NULL COMMENT 'order_id',
  `order_sn` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'order_sn',
  `consignee` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货人',
  `consignee_tel` char(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货人电话',
  `delivery_address` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '配送地址',
  `order_comment` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单备注',
  `payment_way` tinyint NULL DEFAULT NULL COMMENT '付款方式【1->在线付款；2->货到付款】',
  `task_status` tinyint NULL DEFAULT NULL COMMENT '任务状态',
  `order_body` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单描述',
  `tracking_no` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物流单号',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `ware_id` bigint NULL DEFAULT NULL COMMENT '仓库id',
  `task_comment` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作单备注',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '库存工作单' ROW_FORMAT = DYNAMIC;

CREATE TABLE `wms_ware_order_task_detail`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT 'sku_id',
  `sku_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'sku_name',
  `sku_num` int NULL DEFAULT NULL COMMENT '购买个数',
  `task_id` bigint NULL DEFAULT NULL COMMENT '工作单id',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '库存工作单详情' ROW_FORMAT = DYNAMIC;

CREATE TABLE `wms_ware_sku`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_id` bigint NULL DEFAULT NULL COMMENT 'sku_id',
  `ware_id` bigint NULL DEFAULT NULL COMMENT '仓库id',
  `stock` int NULL DEFAULT NULL COMMENT '库存数',
  `sku_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'sku_name',
  `stock_locked` int NULL DEFAULT NULL COMMENT '锁定库存',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品库存' ROW_FORMAT = DYNAMIC;

