package tn.iit.duck;

import tn.iit.behavior.FlyWings;
import tn.iit.behavior.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
