package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction1 {
	
	static Function<Integer, Integer> multiply = n -> n * 10;
	static Function<Integer, Integer> sum = n -> n + 10;
	static Function<Integer, Integer> andThenMultiply = multiply.andThen(sum);
	static Function<Integer, Integer> composeMuntiply = multiply.compose(sum);

	public static void main(String[] args) {
		
		System.out.println(multiply.apply(5));
		System.out.println(sum.apply(5));
		System.out.println(andThenMultiply.apply(5));
		System.out.println(composeMuntiply.apply(5));
		
	}

}
