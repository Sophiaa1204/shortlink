package com.sophia.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sophia.shortlink.admin.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接分组实体
 */
@Data
@TableName("t_group")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDO extends BaseDO {
    private Long id;
    private String gid;
    private String name;
    private String username;
    /**
     * 分组排序
     */
    private Integer sortOrder;
}
