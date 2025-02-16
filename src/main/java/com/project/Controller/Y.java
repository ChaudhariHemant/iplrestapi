package com.project.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Y {
	    public Y() {
	    	System.err.println(" object ban gaya");
	    }
        String m1() {
        	System.out.println("y.....m1...");
        	return  "m1 is called";
        }
}
