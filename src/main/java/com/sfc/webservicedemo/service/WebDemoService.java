package com.sfc.webservicedemo.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(targetNamespace = "http://service.webservicedemo.webservice.sfc.com/")
public interface WebDemoService {

    String fun();
}
