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


public class easyWord {

	private ArrayList <String> wordList = new ArrayList <String> ();	

	public easyWord() {
	//adds the individual words in the file to the array list
		try {
			BufferedReader hangmanWords = new BufferedReader(new FileReader("EasyWord.txt"));
			while(true) {
				String line = hangmanWords.readLine();
				if(line == null) break;
				wordList.add(line);
			}
			hangmanWords.close();
		} catch (IOException ex) {
			 
		}
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		return wordList.get(index);

	}

	
	/** Returns the number of words in the caagory selected */
	public int getWordCount() {
		return wordList.size();
	}	
}
