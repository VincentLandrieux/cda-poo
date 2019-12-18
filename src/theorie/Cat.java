package theorie;

public class Cat {
	private String color;
	private String name;
	
	boolean toEat = false;
	
	//Constructor
	public Cat() {
		this.color = "gris";
		this.name = "chat";
		System.out.println("Naissance d'un nouveau chat");
	}
	public Cat(String pColor, String pName) {
		this.color = pColor;
		this.name = pName;
		System.out.println("Naissance d'un nouveau chat");
	}
	
	//Actions
	public void listen() {
		if(toEat) {
			System.out.println("Le chat "+name+" ronronne");
		}else {
			System.out.println("Le chat "+name+" miaule");
		}
	}
	
	public void eat(String food) {
		if(food.contentEquals("mouse")) {
			toEat = true;
			System.out.println("Le chat "+name+" mange une souris");
		}else {
			System.out.println("Le chat "+name+" n'aime pas cet aliment");
		}
	}
	
	public String hunt() {
		System.out.println("Le chat "+name+" à chassé une souris");
		
		return "mouse";
	}
	
	public void sleep() {
		System.out.println("Le chat "+name+" dort");
	}
	
	//Gets
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name;
	}
	
	public void getDescription() {
		System.out.println("Le chat "+ this.color + " s'appelle " + this.name);
	}
	//Sets
	public void setColor(String pColor) {
		this.color = pColor;
	}
	public void setName(String pName) {
		this.name = pName;
	}
}
