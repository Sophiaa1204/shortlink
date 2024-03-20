package com.sophia.shortlink.admin.controller;

import com.sophia.shortlink.admin.dto.resp.UserRespDTO;
import com.sophia.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 */

// RestController是Request Body和Controller这两个接口的结合
@RestController
// 利用构造器方式注入
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {

        return userService.getUserByUsername(username);
    }
}
