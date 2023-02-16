package tn.iit.individu;

import tn.iit.behavior.ComportementArme;

public abstract class Individu {
	protected ComportementArme arme;
	
	public void setArme(ComportementArme ca){
		this.arme = ca;
	}
	
	public void combattre() {
		arme.utiliseArme();
	}
	public abstract void display();
}
