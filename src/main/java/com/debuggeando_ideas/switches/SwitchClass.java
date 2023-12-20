package com.debuggeando_ideas.switches;

public class SwitchClass {

	public static void main(String[] args) {

		var result = switch ("DOS") {
		case "UNO" -> 1;
		case "DOS" -> 2;
		default -> 0;
		};

		System.out.println(result);

	}

}
