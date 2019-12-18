package livres;

public class BD extends Livre {
	//-Propriétés-//
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
	
	//-Méthodes-//
	@Override
	public String toString() {
		return "Le Livre \""+this.titre+"\" écrit par "+this.auteur+" et dessiné par "+this.dessinateur+" est " + (this.emprunte ? "emprunté" : "disponible");
	}
}
