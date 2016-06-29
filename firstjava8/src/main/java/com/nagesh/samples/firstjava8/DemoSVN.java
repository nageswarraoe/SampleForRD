package com.nagesh.samples.firstjava8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DemoSVN {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(2, 4, 3, 7, 9);

		l1.forEach(System.out::println);
		
		System.out.println("hello end of program");
		
		System.out.println("hello ");
		
		System.out.println("hello2 ");
		
		ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String, String>();
		
		map.put("name", "nagesh");
		
	}

}
