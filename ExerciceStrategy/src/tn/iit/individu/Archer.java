package tn.iit.individu;

import tn.iit.behavior.ComportementArcFleche;

public class Archer extends Individu {
	public Archer() {
		super();
		arme = new ComportementArcFleche();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Archer");
	}
}
