package tn.iit.individu;

import tn.iit.behavior.ComportementEpee;

public class Reine extends Individu {
	public Reine() {
		super();
		arme = new ComportementEpee();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Reine");
	}
}
