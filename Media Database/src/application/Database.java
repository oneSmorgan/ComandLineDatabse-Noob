package application;

import java.util.*;

public class Database {
	static Map<String , Media>  seriesList = new HashMap<>();
	
	static void ShowDatabase(){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("\n\nList of Media in Database\n\n");
		
		/*
		 * 
		 * Add to Choose media before declaring
		 *  EX , Anime or Movie
		 *  
		 */
		
		Media a = new Media();
		a.setTypeOfMedia("Anime");
		a.setMediaName("Galgun");
		a.setGenre("Action, Love");
		a.setSeasonsTotal(2);
		a.setEpisodesTotal(24);
		
		seriesList.put(a.getMediaName(), a);
		
		for(Map.Entry<String, Media> entry : seriesList.entrySet()) {
			
				String k = entry.getKey();
				Media v = entry.getValue();
			
				System.out.print("| " + v.getTypeOfMedia() + " | " 
								+ k + " | "
								+ v.getGenre() + " | "
								+ v.getEpisodesTotal() + " eps | "
								+ v.getSeasonsTotal() + " seasons | " + "\n");
		}
		
		System.out.print("\n\nPlease press ENTER to return to the beginning\n\n");
		userInput.nextLine();
		
		Application.StartProgram();
		
		userInput.close();
	}
	
	static void AddToDatabase(){
		Scanner userInput = new Scanner(System.in);
		
		Media a = new Media();
		
		System.out.print("Write the type of media you would like to add \n");
		String typeOfMedia = userInput.nextLine();
		a.setTypeOfMedia(typeOfMedia);
		
		System.out.print("Write the name of Series you would like to add \n");
		String name = userInput.nextLine();
		a.setMediaName(name);
		
		System.out.print("\nWrite the Genre of the Media: seperate with a comma. \n");
		String genre = userInput.nextLine();
		a.setGenre(genre);
		
		System.out.print("\nWrite the number of seasons the Media has. \n");
		int seasons = userInput.nextInt();
		a.setSeasonsTotal(seasons);
		
		System.out.print("\nWrite the number of Episodes the Media has. \n");
		int episodesTotal = userInput.nextInt();
		a.setEpisodesTotal(episodesTotal);
		
		seriesList.put(a.getMediaName(), a);
		
		System.out.print("\n\nPress ENTER to return to the MAIN MENU\n\n");
		userInput.nextLine();
		
		Application.StartProgram();
		
		userInput.close();
	}
	
	static void RemoveFromDatabase(){
		Scanner userInput = new Scanner(System.in);
		
		seriesList.remove("Galgun");
		
		System.out.print("Write the name of the Anime you would like to Delete \n");
		userInput.nextLine();
		Application.StartProgram();
		
		
		userInput.close();
	}
	
}
