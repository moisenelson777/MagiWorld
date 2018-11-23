package com.nelson.acteurs;

public class Mage extends Personnage {

	//Contructeur de classe avec un param�tre joueur recevant l'instance de cr�ation du personnage
	
	public Mage(int leJoueur) {
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
		int bouleDeFeu = this.intelligence;
        System.out.println("Joueur "+this.leJoueur+" utilise Boule de feu et inflige "+bouleDeFeu+" dommages.");
        adversaire.vie -= bouleDeFeu;
        System.out.println("Le joueur"+adversaire.leJoueur+" perd "+bouleDeFeu+" point de vie");
        if (adversaire.getVie()<=0)
            System.out.println("Joueur " + adversaire.leJoueur + " est mort");
	}

	@Override
	void attaqueSpeciale(Personnage personne) {
		int poinDeVieMax = this.niveau * 5;
        int soin = this.intelligence * 2;
        if (this.vie < poinDeVieMax){
            this.vie += soin;
        System.out.println("Joueur "+this.leJoueur+" utilise soin et gagne "+soin+" en vitalite.");
        }else if(this.vie + soin > poinDeVieMax){
            soin = poinDeVieMax - this.vie;
                    this.vie = poinDeVieMax;
        System.out.println("Joueur "+this.leJoueur+" utilise soin et gagne "+soin+" en vitalite.");
        }
	}
}

