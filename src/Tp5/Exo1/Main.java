package Tp5.Exo1;

public class Main {

	public static void main(String[] args) {
		Service s1 = new Service();
		Boisson b1 = new Boisson();
		Service s2 = new Service();
		Boisson b2 = new Boisson();
		
		Payant ligne_prix[] = {s1,b1,s2,b2};
		
		float somme = 0;
		for(int i = 0; i < ligne_prix.length; i++) {
			somme += ligne_prix[i].getPrix();
		}
		
		System.out.println(somme);
	}

}
