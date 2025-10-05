package com.shubham.hello_k8s_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@RequestMapping("/")
public String hello() {
	return "hello i aam running";
	}

@RequestMapping("/about")
public String about() {
	return "i am from about section";
	}

}
