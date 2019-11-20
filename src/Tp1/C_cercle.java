package Tp1;

public class C_cercle {
	//Attributs
	int x;
	int y;
	int rayon;
	
	//Constructeurs
	public C_cercle(int abs, int ord, int rayon) {
		this.x = abs;
		this.y = ord;
		this.rayon = rayon;
	}
	
	//Méthodes
	public void deplace(int delta_x, int delta_y) {
		this.x += delta_x;
		this.y = delta_y;
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	public boolean compare(C_cercle cercle) {
		return this.rayon == cercle.rayon;
	}
	
	public double surface() {
		return Math.PI*(Math.pow(this.rayon,2));
	}
}
