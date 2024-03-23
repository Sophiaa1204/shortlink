package com.sophia.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sophia.shortlink.admin.dao.entity.UserDO;
import com.sophia.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 用户名是否存在
     * @param username 用户名
     * @return 用户名存在返回 True, 用户名不存在返回 False
     */
    Boolean hasUserName(String username);
}
