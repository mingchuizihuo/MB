package com.xiao.mb.loginmodule.web.service.impl;

import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.loginmodule.web.dao.SysResourceMapper;
import com.xiao.mb.loginmodule.web.domain.pojo.SysResource;
import com.xiao.mb.loginmodule.web.domain.pojo.SysResourceExample;
import com.xiao.mb.loginmodule.web.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by xiao on 2016/12/28.
 */
@Service
public class ResourceServiceImpl extends GenericServiceImpl<SysResource,Long,SysResourceExample> implements ResourceService {
    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public Set<String> findPermissions(Set<Long> resourceIds) {
        return null;
    }

    @Override
    public List<SysResource> findMenus(Set<String> permissions) {
        return null;
    }



    @Override
    public GenericDao<SysResource, Long, SysResourceExample> getDao() {
        return sysResourceMapper;
    }
}
