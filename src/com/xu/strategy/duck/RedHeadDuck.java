package com.xu.strategy.duck;

import com.xu.strategy.flybehavior.BadFlyBehavior;
import com.xu.strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("**RedHead**");
	}

}
