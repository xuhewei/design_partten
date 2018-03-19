package com.xu.factory.method;

import com.xu.factory.pizza.NYCheesePizza;
import com.xu.factory.pizza.NYPepperPizza;
import com.xu.factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
