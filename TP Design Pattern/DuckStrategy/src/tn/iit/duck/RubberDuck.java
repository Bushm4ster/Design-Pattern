package tn.iit.duck;

import tn.iit.behavior.FlyNoWay;
import tn.iit.behavior.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
