package main.java.coffee.stage2;

import java.util.Scanner;


public class CoffeeMachine {

	public static void main(String[] args) {
		System.out.println("Write how many cups of coffee you will need:");
		Scanner in = new Scanner(System.in);
		int numberOfCups = in.nextInt();
		System.out.println("For " + numberOfCups + " cups of coffee you will need:");
		System.out.println(numberOfCups * 200 + " ml of water");
		System.out.println(numberOfCups * 50 + " ml of milk");
		System.out.println(numberOfCups * 15 + " g of coffee beans");
	}
}
