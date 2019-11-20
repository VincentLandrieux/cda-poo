package Tp2;

public class C_position {
	//Attributs
	int x;
	int y;
	
	//Constructeurs
	public C_position(int px, int py) {
		this.x = px;
		this.y = py;
	}
	
	//Méthodes
	public void deplace(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void affiche() {
		System.out.println("("+this.x +","+this.y+")");
	}
}
