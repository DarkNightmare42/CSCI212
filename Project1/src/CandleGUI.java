/**
 * @description: Project1
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: CandleGUI - creates jframe and prints data on gridlayout panels
 * 				 GUI sets a 1,2 gridlayout, taking general pane information from the
 * 				 calling class, being project1, this also passes necessary candle data
 * 				 array data to be output into the jframe panes, left being unsorted
 * 				 input data and the second pane being sorted according to price
 * 
 * @param: JFrame
 * @param: TextArea
 * @param: Container
 * @param: toString
 * @param: GridLayout
 * @returns: output
 * @see: output of gui class
 * 
 * @author errol
 * @section: 11E
 */

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CandleGUI extends JFrame{
	public CandleGUI(int boxHeight, int boxWidth, String Title) {
		setTitle(Title);
		setSize(boxHeight, boxWidth);
		setLocation(600,300);
		setVisible(true);
		
	}//CandleGUI
	
	/*
	 * creation of individual panels for the candleClass
	 * setting all specific needs 
	 * and then output accordingly
	 * 
	 */
	
	public void outPut(Candle[] unsorted, Candle[] sorted, int limit) {
		setLayout(new GridLayout(1,2));
		TextArea unSorted = new TextArea();
		unSorted.setEditable(false);
		TextArea afterSort = new TextArea();
		afterSort.setEditable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(unSorted);
		add(afterSort);	

		for(int i = 0; i < limit; i++) {
			unSorted.append(unsorted[i]+"\n");
			afterSort.append(sorted[i]+"\n");
		}
		
		setVisible(true);
	}//output method to call UI
	
}//CandleGUI class
