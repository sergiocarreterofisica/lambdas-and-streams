package com.debuggeando_ideas.util_function;

import java.util.Random;
import java.util.function.Supplier;

import lombok.ToString;

public class ExampleSupplier {

	static Supplier<Integer> prueba = () -> new Random().nextInt(100);
	static Supplier<MyProduct> productSupplier = () -> new MyProduct(100, "Nombre");

	public static void main(String[] args) {
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(prueba.get());
		System.out.println(productSupplier.get());
	}

}

@ToString
class MyProduct {

	Integer price;
	String name;

	public MyProduct(Integer price, String name) {
		this.price = price;
		this.name = name;
	}

}