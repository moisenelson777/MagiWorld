package com.nelson.acteurs;

public class Guerrier extends Personnage {

	public Guerrier() {
		super();
		nJ++;
	}

	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClass().getSimpleName()+" joueur "+Personnage.nJ+" niveau "+this.niveau+" je poss�de "+this.vie+" de vitalit�, "+this.force+" de force, "+this.agilite+" d'agilit� et "+this.intelligence+" d'intelligence !");
		
	}

	@Override
	void attaqueBasique(Personnage personne) {
		System.out.println("Je donne un coup d'�p�e !");
		personne.setVie(personne.getVie() - this.getForce());
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		System.out.println("Je donne un coup de rage");
		personne.setVie(personne.getVie() - (this.getForce() * 2));
	}

		
		
}
