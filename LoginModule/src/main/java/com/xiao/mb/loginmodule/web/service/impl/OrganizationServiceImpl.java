package com.xiao.mb.loginmodule.web.service.impl;

import com.xiao.mb.commonmodule.core.generic.GenericDao;
import com.xiao.mb.commonmodule.core.generic.GenericServiceImpl;
import com.xiao.mb.loginmodule.web.dao.SysOrganizationMapper;
import com.xiao.mb.loginmodule.web.domain.pojo.SysOrganization;
import com.xiao.mb.loginmodule.web.domain.pojo.SysOrganizationExample;
import com.xiao.mb.loginmodule.web.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/12/28.
 */
@Service
public class OrganizationServiceImpl extends GenericServiceImpl<SysOrganization,Long,SysOrganizationExample> implements OrganizationService{

   @Autowired
   private SysOrganizationMapper organizationMapper;



    @Override
    public Object findAllWithExclude(SysOrganization excludeOraganization) {
        return null;
    }

    @Override
    public void move(SysOrganization source, SysOrganization target) {

    }

    @Override
    public GenericDao<SysOrganization, Long, SysOrganizationExample> getDao() {
        return organizationMapper;
    }
}
