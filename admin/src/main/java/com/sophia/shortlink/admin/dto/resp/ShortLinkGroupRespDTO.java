package com.sophia.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 短链接返回实体对象
 */
@Data
public class ShortLinkGroupRespDTO {
    private String gid;
    private String name;
    private String username;
    /**
     * 分组排序
     */
    private Integer sortOrder;
}
