/**
 * @description: Project3
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
 * @param: CandleFileMenuHandler
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
	private TextArea unSorted;
	private TextArea afterSort;
	private static int count = 0;
	
	/*
	 * creation of individual panels for the candleClass
	 * setting all specific needs 
	 * and then output accordingly
	 * 
	 */
	
	public CandleGUI(int boxHeight, int boxWidth, String Title) {
		setTitle(Title);
		setSize(boxHeight, boxWidth);
		setLocation(600,300);
		setLayout(new GridLayout(1,2));
		unSorted = new TextArea();
		unSorted.setEditable(false);
		afterSort = new TextArea();
		afterSort.setEditable(false);
		createFileMenu();//adds filemenu to GUI

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(unSorted);
		add(afterSort);			
		setVisible(true);
				
	}//CandleGUI - creates window to be used
	
	
	
	public void output(SortedCandleList sorted, UnsortedCandleList unsorted) {
		if(count != 0){
			unSorted.append("\nUnsorted Candles " + (count+1) + ": \n\n"+unsorted);//appends unsorted candle
			afterSort.append("\nSorted Candles " + (count+1) + ": \n\n"+sorted);//with a space if not the first append
		}
		else {
			unSorted.append("Unsorted Candles: \n\n"+unsorted);//appends unsorted candle
			afterSort.append("Sorted Candles: \n\n"+sorted);//with a heading and no space
		}
		count++;
	}//output method to call UI and print list sent from readIn method to GUI
	
	 private void createFileMenu() {
	      JMenuItem item;
	      JMenuBar menuBar  = new JMenuBar();
	      JMenu fileMenu = new JMenu("File");
	      CandleFileMenuHandler candleMenu  = new CandleFileMenuHandler(this); //attaches the menu to the gui already created

	      item = new JMenuItem("Open");    //Open
	      item.addActionListener(candleMenu);
	      fileMenu.add(item);

	      fileMenu.addSeparator();           //add a horizontal separator line
	    
	      item = new JMenuItem("Quit");       //Quit
	      item.addActionListener(candleMenu);
	      fileMenu.add(item);
	      
	      
	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	    
	   } //createMenu
	
}//CandleGUI class