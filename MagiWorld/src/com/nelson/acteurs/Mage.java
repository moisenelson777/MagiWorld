package com.nelson.acteurs;

public class Mage extends Personnage {

	public Mage() {
		super();
		nJ++;
	}

	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClass().getSimpleName()+" joueur "+Personnage.nJ+" niveau "+this.niveau+" je possède "+this.vie+" de vitalité, "+this.force+" de force, "+this.agilite+" d'agilité et "+this.intelligence+" d'intelligence !");
		
	}

	@Override
	void attaqueBasique() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attaqueSpeciale() {
		// TODO Auto-generated method stub
		
	}


}
