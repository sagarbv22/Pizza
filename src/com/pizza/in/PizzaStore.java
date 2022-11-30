package com.pizza.in;

public class PizzaStore {
	static int costOfPizza;

	String size;
	int noOfPizza;
	int noOfCheesTpngs;
	int noOfpepperonicTpngs;
	int noOfhamTpngs;

	public PizzaStore(String size, int noOfPizza, int noOfCheesTpngs, int noOfpepperonicTpngs, int noOfhamTpngs) {
		super();
		this.size = size;
		this.noOfPizza = noOfPizza;
		this.noOfCheesTpngs = noOfCheesTpngs;
		this.noOfpepperonicTpngs = noOfpepperonicTpngs;
		this.noOfhamTpngs = noOfhamTpngs;
	}

	public void pizzaRate() {

		switch (size) {

		case ("small"):
			costOfPizza = 100;
			break;
		case ("medium"):
			costOfPizza = 120;
			break;
		case ("large"):
			costOfPizza = 140;
			break;
		}

	}

	public void bill() {

		System.out.println("OrderNumber:             " + Math.random());
		System.out.println("Cost of " + size + "pizza: " + noOfPizza * costOfPizza);
		System.out.println("Cost of Toppings: ");
		System.out.println("                 cheesToppings      :" + noOfCheesTpngs * 2);
		System.out.println("                 pepperonicToppings :" + noOfpepperonicTpngs * 2);
		System.out.println("                 hamToppings        :" + noOfhamTpngs * 2);

	}

	public void totalCost() {

		int pizzaCost = noOfPizza * costOfPizza;
		int toppings = noOfCheesTpngs * 2 + noOfpepperonicTpngs * 2 + noOfhamTpngs * 2;

		int total = pizzaCost + toppings;
		System.out.println("=====================================");
		System.out.println("Total cost of your order is INR " + total);
		System.out.println();
	}
	
	public void verify() {
		System.out.println("Order is confirmed");
		System.out.println("Cash will be collected by delivery boy ");
		System.out.println("Thank you.");
	}

}
