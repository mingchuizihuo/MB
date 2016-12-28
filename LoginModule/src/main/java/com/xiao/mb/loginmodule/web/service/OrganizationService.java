package com.xiao.mb.loginmodule.web.service;


import com.xiao.mb.commonmodule.core.generic.GenericService;
import com.xiao.mb.loginmodule.web.domain.pojo.SysOrganization;
import com.xiao.mb.loginmodule.web.domain.pojo.SysOrganizationExample;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface OrganizationService extends GenericService<SysOrganization,Long,SysOrganizationExample>{




    Object findAllWithExclude(SysOrganization excludeOraganization);

    void move(SysOrganization source, SysOrganization target);
}
