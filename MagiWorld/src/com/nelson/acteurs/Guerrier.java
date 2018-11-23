package com.nelson.acteurs;

public class Guerrier extends Personnage {
	
	//Contructeur de classe avec un param�tre joueur recevant l'instance de cr�ation du personnage
	
	public Guerrier(int leJoueur) {
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
		int coupdEpee = this.getForce();
        System.out.println("Joueur "+this.leJoueur+" utilise Coup d'Ep�e et inflige "+coupdEpee+" dommages.");
        adversaire.vie -= coupdEpee;
        if (adversaire.vie <=0)
            System.out.println("Joueur " + adversaire.leJoueur + " est mort");
		
	}

	@Override
	void attaqueSpeciale(Personnage adversaire) {
		int coupDeRage = this.getForce() * 2;
        System.out.println("Joueur "+this.leJoueur+" Coup de Rage et inflige "+coupDeRage+" dommages.");
        adversaire.vie -= coupDeRage;
        this.vie -= this.getForce()/2;
        System.out.println("Le joueur"+adversaire.leJoueur+" perd "+coupDeRage+" point de vie");
        if (adversaire.vie <= 0)
            System.out.println("Joueur " + adversaire.leJoueur + " est mort");
        System.out.println("Le joueur"+this.leJoueur+" perd "+coupDeRage/4+" point de vie");
	}		
}
