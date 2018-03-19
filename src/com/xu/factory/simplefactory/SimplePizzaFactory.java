package com.xu.factory.simplefactory;

import com.xu.factory.pizza.CheesePizza;
import com.xu.factory.pizza.GreekPizza;
import com.xu.factory.pizza.PepperPizza;
import com.xu.factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
