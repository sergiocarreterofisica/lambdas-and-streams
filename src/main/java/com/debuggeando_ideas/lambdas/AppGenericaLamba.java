package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.interfaces.Employee;
import com.debuggeando_ideas.fundamentals.interfaces.Product;

public class AppGenericaLamba {

	public static void main(String[] args) {

//		void print(T toPrint);
		
		Printer<String> printString = string -> System.out.println(string);
		printString.print("HOLA");
		
		Printer<Product> printProduct = producto -> System.out.println(producto);
		printProduct.print(new Product(10L, "Nombre producto", 15.35));
		
		Printer<Employee> printEmployee = empleado -> System.out.println(empleado);
		printEmployee.print(new Employee());

	}

}
