package Tp2;

public class C_point extends C_position{
	//Attributs
	char nom;
	
	//Constructeurs
	public C_point(int px, int py, char pNom) {
		super(px,py);
		this.nom = pNom;
	}
	
	//Méthodes
	public void affiche() {
		System.out.println(this.nom+"("+this.x+","+this.y+")");
	}
}
