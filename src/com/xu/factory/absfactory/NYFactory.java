package com.xu.factory.absfactory;

import com.xu.factory.pizza.NYCheesePizza;
import com.xu.factory.pizza.NYPepperPizza;
import com.xu.factory.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
