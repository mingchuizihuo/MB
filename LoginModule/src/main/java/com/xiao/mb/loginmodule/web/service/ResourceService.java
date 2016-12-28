package com.xiao.mb.loginmodule.web.service;

import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.loginmodule.web.domain.pojo.SysResource;
import com.xiao.mb.loginmodule.web.domain.pojo.SysResourceExample;

import java.util.List;
import java.util.Set;

public interface ResourceService extends GenericService<SysResource,Long,SysResourceExample> {
    Set<String> findPermissions(Set<Long> resourceIds); //得到资源对应的权限字符串
    List<SysResource> findMenus(Set<String> permissions); //根据用户权限得到菜单




}  