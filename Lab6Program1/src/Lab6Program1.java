import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {
		
			
		/*String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };*/
		int[] fileArray = new int[20];
		//String isOrIsNot, inputNumber;
		String filename = args[0];
		int lengthFilled = inputFromFile(filename, fileArray);
		
		JOptionPane.showMessageDialog(null, "Sum: " + 	sum(fileArray, lengthFilled) + "\nAverage: " + average(fileArray, lengthFilled));
		
		System.exit(0);

				
		//while(true) {
			// This line asks the user for input by popping out a single window
			// with text input
			//inputNumber = JOptionPane.showInputDialog(null, "Enter a number ONLY: ");
			
			
			/*/ if the inputWord is contained within wordArray return true
			if (numberIsThere(inputNumber, fileArray, lengthFilled)) 
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list
			
			// Output to a JOptionPane window whether the word is on the list or not		
			
			JOptionPane.showMessageDialog(null, "The number " + inputNumber + " " + isOrIsNot + " on the list."
					+ "\nSum: " + 	sum(fileArray, lengthFilled) + "\nAverage: " + average(fileArray, lengthFilled));
				*/
		//} //main
			
	}
	
	/*public static boolean numberIsThere(String findMe, int[] theList, int length) {
		
		findMe = findMe.toLowerCase();
		if(findMe.equals("stop")) System.exit(0);
		int inputNumber = Integer.parseInt(findMe);

		for(int i = 0; i < length; i++) {
			if(inputNumber == theList[i]) return true;
		}
		
		return false;
	
	} // wordIsThere*/
	
	public static int sum (int[] myArray, int myArraySize) {
		int totalSum = 0;
		
		for(int i = 0; i < myArraySize; i++) {
			totalSum += myArray[i];
		}
		
		return totalSum;
	}//sum method
	
	public static int average (int[] myArray, int myArraySize) {
		int totalAverage = 0;
		
		totalAverage = sum(myArray, myArraySize);
		
		totalAverage = totalAverage / myArraySize;
		
		return totalAverage;
	}//sum method

	
	private static int inputFromFile(String filename, int[] numbers){
	      TextFileInput in = new TextFileInput(filename);
	      int lengthFilled = 0;
	      String line = in.readLine();
	      while ( lengthFilled < numbers.length && line != null ) {
	         numbers[lengthFilled++] = Short.parseShort(line);
	         line = in.readLine();
	      } // while 
	      if ( line != null ) {
	         System.out.println("File contains too many numbers.");
	         System.out.println("This program can process only " +
	                            numbers.length + " numbers.");
	         System.exit(1);
	         
	      } // if
	      in.close();
	      return lengthFilled; 
	   }  // method inputFromFile
	
} // class Lab4Program1