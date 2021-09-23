package main;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cemal Tuysuz
 * @Date 23.09.2021
 * 
 * With this class, I calculate the mass value entered by the user according to the planets.
 * 
 * I am calculating with loop by fetching values from enum class.
 * @see PlanetEnum
 * 
 * Thus, when a new planet is added or removed, 
 * it will not be necessary to make much changes on the project.
 * 
 * 
 * */


public class Test {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		List<PlanetEnum> values = Arrays.asList(PlanetEnum.values()); // I am getting PlanetEnum's values
		
		System.out.println("Input value :");
		try {
			double value = input.nextDouble();
			
			for(PlanetEnum e : values) {
				System.out.println(e.name()+" : "+calculate(value,e.value));
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Please, input numeric type.");
		}catch(Exception e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
	}
	/**
	 * My mass calculator method.
	 * @param value -> User' value
	 * @param planetValue -> Planet' value
	 * */
	static String calculate(double value,double planetValue) {
		return String.valueOf(value*planetValue);
	}

}
