package com.java.examples;

import java.util.Arrays;
import java.util.List;

public class ForechDemo {
	public static void main(String []args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		//External loop
		for(int i:values)
		{
			System.out.println(i);
		}
		
		//Internal loop
		values.forEach(i->System.out.println(i));
	}
}
