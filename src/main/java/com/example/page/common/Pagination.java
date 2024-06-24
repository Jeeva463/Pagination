package com.example.page.common;

import org.springframework.data.domain.Page;

import lombok.Data;
@Data
public class Pagination{
    private int page;
    private int pageNumber;
    private long totalElements;
    private int Size;//one page-kul ulla total element count
    private boolean isFirstPage;
    private boolean isLastPage;
    
    public static <T> Pagination create(Page<T>page) {
    	Pagination pagination = new Pagination();
    	pagination.setFirstPage(page.isFirst());
    	pagination.setLastPage(page.isLast());
    	pagination.setPage(page.getTotalPages());
    	pagination.setPageNumber(page.getNumber());
    	pagination.setSize(page.getSize());
    	pagination.setTotalElements(page.getTotalElements());
		return pagination;
    	
    }

}
