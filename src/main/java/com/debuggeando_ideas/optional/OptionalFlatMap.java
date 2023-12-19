package com.debuggeando_ideas.optional;

import java.util.Optional;

import com.debuggeando_ideas.util.Movie;

public class OptionalFlatMap {

	public static void main(String[] args) {

		Movie pelicula = new Movie("En busca del arca perdida", 15.95);

		Optional<Movie> peliculaOptional = Optional.of(pelicula);

		String nombrePelicula = peliculaOptional.flatMap(Movie::getName).get();

		System.out.println(nombrePelicula);

	}

}
