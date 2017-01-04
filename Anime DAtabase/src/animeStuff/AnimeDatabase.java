package animeStuff;

import java.util.*;


public class AnimeDatabase {
	
	static Map<String , AnimeSeries> seriesList = new HashMap<>();	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Welcome to you're Anime Database \n");
		userInput.nextLine();
		
		startProgram();
		
		
		userInput.close();
	}
	
	
	
	static void startProgram(){
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("What would you like to do? \n \n"
						+ "1 - List Anime in Database \n"
						+ "2 - Add Anime to Database \n"
						+ "3 - Delete Anime from Database \n"
						+ "4 - Exit program \n \n ");
		
		Integer actionA = userInput.nextInt();

		if(actionA == 1){
			ShowDatabase();
		}
		if(actionA == 2){
			AddSeries();
		}
		if(actionA == 3){
			DeleteAnimeFromDatabase();
		}
		if(actionA == 4){
			ExitProgram();
		}
		
		userInput.close();
	}
	
	static void ShowDatabase(){
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print(" \n \n List of Anime in Database \n \n");
		
		AnimeSeries a = new AnimeSeries();
		a.setSeriesName("Galgun");
		a.setSeriesGenre("Action, Ecchi");
		a.setNumberOfSeasons(2);
		a.setNumberOfEpisodesTotal(24);
		
		
		seriesList.put(a.seriesName, a);
		
		
		for(Map.Entry<String, AnimeSeries> entry : seriesList.entrySet()) {
			
			String k = entry.getKey();
			AnimeSeries v = entry.getValue();
			
			System.out.print("| " + k + " | " 
							+ v.seriesGenre + " | "
							+ v.numberOfSeasons + " | "
							+ v.numberOfEpisodesTotal + " |" + "\n");
		}
		
		System.out.print(" \n \n Please press \"Enter\" to return to the beginning \n \n ");

		userInput.nextLine();
		startProgram();
		
		userInput.close();
		
	}
	
	static void AddSeries(){
		
		Scanner userInput = new Scanner(System.in);
		
		AnimeSeries a = new AnimeSeries();
		
		System.out.print("Write the name of the Anime you would like to add \n");
		String name = userInput.nextLine();
		a.setSeriesName(name);
		
		System.out.print("\nWrite the Genre of the Anime, seperate with a comma. \n");
		String genre = userInput.nextLine();
		a.setSeriesGenre(genre);
		
		System.out.print("\nWrite the number of seasons the Anime has. \n");
		int seasons = userInput.nextInt();
		a.setNumberOfSeasons(seasons);
		
		System.out.print("\nWrite the number of episodes the anime has. \n");
		int episodes = userInput.nextInt();
		a.setNumberOfEpisodesTotal(episodes);
		
		seriesList.put(a.seriesName, a);
		
		System.out.print("\n \nPress \"Enter\" to return to main Menu \n \n");
		userInput.next();

		
		startProgram();
		
		userInput.close();
	}
	
	static void DeleteAnimeFromDatabase(){
		System.out.print("Write the name of the Anime you would like to Delete \n");
	}
	
	static void ExitProgram(){
		
	}
}
