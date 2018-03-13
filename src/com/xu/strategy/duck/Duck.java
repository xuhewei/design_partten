package com.xu.strategy.duck;

import com.xu.strategy.flybehavior.FlyBehavior;
import com.xu.strategy.quackbehavior.QuackBehavior;

/**
 *1.OO思维里的继承方式解决方案是：
	public abstract class Duck {
			...;
			public void Fly() {
			System.out.println("~~im fly~~");
		}	
	}；
	问题来了,这个Fly让所有子类都会飞了，这是不科学的。
 * 继承的问题：对类的局部改动，尤其超类的局部改动，会影响其他部分。影响会有溢出效应
 * 
 * 2、继续尝试用OO原理来解决，覆盖：
	public class GreenHeadDuck extends Duck {
	...；
	public void Fly() {
			System.out.println("~~no fly~~");
		}	
	}
	又有新需求，石头鸭子，填坑：
	public class StoneDuck extends Duck {
	....	}；
	超类挖的一个坑，每个子类都要来填，增加工作量，复杂度O(N^2)。不是好的设计方式
	
	
	需要新的设计方式，应对项目的扩展性，降低复杂度：
	1）分析项目变化与不变部分，提取变化部分，抽象成接口+实现；
	2）鸭子哪些功能是会根据新需求变化的？叫声、飞行...

	3、接口：
	1）public interface FlyBehavior 
	{
	void fly();}
		
	2）public	interface QuackBehavior 
	{
	void quack();};
		
	3）好处：新增行为简单，行为类更好的复用，组合更方便。既有继承带来的复用好处，没有挖坑

 * @author xuhewei
 */
public abstract class Duck {
	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;

	public Duck() {
	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

}
