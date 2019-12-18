package theorie;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		Cat chat1 = new Cat();
		Cat chat2 = new Cat();
		Cat chat3 = new Cat("blanc","Albert");
		
		chat1.setName("Régis");
		chat1.setColor("noir");
		
		chat1.getDescription();
		chat2.getDescription();
		chat3.getDescription();
		
		
		Cat cat1 = new Cat();
		
		System.out.println("Entrer la couleur du chat");
		cat1.setColor(inp.next());
		System.out.println("Entrer le nom du chat");
		cat1.setName(inp.next());
		
		cat1.getDescription();
		
		System.out.println("Entrer un numéro d'action pour "+cat1.getName());
		System.out.println("1. listen");
		System.out.println("2. eat");
		System.out.println("3. hunt");
		System.out.println("4. sleep");
		switch(inp.nextInt()){
		case 1:
			cat1.listen();
			break;
		case 2:
			System.out.println("Entrer un aliment pour "+cat1.getName());
			cat1.eat(inp.next());
			break;
		case 3:
			cat1.hunt();
			break;
		case 4:
			cat1.sleep();
			break;
		default:
			System.out.println("Le chat ne connait pas cette action");
			break;
		}
		
		
		inp.close();
	}

}
