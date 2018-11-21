package com.nelson.acteurs;

import java.util.Scanner;

public class Jeu {
	
	Personnage  joueur1 ;
	Personnage  joueur2 ;
	Scanner sc = new Scanner(System.in);
	int classe = ' ';
	
	Jeu(){
		System.out.println("Création du joueur 1");
		creationDesPersonnages(joueur1);
		System.out.println("************************************");
		System.out.println("Création du joueur 2");
		creationDesPersonnages(joueur2);
	}
	public void creationDesPersonnages(Personnage joueur) {
			do {
				System.out.println("Veuillez entrer la classe de votre joueur (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
				classe = sc.nextInt();
				switch(classe) {
				case 1 : joueur = new Guerrier();
				break;
				case 2 : joueur = new Rodeur();
				break;
				case 3 : joueur = new Mage();
				break;
				default : System.out.println("Veuillez choisir une des classes proposées !");
				break;
				}
				sc.nextLine();
			}while(classe != 1 && classe != 2 && classe != 3);
			
			joueur.caracteresPersonnage();
			joueur.presentationJoueur();
		}
 }
