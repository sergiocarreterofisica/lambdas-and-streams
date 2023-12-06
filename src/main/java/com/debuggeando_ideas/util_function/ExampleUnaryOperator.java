package com.debuggeando_ideas.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {

	static Function<String, String> funcToUpper = String::toUpperCase;
	static UnaryOperator<String> unaryToUpper = String::toUpperCase;

	static UnaryOperator<Integer> integerOperator = n -> n * n;
	static IntUnaryOperator intOperator = n -> n * n;

	public static void main(String[] args) {

		String prueba = "asldfjasdlkfjkdfjalsdkfjlksdfjksdfjsadklfs";
		System.out.println(funcToUpper.apply(prueba));
		System.out.println(unaryToUpper.apply(prueba));

		System.out.println(integerOperator.apply(3));
		System.out.println(intOperator.applyAsInt(3));
	}

}
