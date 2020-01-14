package fr.epita.quizz.launcher;

import java.util.Scanner;

import fr.epita.quizz.datamodel.Answer;
import fr.epita.quizz.datamodel.Question;

public class Launcher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username = "Anonymous";
		String password = "12345";
		
		// Menu
		System.out.println("MENU"
				+ "\n1) ");
		
//		Question q = new Question(
//				"Who is the current president of France ?",
//				{"Politics", "People", "French Culture"},
//				new Integer(1),
//				new Answer("Emmanuel Macron")
//				);
//		
		// Start reading input
		System.out.println("Please login !");
		
		// Enter credentials
		System.out.print("\nUsername: ");
		// Read Username
		username = input.nextLine();
		
		System.out.print("Password: ");
		// Read Password
		password = input.nextLine();
		
		// If successfull, notify user
		System.out.println("\nSuccessfully logged as \"" + username + "\"");

	}

}
