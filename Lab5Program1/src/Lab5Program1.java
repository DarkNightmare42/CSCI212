import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
		
			
		/*String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };*/
		String[] fileArray = new String[10];
		String isOrIsNot, inputWord;
		String filename = args[0];
		int lengthFilled = inputFromFile(filename, fileArray);
				
		while(true) {
			// This line asks the user for input by popping out a single window
			// with text input
			inputWord = JOptionPane.showInputDialog(null, "Enter a word:");
			
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, fileArray, lengthFilled)) 
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list
			
			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		} //main
			
	}
	
	public static boolean wordIsThere(String findMe, String[] theList, int length) {
		
		findMe = findMe.toLowerCase();

		for(int i = 0; i < length; i++) {
			if(findMe.equals("stop")) System.exit(0);
			else if(findMe.equals(theList[i])) return true;
		}
		
		return false;
	
	} // wordIsThere

	
	private static int inputFromFile(String filename, String[] words){
	      TextFileInput in = new TextFileInput(filename);
	      int lengthFilled = 0;
	      String line = in.readLine();
	      while ( lengthFilled < words.length && line != null ) {
	         words[lengthFilled++] = line;
	         line = in.readLine();
	      } // while 
	      if ( line != null ) {
	         System.out.println("File contains too many words.");
	         System.out.println("This program can process only " +
	                            words.length + " words.");
	         System.exit(1);
	         
	         for(int i = 0; i < words.length; i++) {
	        	 System.out.println(words[i]+"\n");
	         }
	      } // if
	      in.close();
	      return lengthFilled; 
	   }  // method inputFromFile
	
} // class Lab4Program1