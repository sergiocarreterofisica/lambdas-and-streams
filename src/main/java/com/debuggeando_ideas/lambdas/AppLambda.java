package com.debuggeando_ideas.lambdas;

import java.util.List;

public class AppLambda {

	public static void main(String[] args) {

		List<String> paises = List.of("Espa�a", "M�jico", "Colombia", "Chile", "Uruguay");

		for (String pais : paises) {
			System.out.println(pais);
		}

		paises.forEach(pais -> System.out.println(pais.toUpperCase()));

	}

}
