package com.debuggeando_ideas.reference_methods;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {

	public static void main(String[] args) {

		BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
		System.out.println(equals.test("hola", "adios"));

		BiPredicate<String, String> equals2 = String::equals;
		System.out.println(equals2.test("dos", "dos"));

	}
}
