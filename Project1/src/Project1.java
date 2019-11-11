/**
 * @description: Project1
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: Project1/main program file, read info, stores and calls necessary classes
 * 				 reads file data, stores it into individual candles provided
 * 				 input data being first height, width and price, storing each
 * 				 into the appropriate candle variables to be used later for output
 * 				 once file reading is complete, it calls a sort method for one 
 * 				 array, once sorted, it sends both arrays to the CandleGUI
 * 				 class to be output
 * 
 * 
 * @param: int
 * @param: String
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
public class Project1 {
	public static void main(String[] args) {
		int inputHeight = 0, inputWidth = 0;
		float inputPrice = 0;
		int currentCandle = 0;
		Candle[] candle = new Candle[100];
		Candle[] sortedCandle = new Candle[100];
		StringTokenizer candleTokens;
		TextFileInput inputFile = new TextFileInput(args[0]);
		String currentLine;
		
		while(true) {
			currentLine = inputFile.readLine();
			if(currentLine == null) break;
			candleTokens = new StringTokenizer(currentLine, ",");
			candle[currentCandle] = new Candle();
			sortedCandle[currentCandle] = new Candle(); 
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
			sortedCandle[currentCandle].inputData(inputHeight, inputWidth, inputPrice);
			currentCandle++;
		}//storing that info into two candle arrays for later use
		
		//post readIn processes
		
		selectionSort(sortedCandle, currentCandle); //sort one array by price
		printToGUI(candle, sortedCandle, currentCandle);
		
		
	}//main method
	
	private static void printToGUI(Candle[] unsorted, Candle[] sorted, int limit) {
	
		CandleGUI output = new CandleGUI(600, 400, "Unsorted Candles          CandleGUI          Sorted Candles");//gui variable
		output.outPut(unsorted, sorted, limit);//send data to gui to output
	}//printToGUI method

	
	private static void selectionSort(Candle[] sortedCandles, int limit) {
		int smallestPrice; 
		for(int i = 0; i < limit - 1; i++) {
			smallestPrice = i;
			for(int j = i + 1; j < limit; j++) {
				if(sortedCandles[j].getPrice() < sortedCandles[smallestPrice].getPrice())
					smallestPrice = j;

			}
			swap(sortedCandles, i, smallestPrice);
			
		}
	}//selectionSort method
	
	//swaps values between temp and candles to as part of the sort method
	
	private static void swap(Candle[] sorted, int index, int smallest) {
		Candle temp = new Candle();
		temp = sorted[index];
		sorted[index] = sorted[smallest];
		sorted[smallest] = temp;
	}
}//swap method
