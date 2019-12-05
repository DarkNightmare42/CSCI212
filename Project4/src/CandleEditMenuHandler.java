/**
 * @description: Project4
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * 
 * @description: Handles edit menu and passes necessary work on to additional classes as needed
 * 
 * 
 * @param: CandleEditMenuHandler
 * 
 * 
 * @author errol
 * @section: 11E
 */

import javax.swing.*;
import java.awt.event.*;

public class CandleEditMenuHandler implements ActionListener {
	//needed variables
	protected JFrame jframe;
	private static Project4 window = new Project4();
	private static float criteria;

	public CandleEditMenuHandler (JFrame candleJF) {
		jframe = candleJF;
	}//jframe
	public void actionPerformed(ActionEvent event) {
		String status = null;
		String menuName = event.getActionCommand();
		if (menuName.equals("Search")) { //calls search option once a file is selected
			while(true) {
				if((status = JOptionPane.showInputDialog(null, "Enter Maximum Price to filter by: ")) != null)//input dialog
				try {
				criteria = Float.parseFloat(status); //converts to float to be used for search
				}
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "input is not valid, try again.", "Error!", JOptionPane.ERROR_MESSAGE); //error dialog for incorrect input type
					continue;
				}
			break;
			}
			window.searchString(criteria);
		}//actionPerformed
	} //actionPerformed

}