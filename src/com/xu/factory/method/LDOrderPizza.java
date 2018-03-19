package com.xu.factory.method;

import com.xu.factory.pizza.LDCheesePizza;
import com.xu.factory.pizza.LDPepperPizza;
import com.xu.factory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
