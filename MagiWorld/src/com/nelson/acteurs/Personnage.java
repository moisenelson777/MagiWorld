package com.nelson.acteurs;

import java.util.Scanner;

abstract class Personnage {

	protected int niveau, vie, force, agilite, intelligence;
	protected int classe = ' ';
	protected static int nJ;
	protected int niveauMax = 0;

	

	Scanner sc = new Scanner(System.in);
	
	public void creationPersonnage() {
		
	}

	public void caracteresPersonnage() {
		
		do {
			System.out.println("Niveau du personnage ?");
			this.niveau = sc.nextInt();
			if (this.niveau > 100) {
				System.out.println("Votre niveau ne peut etre superieur à  100.");
			}
			sc.nextLine();
		}while(this.niveau < 0 || this.niveau > 100);
		
		this.vie = this.niveau * 5;
		this.niveauMax = this.niveau;
		
		do {
			System.out.println("Force du personnage ?");
			this.force = sc.nextInt();
			if(this.force > this.niveauMax) {
				System.out.println("le total force + agilité + intelligence doit être égal au niveau du joueur");
			}
			sc.nextLine();
		}while( this.force > this.niveauMax);
		
		this.niveauMax -= this.force; 
	
		do {
			System.out.println("Agilité du personnage ?");
			this.agilite = sc.nextInt();
			if(this.agilite > this.niveauMax) {
				System.out.println("le total force + agilité + intelligence doit être égal au niveau du joueur");
			}
			sc.nextLine();
		}while( this.agilite > this.niveauMax);
		
		this.niveauMax -= this.agilite; 
		
		do {
			System.out.println("Intelligence du personnage ?");
			this.intelligence = sc.nextInt();
			if(this.intelligence > this.niveauMax) {
				System.out.println("le total force + agilité + intelligence doit être égal au niveau du joueur");
			}
			sc.nextLine();
		}while( this.intelligence > this.niveauMax);
		
		this.niveauMax -= this.intelligence; 
	};
	
	abstract void presentationJoueur();
	abstract void attaqueBasique(Personnage personne);
	abstract void attaqueSpeciale(Personnage personne);
	
	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public static int getNJ() {
		return nJ;
	}

	public static void setNJ(int nj) {
		Personnage.nJ = nj;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}
	public int getClasse() {
		return classe;
	}

	public int getNiveauMax() {
		return niveauMax;
	}

	public void setNiveauMax(int niveauMax) {
		this.niveauMax = niveauMax;
	}
	public int getNiveau() {
		return niveau;
	}
}