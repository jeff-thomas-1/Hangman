/**
 * Hangman
 * 
 * Group 3
 * 
 * A Hangman game that uses a random word generator from categories. 
 * It determines which player wins based on best out of two/three. 
 * It will allow a certain amount of moves until the player loses.
 * 
 * @author Brandon Barba (bbarba2@asu.edu)
 * @author Vianelis Martinez (Vianelis.Martinez@asu.edu)
 * @author Jeff Thomas (Jeff.Thomas.1@asu.edu)
*/


import java.util.*;
CustomObject myObject = new CustomObject();

public class hangmanUI {
	Random r;
	String level;
	GetData get;
	int round = 1;
	String word; // holds the place of the chosen random word
	boolean finished = false; // Checks when game is over
	boolean badGuess = false; //Checks who's turn it is
	boolean totalBadGuess = false; //Checks to see if the players are out of guesses
	boolean[] foundLetters; //Boolean array to mark which letters have been found
	String entryWord = " "; // String variable for user's guesses
	
	public Hangman() {
		r = new Random();
		get = new GetData();
		playAGame();
	}
	
	public void playAGame(){
		//choose a word from the list of words
		if (level == easy){
			word = colorAnimalFoodEasy[r.nextInt(words.length)];
		}
		if(level == medium) {
			word = musicGenresMedium[r.nextInt(words.length)];
		}
		if(level == hard) {
			word = historicalFiguresHard[r.nextInt(words.length)];
		}
		// create a boolean array for the size of the word
		foundLetters = new boolean[word.length()];
		
		while(!finished){
			showGallows(); // print the gallows and person
			showWord();
			getGuess();
			checkGuess();
			if(totalBadGuess == 6){
				System.out.print('\u000C');
				showGallows();
				System.out.println("Sorry but you lost.");
				System.out.println("The word was: " +word);
				round += 1;
				if(round == 3) {
					finished=true;
				}
				else {
					finished=false;
				}
			}
			if(badGuess == true){
				if(player == 1){
					player = 2;
					System.out.println("It is Players 2 turn.");
				}
				else{
					player = 1;
					System.out.println("It is Players 1 turn.");
				}
			}
		}
	}
	public void showGallows(){
		System.out.print('\u000C');
		if(badGuessCount==0){
			man_0();
		}
		if(badGuessCount==1){
			man_1();
		}
		if(badGuessCount==2){
			man_2();
		}
		if(badGuessCount==3){
			man_3();
		}
		if(badGuessCount==4){
			man_4();
		}
		if(badGuessCount==5){
			man_5();
		}
		if(badGuessCount==6){
			completedMan();
		}
	}
	public boolean showWord(){
		boolean goodGuess = false;
		char ch = entryWord.charAt(0);
		for (int lc = 0; lc < word.length(); lc++){
			if(foundLetters[lc]==true){
				System.out.print(word.CharAt(lc)+ " ");
			}
			else if (word.charAt(lc)==ch){
				System.our.print(word.charAt(lc)+ " ");
				foundLetters[lc] = true;
				goodGuess = true;
			}
			else{
				System.out.print("_ ");
			}
		return goodGuess();
		}
	}
	public void getGuess(){
		System.out.println("\nGuess a letter:");
		System.out.println("Type the whole word to guess the word.");
		System.out.println("You have "+ (6 - badGuessCount) + "guesses left.");
		System.out.print("Enter guess:");
		entryWord = get.aWord();
	}
	public void completedMan(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|\\");
		System.out.println(" |   / \\");
		System.out.println("___   ");
	}
	public void man_0(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |     ");
		System.out.println(" |    ");
		System.out.println(" |    ");
		System.out.println("___   ");
	}
	public void man_1(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |    ");
		System.out.println(" |    ");
		System.out.println("___   ");
	}
	public void man_2(){

		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   / ");
		System.out.println(" |     ");
		System.out.println("___   ");
	}
	public void man_3(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|");
		System.out.println(" |    ");
		System.out.println("___   ");
	}
	public void man_4(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|\\");
		System.out.println(" |     ");
		System.out.println("___   ");
	}
	public void man_5(){
		System.out.println(" _____");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|\\");
		System.out.println(" |   / ");
		System.out.println("___   ");
	}
}

}
