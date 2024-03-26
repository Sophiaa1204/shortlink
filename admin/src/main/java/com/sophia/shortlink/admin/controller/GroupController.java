package com.sophia.shortlink.admin.controller;

import com.sophia.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor // 构造方法式注入
public class GroupController {
    private final GroupService groupService;
}
