package tn.iit.test;

import java.util.ArrayList;
import java.util.List;

import tn.iit.duck.Duck;
import tn.iit.duck.MallardDuck;
import tn.iit.duck.RedHeadDuck;
import tn.iit.duck.RubberDuck;
import tn.iit.duck.WoodenDuck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new MallardDuck());
		ducks.add(new RedHeadDuck());
		ducks.add(new WoodenDuck());
		ducks.add(new RubberDuck());

		ducks.forEach(d -> {
			d.display();
			d.swim();
			d.performFly();
			d.performQuack();
			System.out.println("---------");
		});
	}

}
