package com.sophia.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sophia.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

import java.util.Date;

/**
 * 用户返回参数响应
 */
@Data
public class UserRespDTO {
    private Long id;
    private String username;
    private String realName;
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;
    private String mail;
    private Long deletionTime;
    private Date createTime;
    private Date updateTime;
    private Integer delFlag;
}
