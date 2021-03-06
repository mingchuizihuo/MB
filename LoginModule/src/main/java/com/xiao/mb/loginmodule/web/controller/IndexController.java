package com.xiao.mb.loginmodule.web.controller;


import com.xiao.mb.loginmodule.web.bind.annotation.CurrentUser;
import com.xiao.mb.loginmodule.web.domain.pojo.SysResource;
import com.xiao.mb.loginmodule.web.domain.pojo.SysUser;
import com.xiao.mb.loginmodule.web.service.ResourceService;
import com.xiao.mb.loginmodule.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-14
 * <p>Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(@CurrentUser SysUser loginUser, Model model) {
        Set<String> permissions = userService.findPermissions(loginUser.getUsername());
        List<SysResource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", menus);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
