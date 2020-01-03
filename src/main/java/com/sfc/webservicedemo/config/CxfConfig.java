package com.sfc.webservicedemo.config;

import com.sfc.webservicedemo.service.WebDemoService;
import com.sfc.webservicedemo.service.impl.WebDemoServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private WebDemoService webDemoService;

    @Bean
    public Endpoint endpoint() {

        EndpointImpl endpoint = new EndpointImpl(bus,webDemoService);

        endpoint.publish("/webService");//接口发布在 /NetbarServices 目录下
        //服务终端加拦截器
        //endpoint.getInInterceptors().add(ipAddressInInterceptor());
        return endpoint;
        //return null;
    }
}
