package com.sophia.shortlink.admin.dto.resp;

import lombok.Data;

import java.util.Date;

@Data
public class UserActualRespDTO {
    private Long id;
    private String username;
    private String realName;
    private String phone;
    private String mail;
    private Long deletionTime;
    private Date createTime;
    private Date updateTime;
    private Integer delFlag;
}
