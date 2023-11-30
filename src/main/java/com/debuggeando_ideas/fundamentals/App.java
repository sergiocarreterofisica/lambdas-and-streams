package com.debuggeando_ideas.fundamentals;

import java.util.List;

import com.debuggeando_ideas.fundamentals.interfaces.DatabaseService;
import com.debuggeando_ideas.fundamentals.interfaces.Employee;
import com.debuggeando_ideas.fundamentals.interfaces.EmployeeDB;
import com.debuggeando_ideas.fundamentals.interfaces.MongoDB;
import com.debuggeando_ideas.fundamentals.interfaces.PostgresDB;
import com.debuggeando_ideas.fundamentals.interfaces.Product;
import com.debuggeando_ideas.fundamentals.interfaces.ProductDB;

public class App {

	public static void main(String[] args) {

		DatabaseService mongo = new MongoDB();
		DatabaseService postgres = new PostgresDB();

		System.out.println(mongo.getById(20L));
		System.out.println(postgres.getById(30L));

		ProductDB productDb = new ProductDB();
		EmployeeDB employeeDB = new EmployeeDB();

		System.out.println(productDb.getById(2L));
		System.out.println(employeeDB.getById(3L));

		System.out.println(Product.class.getName());
		System.out.println(Employee.class.getName());
		System.out.println(String.class.getName());
		
		DatabaseService<String> databaseServiceAnonima = new DatabaseService<String>() {

			@Override
			public String getById(Long id) {
				return null;
			}

			@Override
			public List<String> getAllRecords() {
				return null;
			}
		};

		System.out.println(databaseServiceAnonima.getClass().getName());
	}

}
