package com.debuggeando_ideas.collectors;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectorsToCollection {

	public static void main(String[] args) {

		streamToCollection(Database.videogames.stream(), "LIST").forEach(System.out::println);
		
		streamToCollection(Database.videogames.stream(), "SET").forEach(System.out::println);
		
		streamToMap(Database.videogames.stream()).forEach((k, v) -> System.out.println("Key:" + k + " Value:" + v));

	}

	static Collection<Videogame> streamToCollection(Stream<Videogame> stream, String type) {
		
		System.out.println("-----------------------------------------------");

		return type.equals("LIST") ? stream.collect(Collectors.toList()) : stream.collect(Collectors.toSet());

	}
	
	static Map<String, Double> streamToMap(Stream<Videogame> stream) {
		
		return stream.distinct().collect(Collectors.toMap(Videogame::getName, Videogame::getPrice));
		
	}

}
