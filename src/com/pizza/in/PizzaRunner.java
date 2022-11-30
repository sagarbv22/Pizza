package com.pizza.in;

import java.util.Scanner;

public class PizzaRunner {

	public static void menue() {

		System.out.println("Welcome to RocketPizza");
		System.out.println("----------------------");
		System.out.println("Pizza Size: ");
		System.out.println("           Small  INR 100");
		System.out.println("           Medium INR 120");
		System.out.println("           Large  INR 140");
		System.out.println("Topping: ");
		System.out.println("        cheesToppings      INR 2");
		System.out.println("        pepperonicToppings INR 2");
		System.out.println("        hamToppings        INR 2");
	}

	public void runner() {
		// TODO Auto-generated method stub
		String size;
		int noOfPizza;
		String toppings;
		int noOfCheesTpngs;
		int noOfpepperonicTpngs;
		int noOfhamTpngs;

		Scanner scan = new Scanner(System.in);

		System.out.println("Dear Customer Welcome to RocketPizza");
		System.out.println("-------------------------------------");
		System.out.println("Enter 1 for Menue");
		int menue = scan.nextInt();
		if (menue == 1)
			menue();
		System.out.println("Start Ordering");
		System.out.println();

		System.out.println("Select the size of pizza");
		System.out.println("Enter  Small || Medium || Large");
		size = scan.next().toLowerCase();
		System.out.println("Enter the no of " + size + " pizza required");
		noOfPizza = scan.nextInt();
		System.out.println("Enter the no of CheesToppings required");
		noOfCheesTpngs = scan.nextInt();
		System.out.println("Enter the no of PepperonicToppings required");
		noOfpepperonicTpngs = scan.nextInt();
		System.out.println("Enter the no of HamToppings required");
		noOfhamTpngs = scan.nextInt();

		PizzaStore pizzastore = new PizzaStore(size, noOfPizza, noOfCheesTpngs, noOfpepperonicTpngs, noOfhamTpngs);
		pizzastore.pizzaRate();
		pizzastore.bill();
		pizzastore.totalCost();
		
		System.out.println("Enter 1 to confirm your order || 0 to cancel");
		int confirm = scan.nextInt();
		if(confirm==1) {
			pizzastore.verify();
		}else {
			System.out.println("Thank You.");
			System.exit(0);
		}

	}

}
