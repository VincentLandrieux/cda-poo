package Tp8;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
//		Scanner inp = new Scanner(System.in);
		
		//Ecriture
		String nomFichier = "texte";
		
//		System.out.println("Entrer le nom du fichier � cr�er");
//		nomFichier = inp.nextLine();
		
		nomFichier = "src/"+nomFichier;
		
		FileOutputStream fsortie = new FileOutputStream(nomFichier);
		
		fsortie.write(105);
		fsortie.write(32);
		fsortie.write('d');
		
		//Creation
		DataOutputStream sortie = new DataOutputStream(fsortie);
		
		sortie.writeInt('e');
		sortie.writeInt(97);
		
		
		fsortie.close();
//		/sortie.close();
		
		//Lecture
		FileInputStream fentree = new FileInputStream(nomFichier);
		
		System.out.println("Entr�e "+fentree.read());
		System.out.println("Entr�e "+fentree.read());
		System.out.println("Entr�e "+fentree.read());
		System.out.println("Entr�e "+fentree.read());
		
		fentree.close();
		
//		inp.close();

	}

}
