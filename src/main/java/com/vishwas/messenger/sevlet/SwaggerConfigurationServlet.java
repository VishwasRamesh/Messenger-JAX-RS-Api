package com.vishwas.messenger.sevlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfigurationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setTitle("Messenger Api documentation");
        beanConfig.setBasePath("/messenger/webapi");
        beanConfig.setResourcePackage("com.vishwas.messenger.resources");
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan(true);
	}

}
