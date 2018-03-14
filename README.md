# BillList
My personal bills and daily tasks


账单表 Bill list

| 字段名               | 意义                              | 类型            |
| ----------------- | ------------------------------- | ------------- |
| id                | 唯一id                            | int           |
| user_id           | 用户id                            | int           |
| bill_money        | 金额                              | decimal(10,2) |
| bill_type         | 账单类别（1. 支出 2. 收入）               | tinyint(3)    |
| consumption_type  | 消费类别（1.吃 2.穿 3.住 4.话费5.人情 6.其他） | tinyint(3)    |
| create_time       | 时间                              | timestamp     |
| consumption_space | 地点                              | varchar(50)   |
| has_who           | 人物（默认自己）                        | varchar(50)   |
| remark            | 备注                              | varchar(150)  |

计划清单 Plan list

| 字段名          | 意义          | 类型           |
| ------------ | ----------- | ------------ |
| id           | 唯一id        | int          |
| user_id      | 用户id        | int          |
| plan_content | 计划内容        | varchar(150) |
| plan_type    | 计划状态（默认未完成） | tinyint(3)   |
| create_time  | 创建时间        | timestamp    |
|              |             |              |

