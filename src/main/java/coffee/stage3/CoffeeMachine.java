package main.java.coffee.stage3;

import java.util.Scanner;


public class CoffeeMachine {

	private static String ENOUGH_INGREDIENTS = "Yes, I can make that amount of coffee";
	private final static int waterOfOnePortion = 200;
	private final static int milkOfOnePortion = 50;
	private final static int beansOfOnePortion = 15;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Write how many ml of water the coffee machine has:");
		int actualAmountOfWater = scan.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		int actualAmountOfMilk = scan.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int actualAmountOfBeans = scan.nextInt();
		System.out.println("Write how many cups of coffee you will need:");
		int coffee = scan.nextInt();
		calculateIngredients(actualAmountOfWater, actualAmountOfMilk, actualAmountOfBeans, coffee);
	}

	private static void calculateIngredients(int actualWater, int actualMilk, int actualBeans, int wantedCoffee) {
		if (wantedCoffee * waterOfOnePortion <= actualWater && wantedCoffee * milkOfOnePortion <= actualMilk
				&& wantedCoffee * beansOfOnePortion <= actualBeans) {
			System.out.println(ENOUGH_INGREDIENTS);
		}
	}
}
