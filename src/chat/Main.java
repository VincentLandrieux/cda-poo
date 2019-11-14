package chat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cat monChat = new Cat();
		System.out.println("Comment s'appelle-t-il ?");
		monChat.name = sc.next();
		System.out.println("De quelle couleur est " + monChat.name + " ?");
		monChat.color = sc.next();
		sc.nextLine(); // nettoyage du scanner
		monChat.getDescription();
		boolean flag = true;

		do {
			System.out.println("Quelle action voulez vous ?");
			System.out.println("1 : écouter; 2 : manger; 3 : chasser; 4 : description; 5 : dormir; 0 : quit");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				monChat.listen();
				break;
			case 2:

				System.out.println(monChat.name + "veut manger");
				System.out.println("Vous lui donnez, quoi ?");
				sc.nextLine();
				String food = sc.next();
				sc.nextLine(); // nettoyer le scanner quand on change de type
				monChat.eat(food);
				break;
			case 3:
				String t = monChat.hunt();
				System.out.println(monChat.name + " vous rapporte ça : " + t);
				break;
			case 4:
				monChat.getDescription();
				break;
			case 5:
				monChat.sleep();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println(monChat.name + " ne comprend pas");
				break;
			}
		} while (flag);
		System.out.println("Good bye");
		sc.close();

	}

}
