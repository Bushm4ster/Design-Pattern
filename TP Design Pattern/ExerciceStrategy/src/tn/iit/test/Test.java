package tn.iit.test;

import java.util.ArrayList;
import java.util.List;

import tn.iit.individu.Archer;
import tn.iit.individu.Chevalier;
import tn.iit.individu.Individu;
import tn.iit.individu.Reine;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Individu> individu = new ArrayList<>();
		individu.add(new Archer());
		individu.add(new Chevalier());
		individu.add(new Reine());

		individu.forEach(i -> {
			i.display();
			i.combattre();
			System.out.println("---------");
		});
	}

}
