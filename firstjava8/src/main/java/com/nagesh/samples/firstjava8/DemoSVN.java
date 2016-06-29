package com.nagesh.samples.firstjava8;

import java.util.Arrays;
import java.util.List;

public class DemoSVN {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(2, 4, 3, 7, 9);

		l1.forEach(System.out::println);
		
		System.out.println("hello end of program");

	}

}
