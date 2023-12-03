package com.debuggeando_ideas.reference_methods;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

import lombok.ToString;

public class ConstructorMethodReference {

	public static void main(String[] args) {

		Supplier<MyObject> newMyObject = () -> new MyObject();
		System.out.println(newMyObject.get());

		Supplier<MyObject> newMyObject2 = MyObject::new;
		System.out.println(newMyObject2.get());

	}

}

@ToString
class MyObject {

	private String string;
	private Integer num;

	public MyObject() {
		this.string = UUID.randomUUID().toString();
		this.num = new Random().nextInt(1000);
	}

}