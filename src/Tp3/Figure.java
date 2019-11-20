package Tp3;

public class Figure {

	int x;
	int y;
	
	public Figure() {
		this.x = 0;
		this.y = 0;
	}
	public Figure(int px, int py) {
		this.x = px;
		this.y = py;
	}
	
	public void affiche() {
		System.out.println("("+this.x+","+this.y+")");
	}
	
	public double aire() {
		return 0;
	}

}
