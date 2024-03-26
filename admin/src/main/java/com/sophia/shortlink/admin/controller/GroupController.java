package com.sophia.shortlink.admin.controller;

import com.sophia.shortlink.admin.common.convention.result.Result;
import com.sophia.shortlink.admin.common.convention.result.Results;
import com.sophia.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.sophia.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor // 构造方法式注入
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}
