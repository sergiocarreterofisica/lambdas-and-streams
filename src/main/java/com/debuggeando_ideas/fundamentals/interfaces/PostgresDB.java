package com.debuggeando_ideas.fundamentals.interfaces;

import java.util.List;

public class PostgresDB implements DatabaseService<String> {

	@Override
	public String getById(Long id) {
		return "Getting data from Postgres with id: " + id;
	}

	@Override
	public List<String> getAllRecords() {
		return List.of("Postgres:Prueba 1");
	}
}
