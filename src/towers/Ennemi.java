package towers;

import java.util.Scanner;

public class Ennemi {
	//propriétés
	float posX;
	float posY;
	
	int pv;
	int rapidite;
	
	static int compteur = 0;
	
	//Constructeurs
	public Ennemi() {
		this.posX = 0;
		this.posY = 0;
		this.pv = 100;
		this.rapidite = 2;
		this.compteur++;
	}
	public Ennemi(int p, int r) {
		this.posX = 0;
		this.posY = 0;
		this.pv = p;
		this.rapidite = r;
		this.compteur++;
	}
	
	//Méthodes
	public static Ennemi creerEnnemi() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Entrer les pv et la rapidité de l'ennemi à créer");
		return new Ennemi(inp.nextInt(),inp.nextInt());
	}
	//Actions
	public void recevoirDegats(int deg) {
		this.pv -= deg;
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX = nouveauX;
		this.posY = nouveauY;
	}
	
	//Informations
	public String toString() {
		return "Position: "+this.posX +" "+this.posY+"\n"
		+"Pv: "+this.pv+"\n"
		+"rapidité: "+this.rapidite+"\n";
	}
	
	public boolean estVivant() {
		return this.pv > 0;
	}

}
