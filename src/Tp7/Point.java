package Tp7;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point(int abs, int ord) throws CoordSupCentException{
		if((abs > 100) || (ord > 100)) {
			throw new CoordSupCentException();
		}else {
			x = abs;
			y = ord;
		}
	}
	
	public void affiche() {
		System.out.println("Mes coor. x, y sont " + x + ", " +y);
	}

}

class CoordSupCentException extends Exception {
	
	public CoordSupCentException() {
		System.out.println("Coordonnée > 100 !");
	}
}
