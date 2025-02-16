package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class X {
	@Autowired
	Y yy; // = new Y() ;  //NullPointerException occur 500 
     
	@GetMapping("cally")
	String callm1ofy() {
			return yy.m1();
		
	}
}
