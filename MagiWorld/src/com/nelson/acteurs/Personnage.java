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
			sc.nextLine();
		}while(this.niveau < 0 || this.niveau > 100);
		
		this.vie = this.niveau * 5;
		this.niveauMax = this.niveau;
		
		do {
			System.out.println("Force du personnage ?");
			this.force = sc.nextInt();
			sc.nextLine();
		}while( this.force > this.niveauMax);
		
		this.niveauMax -= this.force; 
	
		do {
			System.out.println("Agilité du personnage ?");
			this.agilite = sc.nextInt();
			sc.nextLine();
		}while( this.agilite > this.niveauMax);
		
		this.niveauMax -= this.agilite; 
		
		do {
			System.out.println("Intelligence du personnage ?");
			this.intelligence = sc.nextInt();
			sc.nextLine();
		}while( this.intelligence > this.niveauMax);
		
		this.niveauMax -= this.intelligence; 
	};
	
	abstract void presentationJoueur();
	abstract void attaqueBasique();
	abstract void attaqueSpeciale();
	
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