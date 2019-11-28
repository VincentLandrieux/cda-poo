package Tp5.Exo1;

public class Service implements Payant {
	
	float prix;
	
	public Service() {
		prix = 2;
	}

	@Override
	public float getPrix() {
		return prix;
	}

}
