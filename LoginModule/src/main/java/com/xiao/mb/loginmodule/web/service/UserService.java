package com.xiao.mb.loginmodule.web.service;

import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.loginmodule.web.domain.pojo.SysUser;
import com.xiao.mb.loginmodule.web.domain.pojo.SysUserExample;

import java.util.Set;

public interface UserService extends GenericService<SysUser,Long,SysUserExample> {
    public void changePassword(Long userId, String newPassword); //修改密码  
    public SysUser findByUsername(String username); //根据用户名查找用户
    public Set<String> findRoles(String username);// 根据用户名查找其角色
    public Set<String> findPermissions(String username);// 根据用户名查找其权限  
} 