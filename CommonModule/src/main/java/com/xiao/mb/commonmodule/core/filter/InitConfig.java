package com.xiao.mb.commonmodule.core.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ResourceBundle;

public class InitConfig implements ServletContextListener {

    @Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ResourceBundle rb = ResourceBundle.getBundle("domainConfig");

		// //项目服务器域名
		String domainUrl = rb.getString("domainUrl").toString();
//		String onecardUrl = rb.getString("onecardUrl").toString();


		sce.getServletContext().setAttribute("domainUrl", domainUrl);
//		sce.getServletContext().setAttribute("onecardUrl",onecardUrl);
	}
	
}