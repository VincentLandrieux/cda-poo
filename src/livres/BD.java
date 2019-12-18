package livres;

public class BD extends Livre {
	//-Propri�t�s-//
	String dessinateur;

	//-Constructeurs-//
	public BD() {
		super();
		this.dessinateur = "";
	}
	public BD(String pTitre, String pAuteur) {
		super(pTitre, pAuteur);
		this.dessinateur = "";
	}
	public BD(String pTitre, String pAuteur, String pDessinateur) {
		super(pTitre, pAuteur);
		this.dessinateur = pDessinateur;
	}

	//-Accesseurs-//
	public String getDessinateur() {
		return this.dessinateur;
	}
	public void setDessinateur(String pDessinateur) {
		this.dessinateur = pDessinateur;
	}
	
	//-M�thodes-//
	@Override
	public String toString() {
		return "Le Livre \""+this.titre+"\" �crit par "+this.auteur+" et dessin� par "+this.dessinateur+" est " + (this.emprunte ? "emprunt�" : "disponible");
	}
}
