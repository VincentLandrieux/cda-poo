package towers;

import java.util.Scanner;

public class Ennemi {
	//propri�t�s
	private float posX;
	private float posY;
	
	private int pv;
	private int rapidite;
	
	static int compteur = 0;
	
	//Accesseurs
	//get
	public float getPosX() {
		return this.posX;
	}
	public float getPosY() {
		return this.posY;
	}
	public int getPv() {
		return this.pv;
	}
	public int getRapidite() {
		return this.rapidite;
	}
	//set
	public void setPosX(float pPosX) {
		this.posX = pPosX;
	}
	public void setPosY(float pPosY) {
		this.posY = pPosY;
	}
	public void setPv(int pPv) {
		this.pv = pPv;
	}
	public void setRapidite(int pRapidite) {
		this.rapidite = pRapidite;
	}
	
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
	
	//M�thodes
	public static Ennemi creerEnnemi() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Entrer les pv et la rapidit� de l'ennemi � cr�er");
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
		+"rapidit�: "+this.rapidite+"\n";
	}
	
	public boolean estVivant() {
		return this.pv > 0;
	}

}
