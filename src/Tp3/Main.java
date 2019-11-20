package Tp3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Figure tabFigures[] = new Figure[100];
		
		Scanner inp = new Scanner(System.in);
		for(int i = 0; i < tabFigures.length; i++) {
			System.out.println("Entrer 1 pour créer un carré ou 2 pour un cercle");
			int type = inp.nextInt();
			if(type == 1) {
				tabFigures[i] = new Carre();
			}else {
				tabFigures[i] = new Cercle();
			}
		}
		
		inp.close();
		
		System.out.println(aireTotale(tabFigures));
	}
	
	public static double aireTotale(Figure[] tab) {
		double somme = 0;
		for(int i = 0; i < tab.length; i++) {
			somme += tab[i].aire();
		}
		
		return somme;
	}

}
