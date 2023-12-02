package com.debuggeando_ideas.temp;

import com.debuggeando_ideas.lambdas.Math;

public class LambdaApp {

	public static void main(String[] args) {

		Math substract = (a, b) -> a - b;

		Math multiply = (a, b) -> a * b;

		Math divide = (a, b) -> {

			System.out.println("División");
			return a / b;

		};

		System.out.println(substract.execute(5.0, 5.0));
		System.out.println(multiply.execute(5.0, 5.0));
		System.out.println(divide.execute(5.0, 5.0));

	}

}
