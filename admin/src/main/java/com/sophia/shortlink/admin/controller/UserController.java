package com.sophia.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.sophia.shortlink.admin.common.convention.result.Result;
import com.sophia.shortlink.admin.common.convention.result.Results;
import com.sophia.shortlink.admin.dto.req.UserLoginReqDTO;
import com.sophia.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.sophia.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.sophia.shortlink.admin.dto.resp.UserActualRespDTO;
import com.sophia.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.sophia.shortlink.admin.dto.resp.UserRespDTO;
import com.sophia.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    @GetMapping("/api/short-link/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    /**
     * 查询用户名是否存在
     */
    @GetMapping("/api/short-link/v1/user/has-username")
    public  Result<Boolean> hasUsername(@RequestParam("username") String username) {
        System.out.println(username);
        return Results.success(userService.hasUserName(username));
    }

    @PostMapping("/api/short-link/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    @PutMapping("/api/short-link/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录请求
     */
    @PostMapping("/api/short-link/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    /**
     * 检查用户是否登录
     * @param token
     * @return
     */
    @GetMapping("api/short-link/v1/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }

    /**
     * 用户退出登录
     * @param username
     * @param token
     * @return
     */
    @DeleteMapping("api/short-link/v1/user/logout")
    public Result<Void> logout(@RequestParam("username") String username, @RequestParam("token") String token) {
        userService.logout(username,token);
        return Results.success();
    }

}
