package com.example.page.common;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ChangeFieldName extends WebMvcConfigurationSupport  {//WebMvcConfigurationSupport class kulla addArgumentResolvers indha method irukku
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {//indha method edhukkuna argument pass panna use panrom
		
		PageableHandlerMethodArgumentResolver change = new PageableHandlerMethodArgumentResolver();//indha class name argument name change panna 
		
		change.setPageParameterName("page-Number");//page replace name
		change.setSizeParameterName("page-Content");//size replace name
		change.setOneIndexedParameters(true);//indha line pagenumber 1-irundhu start aga -->pagination po
		
		Pageable changeSize = PageRequest.of(0, 1);//defaultsize change panna indha line PageableHandlerMethodArgumentResolverSupport irundhu eduthadhu
		
		change.setFallbackPageable(changeSize);
		argumentResolvers.add(change);
	}

}
