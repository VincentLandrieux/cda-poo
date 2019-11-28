package Tp5.Exo2;

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
	
	public float getAire() {
		return (float)(Math.pow(this.cote,2));
	}

	public String getType() {
		return "Carre";
	}
}
