package Tp5.Exo2;

public class Cercle extends Figure{
	int rayon;
	
	public Cercle() {
		super();
		this.rayon = 1;
	}
	public Cercle(int px, int py, int pRayon) {
		super(px,py);
		this.rayon = pRayon;
	}
	
	public void affiche() {
		System.out.println("("+this.x+","+this.y+"), "+this.rayon);
	}
	
	public float getAire() {
		return (float)(Math.PI * (Math.pow(this.rayon,2)));
	}

	public String getType() {
		return "Cercle";
	}
}
