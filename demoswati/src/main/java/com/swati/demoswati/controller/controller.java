package com.swati.demoswati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
@RequestMapping("/")
public String Swati(){

	return "Swati";
	
}
}
