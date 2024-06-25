package com.example.page.dto;

import lombok.Data;

@Data
public class ApiResponse {
	
	Object data;
	String status;
	String error;

}
