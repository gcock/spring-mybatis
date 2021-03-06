package com.spring.fmt;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {
	
	 public Date convert(String source) {   
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");     
	      try {    
	          return dateFormat.parse(source);    
	    } catch (Exception e) {    
	         e.printStackTrace();    
	     }           
	     return null;    
	 }    

	
}
