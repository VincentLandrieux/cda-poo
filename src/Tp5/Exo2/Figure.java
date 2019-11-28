package Tp5.Exo2;

abstract class Figure implements Calcul_geometrique, Type_figure{

	int x;
	int y;
	
	//Constructeur
	public Figure() {
		this.x = 0;
		this.y = 0;
	}
	public Figure(int px, int py) {
		this.x = px;
		this.y = py;
	}
	
	//Accesseurs
	//get
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//set
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Méthodes
	public void affiche() {
		System.out.println("("+this.x+","+this.y+")");
	}
	
	protected void dessine() {
		affiche();
	}

}
