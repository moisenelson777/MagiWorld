package com.nelson.acteurs;

public class Rodeur extends Personnage {

	public Rodeur() {
		super();
		nJ++;
	}

	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClass().getSimpleName()+" joueur "+Personnage.nJ+" niveau "+this.niveau+" je poss�de "+this.vie+" de vitalit�, "+this.force+" de force, "+this.agilite+" d'agilit� et "+this.intelligence+" d'intelligence !");
		
	}

	@Override
	void attaqueBasique(Personnage personne) {
		System.out.println("J'effectue un tir � l'arc !");
		personne.setVie(personne.getVie() - this.getAgilite());
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		System.out.println("J'effectue une concentration !");
		this.setAgilite(this.niveau / 2);
	}

}
