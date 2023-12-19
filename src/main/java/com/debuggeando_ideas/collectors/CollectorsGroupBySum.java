package com.debuggeando_ideas.collectors;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectorsGroupBySum {

	public static void main(String[] args) {

		Stream<Videogame> videogames = Database.videogames.stream();

		// Total por cada consola
		Map<Console, IntSummaryStatistics> result = videogames.collect(
				Collectors.groupingBy(Videogame::getConsole, Collectors.summarizingInt(Videogame::getTotalSold)));

		result.forEach((k, v) -> System.out.println(k + " - " + v.getSum()));

	}

}
