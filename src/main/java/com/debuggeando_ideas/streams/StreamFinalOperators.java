package com.debuggeando_ideas.streams;

import java.util.Optional;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class StreamFinalOperators {

	public static void main(String[] args) {

		Stream<Videogame> videogames = Database.videogames.stream();
		countOperator(videogames);

		forEachOperator(Database.videogames.stream());

		anyMatchOperator(Database.videogames.stream());

		allMatchOperator(Database.videogames.stream());

		noneMatchOperator(Database.videogames.stream());

		findFirstOperator(Database.videogames.stream());

		findAnyOperator(Database.videogames.stream());

		reduceOperator(Database.videogames.stream());

		maxOperator(Database.videogames.stream());

		minOperator(Database.videogames.stream());

	}

	static void countOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		System.out.println(stream.count());
	}

	static void forEachOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		stream.forEach(System.out::println);
	}

	static void anyMatchOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		boolean r = stream.anyMatch(v -> v.getTotalSold() > 100);
		System.out.println(r);
	}

	static void allMatchOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		boolean r = stream.allMatch(v -> v.getTotalSold() > 1);
		System.out.println(r);
	}

	static void noneMatchOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		boolean r = stream.noneMatch(v -> v.getReviews().isEmpty());
		System.out.println(r);
	}

	static void findFirstOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		Optional<Videogame> r = stream.findFirst();
		System.out.println(r.get());
	}

	static void findAnyOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		Optional<Videogame> r = stream.findAny();
		System.out.println(r.get());
	}

	static void reduceOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
//		Optional<Integer> r = stream.filter(v -> v.getIsDiscount()).map(v -> v.getTotalSold()).reduce((v1, v2) -> v1 + v2);
		Optional<Integer> r = stream.filter(Videogame::getIsDiscount).map(Videogame::getTotalSold).reduce(Integer::sum);
		System.out.println(r.get());
	}

	static void maxOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");
		Optional<Videogame> r = stream.max((a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(r.get());
	}

	static void minOperator(Stream<Videogame> stream) {
		System.out.println("-------------------------------------------");

		Optional<Videogame> r = stream.min((a, b) -> a.getTotalSold().compareTo(b.getTotalSold()));

		System.out.println(r.get());
	}

}
