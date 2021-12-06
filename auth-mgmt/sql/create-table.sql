CREATE TABLE user_info
(
    user_id     INT auto_increment NOT NULL PRIMARY KEY COMMENT '主键id',
    user_name   VARCHAR(20) NOT NULL COMMENT '用户名',
    gender      CHAR(1)     NOT NULL COMMENT '性别：0-保密，1-女，2-男',
    user_level  CHAR(1)     NOT NULL COMMENT '级别：1--9',
    user_role   CHAR(1)     NOT NULL COMMENT '角色：0-管理员，1-会员，2-普通用户',
    update_time TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
    add_time    TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录新增时间'
);