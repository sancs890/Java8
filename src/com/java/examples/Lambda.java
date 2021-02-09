package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface A{
	void show(int i);
}
public class Lambda {
	public static void main(String []args) {
		A obj;
//		obj = new A() {
//			public void show() {
//				System.out.println("Implementing A");
//			}
//		};
		
//		obj = (i)->System.out.println("Implementing A" + i);
//		obj.show(6);
		
		
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));
		
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		for(int i:list) {
//			System.out.println(i);
//		}
		
		
		//Loops are external iterations
		//Internal iterations (Iterating using api's in yours collections)
		
		
//		Consumer<Integer> consumer = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
		
//		Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
		//Consumer<Integer> consumer = (i) -> System.out.println(i);
		
		//list.forEach((i) -> System.out.println(i));
		//list.forEach(Lambda::doubleit); //Method reference
		
		
		//Stream API
		// Intermediate Methods and Terminal Methods
//		// Stream is lazy
//		list.stream().filter(i->{
//			System.out.println("Hi");
//			return true;
//		});
//		// Stream once used cannot be used
//		Stream<Integer> st = list.stream();
//		st.forEach(System.out::println);
//		st.forEach(System.out::println);
		// findFirst gives optional
		
		//Typical summing of arraylist
//		int result = 0;
//		for(int i: list)
//		{
//			result += i*2;
//		}
//		System.out.println(result);
		
		//Using Streams
		
		//System.out.println(list.stream().map(i->i*2).reduce(0,(c,e) ->c+e));
		
		//Stream internal working
		
//		Function func =  new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				return t*2;
//			}
//			
//		};
//		BinaryOperator b =  new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t+u;
//			}
//			
//		};
//		Stream s = list.stream();
//		Stream s1 = s.map(func);
//		Integer s2 = (Integer)s1.reduce(0,b);
//		System.out.println(s2);
		
		//System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)-> c+e));
		
		//System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);
		
		//Sum of Numbers divisible by 5
//		int result = 0;
//		for(int i:list) {
//			if(i%5==0) {
//				result+=i;
//			}
//		}
//		System.out.println(result);
		
		//System.out.println(list.stream().map(i->i%5==0?i:0).reduce(0,Integer::sum));
		
		//Using filter
//		System.out.println(list.stream()
//								.filter(i->i%5==0)
//								.reduce(0,Integer::sum));
		
		
		// How filter works
//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t%5==0;
//			}
//		};
//		System.out.println(list.stream().filter(p).reduce(0, (c,e)->c+e));
		
		//First element divisible by 5
		
//		System.out.println(list.stream()
//							    .filter(i->i%5==0)
//							    .map(i->i*2)
//							    .findFirst()
//							    .orElse(0));
		
		//Checking lazy evaluation of map and filter
		System.out.println(list.stream()
			    .filter(Lambda::isDiv)
			    .map(Lambda::doubleit)
			    .findFirst()
			    .orElse(0));
	}
	public static int doubleit(int i) {
		System.out.println("in Double "+i);
		return i*2;
	}
	
	public static boolean isDiv(int i) {
		System.out.println("in Is Div "+i);
		return i%5==0;
	}
}
