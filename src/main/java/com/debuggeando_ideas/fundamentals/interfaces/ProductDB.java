package com.debuggeando_ideas.fundamentals.interfaces;

import java.util.List;

public class ProductDB implements DatabaseService<Product> {

	@Override
	public Product getById(Long id) {
		return new Product(id, "Producto", 30.0);
	}

	@Override
	public List<Product> getAllRecords() {
		return List.of(new Product(10L, "Producto", 30.0));
	}

}
