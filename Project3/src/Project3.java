import java.io.File;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @description: Project3
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: Project1/main program file, read info, stores and calls necessary classes
 * 				 reads file data, stores it into individual candles provided
 * 				 input data being first height, width and price, storing each
 * 				 into the appropriate candle variables to be used later for output
 * 				 once file reading is complete, it calls a sort method for one 
 * 				 array, once sorted, it sends both arrays to the CandleGUI
 * 				 class to be output, incorporates
 * 				 ListNode and Abstract classes, and now incorporates fileChooser and a filemenu
 * 
 * 
 * @param: int
 * @param: String
 * @param: CandleGUI
 * @param: StringTokenizer
 * @param: JFileChooser
 * @see: CandleGUI
 * 
 * 
 * @author errol
 * @section: 11E
 */

public class Project3 {
	
	private static CandleGUI newWindow;
	
	//@SuppressWarnings("unused")
	public static void main(String args[]) {
		newWindow = new CandleGUI(600, 400,"CandleGUI");
	}
	
	public void readIn() {
		//all needed variables and objects

		int inputHeight = 0, inputWidth = 0;
		float inputPrice = 0;
		SortedCandleList sorted = new SortedCandleList();
		UnsortedCandleList unsorted = new UnsortedCandleList();
		StringTokenizer candleTokens;
		TextFileInput inputFile = new TextFileInput(getPath());
		String currentLine = inputFile.readLine();

		while(currentLine != null) {
			candleTokens = new StringTokenizer(currentLine, ",");
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


			Candle candle = new Candle(inputHeight, inputWidth, inputPrice);
			sorted.add(candle); //add candle to sort list
			unsorted.add(candle);//add candle to unsorted list
			currentLine = inputFile.readLine();
		}//storing that info into two candle arrays for later use

		//post readIn processes

		newWindow.output(sorted, unsorted); //sends the list to gui to be printed


	}//readIn method
	
	private static String getPath() { 
		int status;
		JFileChooser candleFile = new JFileChooser("./");
		File file = null;
		candleFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		status = candleFile.showOpenDialog(null);
		if (status == JFileChooser.APPROVE_OPTION) 
			file = candleFile.getSelectedFile(); //retrieves file path once selected
		else {
			JOptionPane.showMessageDialog(null, "Open File dialog canceled \nProgram Will Exit Now");
			System.exit(0); //calls exit(0) if cancel file selection is chosen
		}
		System.out.println(candleFile.toString());
		return file.toString();
	}//getpath method that gets the selected path and passes it to textfileinput
	
}
	
	