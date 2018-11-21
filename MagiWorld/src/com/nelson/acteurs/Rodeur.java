package com.nelson.acteurs;

public class Rodeur extends Personnage {

	public Rodeur() {
		super();
		nJ++;
	}

	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClass().getSimpleName()+" joueur "+Personnage.nJ+" niveau "+this.niveau+" je possède "+this.vie+" de vitalité, "+this.force+" de force, "+this.agilite+" d'agilité et "+this.intelligence+" d'intelligence !");
		
	}

	@Override
	void attaqueBasique(Personnage personne) {
		System.out.println("J'effectue un tir à l'arc !");
		personne.setVie(personne.getVie() - this.getAgilite());
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		System.out.println("J'effectue une concentration !");
		this.setAgilite(this.niveau / 2);
	}

}
