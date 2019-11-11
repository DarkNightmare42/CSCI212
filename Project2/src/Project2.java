/**
 * @description: Project2
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: Project1/main program file, read info, stores and calls necessary classes
 * 				 reads file data, stores it into individual candles provided
 * 				 input data being first height, width and price, storing each
 * 				 into the appropriate candle variables to be used later for output
 * 				 once file reading is complete, it calls a sort method for one 
 * 				 array, once sorted, it sends both arrays to the CandleGUI
 * 				 class to be output, this version of the program incorporates
 * 				 ListNode and Abstract classes
 * 
 * 
 * @param: int
 * @param: String
 * @param: ListNode
 * @param: CandleList
 * @param: Candle
 * @param: StringTokenizer
 * @param: TextFileInput
 * @param: float
 * @param: CandleGUI
 * @return: candle arrays
 * @see: CandleGUI
 * 
 * 
 * @author errol
 * @section: 11E
 */

import java.util.StringTokenizer;
public class Project2 {
	static CandleGUI output;
	//gui declaration

	public static void main(String[] args) {
		//all needed variables and objects
		int inputHeight = 0, inputWidth = 0;
		float inputPrice = 0;
		int currentCandle = 0;
		SortedCandleList sorted = new SortedCandleList();
		UnsortedCandleList unsorted = new UnsortedCandleList();
		Candle[] candle = new Candle[100];
		StringTokenizer candleTokens;
		TextFileInput inputFile = new TextFileInput(args[0]);
		String currentLine;	
		
		while(true) {
			currentLine = inputFile.readLine();
			if(currentLine == null) break;
			candleTokens = new StringTokenizer(currentLine, ",");
			candle[currentCandle] = new Candle();
			if(candleTokens.countTokens() < 3) {
				while(candleTokens.hasMoreTokens()) {
					System.out.print(candleTokens.nextToken() + " ");
				}//print incomplete tokens
				System.out.println();
			}
			else { 
				inputHeight = Integer.parseInt(candleTokens.nextToken());
				inputWidth = Integer.parseInt(candleTokens.nextToken());
				inputPrice = Float.parseFloat(candleTokens.nextToken());
			}//storing candle info
					
			candle[currentCandle].inputData(inputHeight, inputWidth, inputPrice);
			sorted.add(candle[currentCandle]); //add candle to sort list
			unsorted.add(candle[currentCandle]);//add candle to unsorted list
			currentCandle++;
		}//storing that info into two candle arrays for later use
		
		//post readIn processes
		
		printToGUI(sorted, unsorted);
		
		
	}//main method
	
	private static void printToGUI(SortedCandleList sorted, UnsortedCandleList unsorted) {
	
		output = new CandleGUI(600, 400,"CandleGUI",sorted, unsorted);//gui instantiation
	}//printToGUI method

	
	
}
	
	