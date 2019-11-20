package Tp4;

public class Carre extends Figure{
	int cote;
	
	public Carre() {
		super();
		this.cote = 1;
	}
	public Carre(int px, int py, int pCote) {
		super(px, py);
		this.cote = pCote;
	}
	
	public void affiche() {
		System.out.println("("+this.x+","+this.y+"), "+this.cote);
	}
	
	public double aire() {
		return Math.pow(this.cote,2);
	}

}
