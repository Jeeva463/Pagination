package com.example.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.page.common.ApiResponse;
import com.example.page.entity.Product;
import com.example.page.service.ProductService;

@RestController
@RequestMapping("/api/page")
public class ProductController {
	
	@Autowired
	ProductService ProductService;
	@PostMapping("/post")
	
	public Product saveDetails(@RequestBody Product product) {
		ProductService.saveDetails(product);
		return product;
	}
	@GetMapping("/get")
	
	public ApiResponse getDetails (Pageable pageable){
		ApiResponse response = ProductService.getDetails(pageable);
		return response;
		 	}
	

}
