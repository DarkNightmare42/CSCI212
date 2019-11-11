import java.util.StringTokenizer;

/* *
 * 
 * Use of StringTokenizer with TextFileInput
 * lab program 
 * fairly simple, not to be over-complicated
 * @author errolz
 * 
 * 
 * @param: TextFileInput
 * @param: StringTokenizer
 * @param: testArray
 * @param: myFile
 * @param: myTokens
 * @param: fillArray
 * @param: line
 * @param: col and row
 * 
 * 
 */

public class Lab8Program1 {
	public static StringTokenizer myTokens;
	public static TextFileInput myFile;
	public static int[][] testArray;
	public static String line;
	public static int row, col;
	//all variables to be used declared globally, should probably change these to individual variables and pass them accordingly 
	
	public static void main(String[] args) {
		
		myFile = new TextFileInput(args[0]); //sets the file to be used
		testArray = fillArray(myFile); //fills the testArray from myFile using the fill array method
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col ; j++)
				display(testArray[i][j]);//calls display method to print individual elements
			System.out.println(); //goes to the next line at the end of each row
		}//print method
		
	}
		
		
	private static void display (int num){
		if(num > 10)System.out.print(num+" "); //checks whether each number is greater than 10
		else System.out.print(num+"  ");
	}//print method number check
	
	/*
	 * fillArray method basically fills out the array
	 * read individual comments for breakdown
	 */
	
	public static int[][] fillArray(TextFileInput myFile){
		line = myFile.readLine(); //reads the first line of the textfile
		myTokens = new StringTokenizer(line,",");//sets the tokenizer input and delimiter
		row = Integer.parseInt(myTokens.nextToken()); //reads first token and stores it
		col = Integer.parseInt(myTokens.nextToken());//reads second token and stores it
		testArray = new int[row][col]; //initializes the array and sets the paramters
		//line = myFile.readLine(); //reads the next line, since it won't automatically do so
		//myTokens = new StringTokenizer(line,","); //sets the token delimiter again for the new line
		
		for(int i = 0; i < row; i++) { //nested for loops to actually fill the array 
			line = myFile.readLine(); //reads the next line to proceed filling the next row
			myTokens = new StringTokenizer(line,","); //checks to make sure there are tokens that can be use and then proceeds to set the delimiter if true
			for(int j =  0; j < col; j++) { //column for loop
				testArray[i][j] = Integer.parseInt(myTokens.nextToken()); //takes the individual token and fills the current array element
			}
		} //array filling nested for loops (can be done with while loops as well)
		
		return testArray;
	}//fill array method
	
}