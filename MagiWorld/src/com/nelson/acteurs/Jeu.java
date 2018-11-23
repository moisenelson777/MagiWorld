package com.nelson.acteurs;

import java.util.Scanner;

public class Jeu {
	
	// Création d'un tableau de deux joueurs de type Personnage
	
	Personnage [] joueurs = new Personnage[2];
	
	// Variables locales 
	
	Scanner sc = new Scanner(System.in);
	int classeNum = ' ';
	
	// Méthode de lancement du jeu 
	
	Jeu(){
			creationDesPersonnages();
			battaille();
		}
	
	// Methodes de création de joueurs types à inserer dans le tableau joueur de deux personnages 
	
	public void creationDesPersonnages() {
		for(int i = 0; i < joueurs.length;i++) {
			System.out.println("Création du personnage du joueur "+(i+1));
			do {
				System.out.println("Veuillez entrer la classe de votre joueur (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
				classeNum = sc.nextInt();
				if(classeNum == 1) {
					joueurs[i] = new Guerrier(i+1);
					joueurs[i].setClasse("Guerrier");
				}else if(classeNum == 2) {
					joueurs[i] = new Rodeur(i+1);
					joueurs[i].setClasse("Rodeur");
				}else if(classeNum == 3) {
					joueurs[i] = new Mage(i+1);
					joueurs[i].setClasse("Mage");
				}
				else System.out.println("Veuillez choisir une des classes proposées !");
				
				sc.nextLine();
			}while(classeNum != 1 && classeNum != 2 && classeNum != 3);
			
			joueurs[i].caracteresPersonnage();
			joueurs[i].presentationJoueur();
		}
	}
		
	/* Methode battaile permettant la permutation de main 
	 * d'un joueur à autre pour des actions à réaliser
	 */
	
	private void battaille(){
        int x=0,y=1;
        while (joueurs[x].vie > 0 && joueurs[y].vie > 0) {
            for (int tour = 0; tour < 2; tour++) {
                if (tour == 1) {
                    x = 1;
                    y = 0;
                } else if (tour == 0) {
                    x = 0;
                    y = 1;
                }
                int leJoueur = x+1, ladversaire = y+1;
                System.out.println("Joueur" +leJoueur+ " (" + joueurs[x].getVie() + " Vitalite " + "veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial)");
                int attaque = sc.nextInt();
                if (attaque < 1 || attaque > 2) {
                    System.out.println("Cette attaque est inexistante");
                    tour--;
                }else {
                    if (attaque == 1)
                        joueurs[x].attaqueBasique(joueurs[y]);
                    else
                        joueurs[x].attaqueSpeciale(joueurs[y]);
                    if (joueurs[x].vie <= 0 || joueurs[y].vie <= 0) {
                        System.out.println("Joueur " + ladversaire + " a perdu !");
                        tour = 2;
                    }
                }
            }
       }
	}
}