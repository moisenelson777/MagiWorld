package com.nelson.acteurs;

public class Rodeur extends Personnage {

	//Contructeur de classe avec un param�tre joueur recevant l'instance de cr�ation du personnage
	
	public Rodeur(int leJoueur) {
		super();
		this.leJoueur = leJoueur;
	}

	// M�thodes de pr�sentation des caract�ristiques du joueur
	
	@Override
	void presentationJoueur() {
		System.out.println("Woarg Je suis le "+this.getClasse()+" joueur "+this.leJoueur+" niveau "+this.niveau+" je poss�de "+this.vie+" de vitalit�, "+this.force+" de force, "+this.agilite+" d'agilit� et "+this.intelligence+" d'intelligence !");
		
	}

	// M�thodes implementant les attaques du joueur
	
	@Override
	void attaqueBasique(Personnage adversaire) {
		int tirAlArc = this.getAgilite();
        System.out.println("Joueur "+this.leJoueur+" utilise Tire � l'Arc et inflige "+tirAlArc+" dommages.");
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
