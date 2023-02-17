package tn.iit.individu;

import tn.iit.behavior.ComportementCouteau;

public class Chevalier extends Individu {
	public Chevalier() {
		super();
		arme = new ComportementCouteau();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Chevalier");
	}
}
