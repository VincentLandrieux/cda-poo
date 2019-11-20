package Tp1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exo1
		System.out.println("-Exo1-");
		C_cercle cercle1 = new C_cercle(10,10,20);
		
		cercle1.deplace(20, 30);
		cercle1.affiche();
		System.out.println(cercle1.compare(new C_cercle(5,10,25)));
		System.out.println(cercle1.surface());
		System.out.println();
		
		//Exo2
		System.out.println("-Exo2-");
		C_cercle tab3Cercles[] = new C_cercle[3];
		tab3Cercles[0] = new C_cercle(1,1,20);
		tab3Cercles[1] = new C_cercle(5,5,10);
		tab3Cercles[2] = new C_cercle(8,4,12);
		
		for(int i=0; i<tab3Cercles.length; i++) {
			tab3Cercles[i].deplace(20, 30);
			tab3Cercles[i].affiche();
			System.out.println(tab3Cercles[i].compare(new C_cercle(5,10,25)));
			System.out.println(tab3Cercles[i].surface());
			System.out.println();
		}
		
		//Exo3
		System.out.println("-Exo3-");
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Entrer le nombre de cercle");
		int nbCercle = inp.nextInt();
		inp.close();
		
		C_cercle tabCercles[] = new C_cercle[nbCercle];
		
		for(int i=0; i<nbCercle; i++) {
			tabCercles[i] = new C_cercle(1,1,20);
		}
		
		for(int i=0; i<tabCercles.length; i++) {
			tabCercles[i].deplace(20, 30);
			tabCercles[i].affiche();
			System.out.println(tabCercles[i].compare(new C_cercle(5,10,25)));
			System.out.println(tabCercles[i].surface());
			System.out.println();
		}
	}

}
