package Tp5.Exo1;

public class Boisson implements Payant {
	
	float prix;

	public Boisson() {
		prix = 3;
	}
	
	@Override
	public float getPrix() {
		
		return prix;
	}

}
