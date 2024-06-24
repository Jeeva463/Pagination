package com.example.page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.page.common.ApiResponse;
import com.example.page.common.Pagination;
import com.example.page.dto.Dto;
import com.example.page.entity.Product;
import com.example.page.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public void saveDetails(Product product) {
		productRepository.save(product);
		
	}
      // type--1
//	public ApiResponse getDetails(Pageable pageable) {
//		ApiResponse response = new ApiResponse();
//		Page<Product> obj = productRepository.findAll(pageable);
//		response.setData(obj);
//		return response;
//	}
	public ApiResponse getDetails(Pageable pageable) {
		ApiResponse response = new ApiResponse();
		Page<Product> obj = productRepository.findAll(pageable);
		
		Pagination pagination = Pagination.create(obj);//obj vaithu pagination irukkura field answer pannudhu
		List<Product> Product = obj.getContent();//  obj.getContent--edhai type pannale list tha irukkanunu solludhu 
		
		Dto dto = new Dto();
		dto.setPagination(pagination);
		dto.setProduct(Product);
		response.setData(dto);
		return response;
	}
}
