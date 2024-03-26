package com.sophia.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sophia.shortlink.admin.common.database.BaseDO;
import lombok.Data;

// 用户持久层实体
@Data
@TableName("t_user")
public class UserDO extends BaseDO {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
    private Long deletionTime;
}
