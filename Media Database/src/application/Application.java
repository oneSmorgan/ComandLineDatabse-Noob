package application;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Welcome to The Database");
		userInput.nextLine();
		
		//Starts Prompt for user input
		StartProgram();
		
		
		//====== Keep at END ========
		userInput.close();
	}
	
	static void StartProgram(){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("What would you like to do? \n \n"
				+ "1 - List Contents in Database \n"
				+ "2 - Add Media to Database \n"
				+ "3 - Delete Media from Database \n"
				+ "4 - Exit program \n \n ");
		
		Integer inputA = userInput.nextInt();
		
		if(inputA == 1){
			//List contents of Database
			// NOTE: Add persistence - JSON then MYSQL
			Database.ShowDatabase();
		} else if(inputA == 2) {
			//Add media to Database
			Database.AddToDatabase();
		} else if(inputA == 3) {
			//Remove Media from database
			// NOTE: Add search and sort Algorithm
			Database.RemoveFromDatabase();
		} else if(inputA == 4){
			// Exit Program
			ExitProgram();
		} else {
			System.out.print("Not listed");
			StartProgram();
		}
		
		userInput.close();
	}
	
	static void ExitProgram(){
		
	}

}
