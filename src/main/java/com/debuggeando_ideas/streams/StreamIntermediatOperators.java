package com.debuggeando_ideas.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class StreamIntermediatOperators {

	public static void main(String[] args) {

		Stream<Videogame> videogames = Database.videogames.stream();

		System.out.println(videogames.count());

		distinctOperator(Database.videogames.stream());

		limitOperator(Database.videogames.stream());

		skipOperator(Database.videogames.stream());

		filterOperator(Database.videogames.stream());

		mapOperator(Database.videogames.stream());

		flatMapOperator(Database.videogames.stream());

		mapVsflatMapOperator(Database.videogames.stream());

		peekOperator(Database.videogames.stream());

		sortOperator(Database.videogames.stream());

		takeWhileOperator(Database.videogames.stream());

		dropWhileOperator(Database.videogames.stream());

	}

	static void distinctOperator(Stream<Videogame> videogames) {
		System.out.println("-------------------------------------------");
		System.out.println(videogames.distinct().count());
	}

	static void limitOperator(Stream<Videogame> videogames) {
		System.out.println("-------------------------------------------");
		List<Videogame> r = videogames.limit(15).collect(Collectors.toList());
		r.forEach(System.out::println);
	}

	static void skipOperator(Stream<Videogame> videogames) {
		System.out.println("-------------------------------------------");
		List<Videogame> r = videogames.skip(10).collect(Collectors.toList());
		r.forEach(System.out::println);
	}

	static void filterOperator(Stream<Videogame> videogames) {

		System.out.println("-------------------------------------------");
		List<Videogame> r = videogames.filter(v -> v.getPrice() > 5.0).filter(v -> !v.getIsDiscount())
				.filter(v -> v.getOfficialWebsite().contains("forza")).collect(Collectors.toList());

		r.forEach(System.out::println);

	}

	static void mapOperator(Stream<Videogame> videogames) {

		System.out.println("-------------------------------------------");
		List<BasicVideogame> basicVideogames = videogames.map(
				v -> BasicVideogame.builder().name(v.getName()).price(v.getPrice()).console(v.getConsole()).build())
				.collect(Collectors.toList());

		basicVideogames.forEach(System.out::println);

//		List<String> titles = basicVideogames.stream().map(v -> v.getName()).collect(Collectors.toList());
		List<String> titles = basicVideogames.stream().map(BasicVideogame::getName).collect(Collectors.toList());

		titles.forEach(System.out::println);
	}

	static void flatMapOperator(Stream<Videogame> videogames) {

		System.out.println("-------------------------------------------");

		var r = videogames.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
		r.forEach(System.out::println);

	}

	static void mapVsflatMapOperator(Stream<Videogame> videogames) {

		System.out.println("-------------------------------------------");

//		var totalReviews = videogames.map(v -> v.getReviews().size()).collect(Collectors.toList());
		var totalReviews = videogames.flatMap(v -> v.getReviews().stream()).count();

//		System.out.println(totalReviews.size());
		System.out.println(totalReviews);

	}

	static void peekOperator(Stream<Videogame> videogames) {
		System.out.println("-------------------------------------------");
		videogames.peek(v -> v.setName("Empty")).forEach(System.out::println);
	}

	static void sortOperator(Stream<Videogame> videogames) {
		System.out.println("------------------------------------------");

		List<Videogame> listSorted = videogames.sorted(Comparator.comparingInt(v -> v.getReviews().size()))
				.collect(Collectors.toList());

		listSorted.forEach(System.out::println);

	}

	static void takeWhileOperator(Stream<Videogame> videogames) {
		System.out.println("------------------------------------------");

		List<Videogame> r = videogames
				.sorted(Comparator.comparing(Videogame::getName))
				.takeWhile(v -> !v.getName().startsWith("M"))
				.collect(Collectors.toList());

		r.forEach(System.out::println);

	}

	static void dropWhileOperator(Stream<Videogame> videogames) {
		System.out.println("------------------------------------------");

		List<Videogame> r = videogames
				.sorted(Comparator.comparing(Videogame::getName))
				.dropWhile(v -> !v.getName().startsWith("M"))
				.collect(Collectors.toList());

		r.forEach(System.out::println);

	}

}
