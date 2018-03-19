package com.xu.factory.absfactory;

import com.xu.factory.pizza.LDCheesePizza;
import com.xu.factory.pizza.LDPepperPizza;
import com.xu.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
