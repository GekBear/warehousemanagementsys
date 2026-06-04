/* 实体表 */
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


CREATE TABLE `entity1` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`name` varchar(256) NOT NULL,
`fileurl` mediumtext NULL,
PRIMARY KEY (`id`)
);


CREATE TABLE `inventory` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`product_id` bigint NOT NULL COMMENT '产品Id',
`supplier_id` bigint NOT NULL COMMENT '供应商ID',
`shelf_id` bigint NOT NULL COMMENT '货架ID',
`productnumber` bigint NOT NULL COMMENT '产品数量',
`inwarehouse_id` bigint NOT NULL COMMENT '入库批次',
PRIMARY KEY (`id`)
) COMMENT='库存';


CREATE TABLE `shelf` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`shelf_name` varchar(256) NOT NULL COMMENT '货架名',
`ware_id` bigint NULL,
PRIMARY KEY (`id`)
) COMMENT='货架';


CREATE TABLE `warehouse` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`warehouse_name` varchar(4000) NOT NULL COMMENT '仓库名',
PRIMARY KEY (`id`)
) COMMENT='仓库';


CREATE TABLE `after_sales_request` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`order_i_d` bigint NOT NULL COMMENT '采购订单编号',
`supplier_i_d` bigint NOT NULL COMMENT '供应商ID',
`request_type` varchar(256) NOT NULL COMMENT '请求类型',
`request_description` varchar(4000) NOT NULL COMMENT '请求描述',
`request_status` varchar(256) NOT NULL DEFAULT '0' COMMENT '处理状态',
`processresult` varchar(4000) NULL COMMENT '处理结果',
PRIMARY KEY (`id`)
) COMMENT='售后请求';


CREATE TABLE `purchase_contract` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`order_i_d` bigint(20) NOT NULL COMMENT '采购订单编号',
`contract_amount` decimal(31,2) NOT NULL COMMENT '合同金额',
`contract_status` varchar(256) NOT NULL DEFAULT '0' COMMENT '合同状态',
`contract_file` varchar(4000) NULL COMMENT '合同文件',
`contract_name` varchar(4000) NULL DEFAULT '采购合同' COMMENT '合同名称',
PRIMARY KEY (`id`)
) COMMENT='采购合同';


CREATE TABLE `product` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`product_name` varchar(256) NOT NULL COMMENT '产品名称',
`description` varchar(256) NOT NULL COMMENT '产品规格',
`supiller_id` bigint NOT NULL COMMENT '供应商ID',
`stock_quantity` bigint NOT NULL COMMENT '库存数量',
`supplier_name` varchar(256) NOT NULL COMMENT '供应商名称',
`product_potot` varchar(4000) NOT NULL COMMENT '产品图片',
`unit1` decimal(31,2) NULL COMMENT '产品单价',
PRIMARY KEY (`id`)
) COMMENT='库存产品';


CREATE TABLE `purchase_order_detai` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`order_i_d` bigint NOT NULL COMMENT '采购订单编号',
`quantity` bigint NOT NULL COMMENT '采购数量',
`unit_price` decimal(31,2) NOT NULL COMMENT '单价',
`total_amount` decimal(31,2) NOT NULL COMMENT '总金额',
`product_i_d` bigint NOT NULL COMMENT '产品ID',
`productname` varchar(256) NOT NULL COMMENT '产品名称',
PRIMARY KEY (`id`)
) COMMENT='采购订单明细';


CREATE TABLE `purchase_order` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`supplier_i_d` bigint NOT NULL COMMENT '供应商ID',
`expected_delivery_date` date NOT NULL COMMENT '预计交货日期',
`order_status` varchar(256) NOT NULL DEFAULT '0' COMMENT '订单状态',
`supplier_name` varchar(256) NOT NULL COMMENT '供应商名称',
`manager` bigint NOT NULL COMMENT '经理意见',
`supplier` bigint NOT NULL COMMENT '供应商意见',
`no` mediumtext NULL COMMENT '驳回原因',
`supplierno` mediumtext NULL COMMENT '供应商驳回原因',
`after` varchar(256) NOT NULL DEFAULT '0' COMMENT '有无售后',
`delivery_order` varchar(256) NOT NULL COMMENT '收货地址',
`documents` varchar(256) NOT NULL DEFAULT '0' COMMENT '发票生成',
PRIMARY KEY (`id`)
) COMMENT='采购订单';


CREATE TABLE `lcap_logic_view_mapping_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`logic_identifier` varchar(256) NOT NULL COMMENT '/api/logic1:GET',
`resource_name` varchar(256) NOT NULL COMMENT '/dashboard/button1',
`resource_type` varchar(256) NOT NULL COMMENT '页面-page 组件-component 逻辑-logic',
`group` bigint NOT NULL COMMENT '值一样的为同一组',
`change_time` bigint NULL COMMENT '创建时间',
PRIMARY KEY (`id`)
) COMMENT='记录应用全局逻辑与页面资源的关联关系';


CREATE TABLE `lcap_user_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`user_id` varchar(256) NOT NULL COMMENT '第三方登录方式唯一id；普通登录使用userName+source作为userId',
`user_name` varchar(256) NOT NULL COMMENT '普通登录用户名，类似账号的概念',
`password` varchar(256) NULL COMMENT '普通登录密码，密码建议加密存储。第三方登录不会存储密码',
`phone` varchar(256) NULL COMMENT '手机号',
`email` varchar(256) NULL COMMENT '邮箱',
`display_name` varchar(256) NULL COMMENT '展示的名称',
`status` varchar(256) NULL DEFAULT 'Normal' COMMENT '状态，标识当前用户的状态是什么',
`source` varchar(256) NOT NULL DEFAULT 'Normal' COMMENT '当前条用户数据来自哪个用户源，如普通登录、微信登录',
`role_id` bigint NULL COMMENT '角色ID',
PRIMARY KEY (`id`)
) COMMENT='制品应用的用户实体。
1 实体名称不允许改动
2 默认生成的字段不允许改动
3 可新增自定义字段（避免设置为非空且无默认值）';


CREATE TABLE `lcap_role_per_mapping_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`role_id` bigint NOT NULL COMMENT '角色唯一ID',
`permission_id` bigint NOT NULL COMMENT '权限唯一ID',
PRIMARY KEY (`id`)
) COMMENT='角色权限关联实体。新增角色一般需要新增角色对应的权限。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_per_res_mapping_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`permission_id` bigint NOT NULL COMMENT '权限唯一ID',
`resource_id` bigint NOT NULL COMMENT '资源唯一ID',
PRIMARY KEY (`id`)
) COMMENT='权限与资源的关联实体。一组权限会包含若干资源路径，权限对应角色。为角色绑定移除资源需操作该表。默认字段不允许改动，可新增字段。';


CREATE TABLE `lcap_user_role_mapping_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`user_id` varchar(256) NOT NULL COMMENT '用户唯一ID',
`role_id` bigint NOT NULL COMMENT '角色唯一ID',
`user_name` varchar(256) NULL COMMENT '用户名',
`source` varchar(256) NULL COMMENT '用户来源',
PRIMARY KEY (`id`)
) COMMENT='用户与角色关联实体。操作该表可完成为角色添加成员、移除角色成员等。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_role_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`uuid` varchar(256) NULL COMMENT '唯一标识',
`name` varchar(256) NOT NULL COMMENT '角色名',
`description` varchar(256) NULL COMMENT '角色描述',
`role_status` tinyint(1) NULL DEFAULT 1 COMMENT '角色状态，可配置true启用，false禁用。',
`editable` tinyint(1) NULL DEFAULT 1 COMMENT '系统字段，请勿修改。web新增为可编辑true，ide新增为不可编辑false。',
PRIMARY KEY (`id`)
) COMMENT='用户与角色关联实体。操作该表可完成为角色添加成员、移除角色成员等。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_permission_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`uuid` varchar(256) NULL COMMENT '唯一标识',
`name` varchar(256) NOT NULL COMMENT '权限名称',
`description` varchar(256) NULL COMMENT '权限描述',
PRIMARY KEY (`id`)
) COMMENT='权限实体。新增角色的同时要一般需要绑定角色对应的权限。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_resource_6568a7` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(256) NULL COMMENT '创建者',
`updated_by` varchar(256) NULL COMMENT '更新者',
`uuid` varchar(256) NULL COMMENT '唯一标识',
`name` varchar(256) NOT NULL COMMENT '资源路径，如/test/api',
`description` varchar(256) NULL COMMENT '资源描述',
`type` varchar(256) NULL COMMENT '资源类型',
`client_type` varchar(256) NULL COMMENT '端标识',
PRIMARY KEY (`id`)
) COMMENT='资源实体。该表的数据是新建组件后，系统自动上报的。name字段对应资源路径。默认生成的字段不允许改动，可新增自定义字段。';


