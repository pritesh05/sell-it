package com.xworkz.odc.selling_app.controller;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StartAppController {

	static final Logger LOGGER = LoggerFactory.getLogger(StartAppController.class);
	
	public StartAppController() {
		LOGGER.info("{} is created.....",this.getClass().getSimpleName());
	}
	
	@GetMapping("/")
	public String index() {
		return "Welcome User";
	}
}
