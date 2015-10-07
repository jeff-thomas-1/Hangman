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

public class wordDatabase {
private static String [] colorAnimalFoodEasy =   //Easy word from this list
	{"Red", "Green"," Yellow", "Blue", "Orange"," Purple", "Pink", 
		"Brown", "Black", "Gray", "White", "Lion", "Tiger", "Duck", "Cat", 
		"Bird", "Dog"," Cow", "Horse", "Chicken", "Cake", "Pizza", 
		"Ice cream", "Hot dog", "Burrito", "Taco" };
	
	private static String [] musicGenresMedium =   //Medium word from this list
		{"Alternative", "Blues",  "Classical", " Country",  "Dance" ,  "Easy Listening",  "Electronic" ,  
		"European" ,  "Hip Hop" ,  "Indie Pop","Inspirational", "Asian Pop",  "Jazz",  "Latin" , "New Age",
		"Opera","Pop", "Soul",  "Reggae",  "Rock", "Folk",  "World" };

	private static String [] historicalFiguresHard =   //Hard word from this list
		{"jesus","napoleon" ,"Muhammad", "Shakespeare", "Lincoln"," Washington",
		"Hitler", " Aristotle", " Jefferson", "Darwin", "Marx", " Caesar", "Victoria", "Stalin", 
		"Einstein", "Columbus", "Newton", "Charlemagne", "Roosevelt", "Mozart",
	"	Plato", "Beethoven", "da Vinci", "Dickens", "Franklin"};
}
