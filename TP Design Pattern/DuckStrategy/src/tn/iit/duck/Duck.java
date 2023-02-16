package tn.iit.duck;

import tn.iit.behavior.FlyBehavior;
import tn.iit.behavior.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("swim");
	}
	public abstract void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
}
