CREATE TABLE `documents` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`sala` bigint NOT NULL COMMENT '销售方',
`order_i_d` bigint NOT NULL COMMENT '销售订单号',
`tax_rate` bigint NOT NULL COMMENT '税率',
`price_amout` decimal(31,2) NOT NULL COMMENT '价税合计',
`pay` varchar(256) NOT NULL COMMENT '付款方法',
`xiaoji` decimal(31,2) NOT NULL COMMENT '小计',
`buyer` varchar(256) NOT NULL COMMENT '购买方',
`suifri` decimal(31,2) NOT NULL COMMENT '税费',
PRIMARY KEY (`id`)
);

CREATE TABLE `delivery_order` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`delivery_order` varchar(256) NOT NULL COMMENT '收货地址',
PRIMARY KEY (`id`)
);

ALTER TABLE `entity1` CHANGE COLUMN `name` `name` varchar(256) NOT NULL ;

ALTER TABLE `purchase_contract` CHANGE COLUMN `contract_name` `contract_name` varchar(4000) NULL DEFAULT '采购合同' COMMENT '合同名称';

ALTER TABLE `purchase_order` ADD COLUMN `delivery_order` varchar(256) NOT NULL COMMENT '收货地址';

ALTER TABLE `purchase_order` ADD COLUMN `documents` varchar(256) NOT NULL DEFAULT '0' COMMENT '发票生成';

ALTER TABLE `lcap_user_6568a7` DROP COLUMN `supplier`;

