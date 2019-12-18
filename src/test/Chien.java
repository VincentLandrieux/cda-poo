package test;

public class Chien extends Animal {
	StateChien s = new StateChien();

	public Chien() {
		super();
	}

	public void affiche() {
		System.out.println(s.idle);
		System.out.println(s.mange);
	}
	public void tourne() {
		System.out.println("tourne");
	}
}
