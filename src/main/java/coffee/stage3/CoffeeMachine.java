package main.java.coffee.stage3;

import java.util.Scanner;


public class CoffeeMachine {

	private static String ENOUGH_INGREDIENTS = "Yes, I can make that amount of coffee";
	private final static int WATER_OF_ONE_PORTION = 200;
	private final static int MILK_OF_ONE_PORTION = 50;
	private final static int BEANS_OF_ONE_PORTION = 15;
	private static int actualWater = 0;
	private static int actualMilk = 0;
	private static int actualBeans = 0;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Write how many ml of water the coffee machine has:");
		actualWater = scan.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		actualMilk = scan.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		actualBeans = scan.nextInt();
		System.out.println("Write how many cups of coffee you will need:");
		int wantedCoffee = scan.nextInt();
		calculateIngredients(wantedCoffee);
	}

	private static void calculateIngredients(int wantedCoffee) {
		actualWater -= wantedCoffee * WATER_OF_ONE_PORTION;
		actualMilk -= wantedCoffee * MILK_OF_ONE_PORTION;
		actualBeans -= wantedCoffee * BEANS_OF_ONE_PORTION;
		if (actualWater == 0 || actualMilk == 0 || actualBeans == 0) {
			System.out.println(ENOUGH_INGREDIENTS);
		} else
			if (actualWater < 0 || actualMilk < 0 || actualBeans < 0) {
				int cups = -1; // kiszámítás!
				System.out.println("No, I can make only " + cups + " cup(s) of coffee");
			} else {
				System.out.println("valami ...");
			}
	}
}
