package com.xiao.mb.loginmodule.web.service.impl;

import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.loginmodule.web.dao.SysRoleMapper;
import com.xiao.mb.loginmodule.web.domain.pojo.SysRole;
import com.xiao.mb.loginmodule.web.domain.pojo.SysRoleExample;
import com.xiao.mb.loginmodule.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by xiao on 2016/12/28.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<SysRole,Long,SysRoleExample> implements RoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public Set<String> findRoles(Long... roleIds) {
        return null;
    }

    @Override
    public Set<String> findPermissions(Long[] roleIds) {
        return null;
    }

    @Override
    public GenericDao<SysRole, Long, SysRoleExample> getDao() {
        return sysRoleMapper;
    }
}
