package com.nelson.acteurs;

public class Rodeur extends Personnage {

	//Contructeur de classe avec un paramètre joueur recevant l'instance de création du personnage
	
	public Rodeur(int leJoueur) {
		super();
		this.leJoueur = leJoueur;
	}

	// Méthodes de présentation des caractéristiques du joueur
	
	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClasse()+" joueur "+this.leJoueur+" niveau "+this.niveau+" je possède "+this.vie+" de vitalité, "+this.force+" de force, "+this.agilite+" d'agilité et "+this.intelligence+" d'intelligence !");
		
	}

	// Méthodes implementant les attaques du joueur
	
	@Override
	void attaqueBasique(Personnage adversaire) {
		int tirAlArc = this.getAgilite();
        System.out.println("Joueur "+this.leJoueur+" utilise Tire à  l'Arc et inflige "+tirAlArc+" dommages.");
        adversaire.vie -= tirAlArc;
        System.out.println("Le joueur"+adversaire.leJoueur+" perd "+tirAlArc+" point de vie");
        if (adversaire.getVie()<=0)
            System.out.println("Joueur " + adversaire.leJoueur + " est mort");
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		int concentration = this.getNiveau() / 2;
        System.out.println("Joueur "+this.leJoueur+" utilise soin et gagne "+concentration+" en agilite.");
        this.agilite += concentration;
		
	}
}
