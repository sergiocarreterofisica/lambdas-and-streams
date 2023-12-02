package com.debuggeando_ideas.lambdas;

import java.util.List;

public class AppLambda {

	public static void main(String[] args) {

		List<String> paises = List.of("España", "Méjico", "Colombia", "Chile", "Uruguay");

		for (String pais : paises) {
			System.out.println(pais);
		}

		paises.forEach(pais -> System.out.println(pais.toUpperCase()));

	}

}
