package com.xiao.mb.loginmodule.web.realm;

import com.xiao.mb.loginmodule.web.domain.pojo.SysUser;
import com.xiao.mb.loginmodule.web.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiao on 2016/12/28.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService sysUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        /**
         * 获取用户名
         */
        String username = (String)principalCollection.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo  = new SimpleAuthorizationInfo();

        authorizationInfo.setRoles(sysUserService.findRoles(username));//获取用户的所有角色

        authorizationInfo.setStringPermissions(sysUserService.findPermissions(username));//获取用户所有权
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        SysUser user = sysUserService.findByUsername(username);

        if(user==null){
            throw new UnknownAccountException();//没找到帐号
        }
        if(user.getLocked()==0){
            throw new LockedAccountException(); //帐号锁定
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getUserPassword(), //密码
                ByteSource.Util.bytes(user.getSalt()),//salt=username+salt
                getName()  //realm name
        );

        return authenticationInfo;
    }
}
