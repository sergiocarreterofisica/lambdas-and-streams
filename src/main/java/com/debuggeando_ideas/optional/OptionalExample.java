package com.debuggeando_ideas.optional;

import java.util.Optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<Videogame> gtaOpt1 = Optional.of(Database.videogames.get(5));
		Optional<Videogame> gtaOpt2 = Optional.ofNullable(null);
		
		System.out.println(gtaOpt1);
		System.out.println("-------");
		System.out.println(gtaOpt1.get());
		System.out.println("-------");
		System.out.println(gtaOpt2);
		System.out.println("-------");
		System.out.println(gtaOpt2.orElse(Database.videogames.get(0)));

		
		System.out.println("-------");
		System.out.println(gtaOpt2.orElseThrow(() -> new RuntimeException("Videogame not found")));
		
		

	}

}
