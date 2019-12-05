/**
 * @description: Project3
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * 
 * @description: Handles file menu and passes necessary work on to additional classes as needed
 * 
 * 
 * @param: CandleFileMenuHandler
 * 
 * 
 * @author errol
 * @section: 11E
 */

import javax.swing.*;
import java.awt.event.*;

public class CandleFileMenuHandler implements ActionListener {
	//needed vars
	protected JFrame jframe;
	private static Project3 window = new Project3();

	public CandleFileMenuHandler (JFrame candleJF) {
		jframe = candleJF;
	}//jframe
	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open")) //calls readIn once a file is selected
			window.readIn();
		else if (menuName.equals("Quit"))
			System.exit(0);  //exits if chosen to quit
	} //actionPerformed

}