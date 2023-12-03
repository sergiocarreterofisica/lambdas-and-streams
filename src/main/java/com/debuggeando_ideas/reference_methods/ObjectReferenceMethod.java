package com.debuggeando_ideas.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectReferenceMethod {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>(10);

		IntStream repeat = IntStream.range(1, 11);

		repeat.forEach(numbers::add);

		System.out.println(numbers);

	}

}
