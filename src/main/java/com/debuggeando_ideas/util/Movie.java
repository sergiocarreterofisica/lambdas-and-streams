package com.debuggeando_ideas.util;

import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie {

	private String name;
	private Double price;

	/**
	 * @return the name
	 */
	public Optional<String> getName() {
		return Optional.of(this.name);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public Optional<Double> getPrice() {
		return Optional.of(this.price);
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

}
