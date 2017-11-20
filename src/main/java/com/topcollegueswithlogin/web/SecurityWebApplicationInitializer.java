package com.topcollegueswithlogin.web;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.topcollegueswithlogin.config.SecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}
