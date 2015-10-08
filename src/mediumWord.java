public class mediumWord {

	private ArrayList <String> wordList = new ArrayList <String> ();	

	public easyWord() {
	//adds the individual words in the file to the array list
		try {
			BufferedReader hangmanWords = new BufferedReader(new FileReader("mediumWord.txt"));
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
