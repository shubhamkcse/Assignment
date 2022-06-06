package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.proxy.AppProxy;

@Service
public class ServiceLayer {

	
	private final AppProxy appProxy;

	@Autowired
	public ServiceLayer(AppProxy appProxy) {
		super();
		this.appProxy = appProxy;
	}
	
	public String getProxytest()
	{
		return appProxy.test();
	}
	
}
