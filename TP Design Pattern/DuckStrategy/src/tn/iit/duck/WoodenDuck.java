package tn.iit.duck;

import tn.iit.behavior.FlyNoWay;
import tn.iit.behavior.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
