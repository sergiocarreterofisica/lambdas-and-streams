package com.debuggeando_ideas.real_appplications;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

public class StrategyLambdas {

	public static void main(String[] args) {

		Product product1 = Product.builder().id(1L).name("Producto 1").price(150.0).userType("BASIC").build();
		Product product2 = Product.builder().id(2L).name("Producto 1").price(150.0).userType("PLUS").build();
		Product product3 = Product.builder().id(3L).name("Producto 1").price(150.0).userType("PRIME").build();

		List<Product> listaProductos = List.of(product1, product2, product3);
		listaProductos.forEach(p -> {

			switch (p.getUserType()) {
			case "BASIC":
				p.setDiscountStrategy(Strategies.basicDiscount);
				break;
			case "PLUS":
				p.setDiscountStrategy(Strategies.plusDiscount);
				break;
			case "PRIME":
				p.setDiscountStrategy(Strategies.primeDiscount);
				break;
			default:
				p.setDiscountStrategy(Strategies.basicDiscount);
				break;
			}

			System.out
					.println(p.getPrice() + " Descuento: " + p.getDiscountStrategy().getDiscountApplied(p.getPrice()));

		});

	}

}

@FunctionalInterface
interface ApplyDiscountStrategy {

	Double getDiscountApplied(Double price);

}

@Data
@ToString
@Builder
class Product {

	private Long id;
	private String userType;
	private String name;
	private Double price;
	private ApplyDiscountStrategy discountStrategy;

}

class Strategies {

	static ApplyDiscountStrategy basicDiscount = p -> p * 0.02;
	static ApplyDiscountStrategy plusDiscount = p -> p * 0.05;
	static ApplyDiscountStrategy primeDiscount = p -> p * 0.08;

}