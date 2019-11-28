package Tp7;

public class Main {

	public static void main(String[] args) {
		try {
			Point a = new Point(5, 2);
			a.affiche();
			Point b = new Point(110, -1);
			b.affiche();
		}catch(CoordSupCentException e) {
			
		}
		
		System.out.println("Fin du programme");
		
	}

}
