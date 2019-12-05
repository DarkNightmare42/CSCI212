/**
 * @description: Project2
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: CandleGUI - creates jframe and prints data on gridlayout panels
 * 				 GUI sets a 1,2 gridlayout, taking general pane information from the
 * 				 calling class, being project1, this also passes necessary candle data
 * 				 array data to be output into the jframe panes, left being unsorted
 * 				 input data and the second pane being sorted according to price
 * 				 this iteration outputs the elements of a sorted and unsorted CandeList
 * 
 * @param: JFrame
 * @param: CandleNode
 * @param: CandleList
 * @param: TextArea
 * @param: Container
 * @param: toString
 * @param: GridLayout
 * @param: CandleList
 * @param: CandleNode
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
	public CandleGUI(int boxHeight, int boxWidth, String Title, SortedCandleList sorted, UnsortedCandleList unsorted) {
		setTitle(Title);
		setSize(boxHeight, boxWidth);
		setLocation(600,300);
		setVisible(true);
		
		output(sorted, unsorted);
		
	}//CandleGUI
	
	/*
	 * creation of individual panels for the candleClass
	 * setting all specific needs 
	 * and then output accordingly
	 * 
	 */
	
	private void output(SortedCandleList sorted, UnsortedCandleList unsorted) {
		setLayout(new GridLayout(1,2));
		TextArea unSorted = new TextArea();
		unSorted.setEditable(false);
		TextArea afterSort = new TextArea();
		afterSort.setEditable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(unSorted);
		unSorted.append("Unsorted Candles: \n\n"+unsorted);//appends unsorted candle
		add(afterSort);	
		afterSort.append("Sorted Candles: \n\n"+sorted);//heading
		
		setVisible(true);
	}//output method to call UI
	
}//CandleGUI class