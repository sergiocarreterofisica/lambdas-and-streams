package com.debuggeando_ideas.fundamentals.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String dni;
	private String name;
	private Double salary;

}
