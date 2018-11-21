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
	void attaqueBasique(Personnage personne) {
		System.out.println("Je lance une boule de feu !");
		personne.setVie(personne.getVie() - this.getAgilite());
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		System.out.println("J'administre un soin !");
		
		//TODO Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
		this.setVie(this.getIntelligence() * 2);
		
	}

	

}
