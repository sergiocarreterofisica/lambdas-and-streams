package com.debuggeando_ideas.util_function;

import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

	public static void main(String[] args) {

		BinaryOperator<String> normalizerFunction = (a, b) -> a.toUpperCase() + "-" + b.toLowerCase();

		System.out.println(normalizerFunction.apply("hola", "MUNDO"));
		System.out.println(normalizerFunction.apply("HOLA", "mundo"));
	}

}
