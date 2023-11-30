package com.debuggeando_ideas.fundamentals.interfaces;

import java.util.List;

public class MongoDB implements DatabaseService<String>{

	@Override
	public String getById(Long id) {
		return "Getting data from MongoDB with id: " + id;
	}

	@Override
	public List<String> getAllRecords() {
		return List.of("MongoDB:Prueba 1");
	}

}
