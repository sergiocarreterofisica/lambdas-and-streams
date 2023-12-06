package com.debuggeando_ideas.util_function;

import java.io.Serializable;

import lombok.ToString;

@ToString
public class Person implements Serializable {

	private static final long serialVersionUID = -4206694295938705934L;

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}
