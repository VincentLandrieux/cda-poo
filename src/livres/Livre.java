package livres;

public class Livre {
	//-Propriétés-//
	String titre;
	String auteur;
	boolean emprunte;
	
	//-Constructeurs-//
	public Livre() {
		this.titre = "";
		this.auteur = "";
		this.emprunte = false;
	}
	public Livre(String pTitre, String pAuteur) {
		this.titre = pTitre;
		this.auteur = pAuteur;
		this.emprunte = false;
	}

	//-Accesseurs-//
	//Get
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public boolean isEmprunte() {
		return emprunte;
	}
	//Set
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setEmprunte(boolean emprunte) {
		this.emprunte = emprunte;
	}
	public void emprunter() {
		this.emprunte = true;
	}
	public void rendre() {
		this.emprunte = false;
	}
	
	//-Méthodes-//
	@Override
	public String toString() {
		return "Le Livre \""+this.titre+"\" écrit par "+this.auteur+" est " + (this.emprunte ? "emprunté" : "disponible");
	}

}
