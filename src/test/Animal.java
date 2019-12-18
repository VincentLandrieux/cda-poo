package test;

public class Animal {
	int x;
	int y;
	State s = new State();
	
	//Constructeur
	public Animal() {
		this.x = 0;
		this.y = 0;
	}
	
	
	//Méthodes
	public void affiche() {
		System.out.println(s.idle);
	}
	

}
