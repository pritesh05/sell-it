package com.xworkz.odc.selling_app.controller.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	static final Logger LOGGER=LoggerFactory.getLogger(ProductController.class);

	
	public ProductController() {
		LOGGER.info("{} is created.....",this.getClass().getSimpleName());	
	}
}
