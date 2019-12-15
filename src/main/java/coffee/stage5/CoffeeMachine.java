package main.java.coffee.stage5;

import java.util.Scanner;


public class CoffeeMachine {

	private static int actualWater = 1200;
	private static int actualMilk = 540;
	private static int actualBeans = 120;
	private static int actualCups = 9;
	private static int actualMoney = 550;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			getAction();
			getState();

		}
	}

	public static void getAction() {
		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String action = scanner.next();
		switch (action) {
			case "buy":
				actionBuy();
				break;
			case "fill":
				actionFill();
				break;
			case "take":
				actionTake();
				break;
			case "remaining":
				getState();
				break;
			case "exit":
				System.exit(0);
		}
	}

	public static void actionBuy() {
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
		int product = scanner.nextInt();
		// I have enough resources, making you a coffee!
		switch (product) {
			case 1:
				checkIngredients();
				makeEspresso();
				break;
			case 2:
				checkIngredients();
				makeLatte();
				break;
			case 3:
				checkIngredients();
				makeCappuccino();
				break;
		}
	}

	private static boolean checkIngredients() {
		return true;
	}

	private static void makeEspresso() {
		actualWater -= 250;
		actualBeans -= 16;
		actualMoney += 4;
		actualCups--;
	}

	private static void makeLatte() {
		actualWater -= 350;
		actualMilk -= 75;
		actualBeans -= 20;
		actualMoney += 7;
		actualCups--;
	}

	private static void makeCappuccino() {
		actualWater -= 200;
		actualMilk -= 100;
		actualBeans -= 12;
		actualMoney += 6;
		actualCups--;
	}

	public static void actionFill() {
		System.out.println("Write how many ml of water do you want to add:");
		actualWater += scanner.nextInt();
		System.out.println("Write how many ml of milk do you want to add:");
		actualMilk += scanner.nextInt();
		System.out.println("Write how many grams of coffee beans do you want to add:");
		actualBeans += scanner.nextInt();
		System.out.println("Write how many disposable cups of coffee do you want to add:");
		actualCups += scanner.nextInt();
	}

	public static void actionTake() {
		System.out.println("I gave you $" + actualMoney);
		actualMoney = 0;
	}

	public static void getState() {
		System.out.println("\nThe coffee machine has:");
		System.out.println(actualWater + " of water");
		System.out.println(actualMilk + " of milk");
		System.out.println(actualBeans + " of coffee beans");
		System.out.println(actualCups + " of disposable cups");
		System.out.println(actualMoney + " of money\n");
	}
}
