package towers;

public class Terrain {
	
	public static void main(String[] args) {
		Ennemi grosMechant = new Ennemi(100, 2);
		System.out.println(Ennemi.compteur);
		Ennemi unAutreEnnemi = new Ennemi(50, 4);
		System.out.println(Ennemi.compteur);
		
		System.out.println(grosMechant);
		System.out.println(unAutreEnnemi);
		
		grosMechant.seDeplace(5, 8);
		System.out.println(grosMechant);
		
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);
		
		System.out.println(grosMechant);
		System.out.println(unAutreEnnemi);
		
		Ennemi newEnnemi = Ennemi.creerEnnemi();
		System.out.println(Ennemi.compteur);
		System.out.println(newEnnemi);
	}

}
