package livres;

public class Main {

	public static void main(String[] args) {
		Livre roman = new Livre("Le disque monde", "Terry Pratchet");
		System.out.println(roman); 

		roman.emprunter();
		System.out.println(roman);
		
		
		BD asterix = new BD("Asterix et Cléopatre", "Goscinny", "Uderzo");
		System.out.println(asterix);

	}

}
