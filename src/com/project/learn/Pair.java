package com.project.learn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pair<X,Y> {
	
	public X name;
	public Y id;
	
	void m1() {
		List<Date> list = new ArrayList<Date>();
		m2(list);
	}
	
	void m2(Object arg) {
		List<String> list = (List<String>) arg; 
		m3(list);
	}

	void m3 (List<String> list) {
		 String s = list.get(0); 
	}
}
