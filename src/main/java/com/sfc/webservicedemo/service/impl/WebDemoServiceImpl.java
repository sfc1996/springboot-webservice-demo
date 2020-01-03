package com.sfc.webservicedemo.service.impl;

import com.sfc.webservicedemo.service.WebDemoService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(serviceName = "WebDemoService"
            ,targetNamespace="http://service.webservicedemo.webservice.sfc.com/"
            ,endpointInterface = "com.sfc.webservicedemo.service.WebDemoService")
public class WebDemoServiceImpl implements WebDemoService {

    @Override
    public String fun() {
    return "web service远程调用！";
    }
}
