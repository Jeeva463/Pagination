package com.example.page.dto;

import java.util.List;

import com.example.page.common.Pagination;
import com.example.page.entity.Product;

import lombok.Data;

@Data
//Pagination class details and Product details seththu katta indha class
public class Dto {
	Pagination pagination;
	List<Product> Product;

}
