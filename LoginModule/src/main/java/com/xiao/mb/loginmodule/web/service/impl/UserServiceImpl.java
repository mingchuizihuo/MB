package com.xiao.mb.loginmodule.web.service.impl;

import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.loginmodule.web.dao.SysUserMapper;
import com.xiao.mb.loginmodule.web.domain.pojo.SysUser;
import com.xiao.mb.loginmodule.web.domain.pojo.SysUserExample;
import com.xiao.mb.loginmodule.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by xiao on 2016/12/28.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<SysUser,Long,SysUserExample> implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void changePassword(Long userId, String newPassword) {

    }

    @Override
    public SysUser findByUsername(String username) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);

        List<SysUser> users =  getDao().selectByExample(example);
        if(users.size()==0){
            return new SysUser();
        }else{
            return users.get(0);
        }

    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }


    @Override
    public GenericDao<SysUser, Long, SysUserExample> getDao() {
        return sysUserMapper;
    }
}
