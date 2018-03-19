package com.xu.factory.absfactory;

import com.xu.factory.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
