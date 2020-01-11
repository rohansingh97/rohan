package com.rakuten.prj.client;

import java.util.function.BiFunction;

public class Lambaexam {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f1 = (t, u) -> t * u;
		System.out.println(f1.apply(4, 5));
		BiFunction<Integer, Integer, Integer> f2 = new BiFunction <Integer, Integer, Integer>()
		{
		@Override
		public Integer apply(Integer t, Integer u) {
			
			return t+u;
		}
		
		};
		System.out.println(f2.apply(4,5));
	}

	
}
