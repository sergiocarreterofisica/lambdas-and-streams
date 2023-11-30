package com.debuggeando_ideas.fundamentals.interfaces;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee> {

	@Override
	public Employee getById(Long id) {
		return new Employee(UUID.randomUUID().toString(), "Nombre empleado", 10000.0);
	}

	@Override
	public List<Employee> getAllRecords() {
		return null;
	}

}
