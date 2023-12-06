package com.debuggeando_ideas.util_function;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

	static Function<Person, ByteArrayOutputStream> serializer = p -> {

		ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

		try (ObjectOutputStream prueba = new ObjectOutputStream(inMemoryBytes)) {

			prueba.writeObject(p);
			prueba.flush();

		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		return inMemoryBytes;

	};

	static Function<ByteArrayInputStream, Person> deserializer = bais -> {

		try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {

			return (Person) objectInputStream.readObject();

		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}

		return null;

	};

	public static void main(String[] args) {

//		Serialización
		ByteArrayOutputStream serialized = serializer.apply(new Person("Nombre", 37));
		System.out.println(Arrays.toString(serialized.toByteArray()));

//		Deserialización
		Person persona = deserializer.apply(new ByteArrayInputStream(serialized.toByteArray()));
		System.out.println(persona.toString());

	}

}
