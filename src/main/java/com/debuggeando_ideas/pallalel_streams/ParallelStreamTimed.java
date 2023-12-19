package com.debuggeando_ideas.pallalel_streams;

import java.util.stream.IntStream;

public class ParallelStreamTimed {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		IntStream.rangeClosed(1, 200000000).reduce(0, Integer::sum);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Ha tardado en ejecutarse " + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();
		IntStream.rangeClosed(1,  200000000).parallel().reduce(0, Integer::sum);
		endTime = System.currentTimeMillis();
		
		System.out.println("Ha tardado en ejecutarse " + (endTime - startTime) + " ms");
	}

}
