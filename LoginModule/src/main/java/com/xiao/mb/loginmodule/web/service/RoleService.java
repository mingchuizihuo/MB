package com.xiao.mb.loginmodule.web.service;

import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.loginmodule.web.domain.pojo.SysRole;
import com.xiao.mb.loginmodule.web.domain.pojo.SysRoleExample;

import java.util.Set;

public interface RoleService extends GenericService<SysRole,Long,SysRoleExample> {
    Set<String> findRoles(Long... roleIds); //根据角色编号得到角色标识符列表
    Set<String> findPermissions(Long[] roleIds); //根据角色编号得到权限字符串列表



}  