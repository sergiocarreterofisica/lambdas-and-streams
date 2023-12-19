package com.debuggeando_ideas.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectorsReduceFunctions {

	public static void main(String[] args) {

		avg(Database.videogames.stream());
		sum(Database.videogames.stream());
		join(Database.videogames.stream());

	}

	static void avg(Stream<Videogame> stream) {

		Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));

		System.out.println(avg);

	}

	static void sum(Stream<Videogame> stream) {

		System.out.println("----------------------------------");

		IntSummaryStatistics summaryStatics = stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));

		System.out.println(summaryStatics.getSum());
		System.out.println(summaryStatics.getAverage());
		System.out.println(summaryStatics.getMax());
		System.out.println(summaryStatics.getMin());
		System.out.println(summaryStatics.getCount());

	}

	static void join(Stream<Videogame> stream) {

		System.out.println("----------------------------------");

		String cadena = stream.map(Videogame::toString).collect(Collectors.joining("\n"));

		System.out.println(cadena);

	}

}
