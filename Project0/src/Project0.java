import javax.swing.*;

/*
 * 
 * Project: Project0
 * Description: To count the number of upper
 * and lower case e's in a line being input by the user.
 * 
 * @param: inputStatement
 * @param: JoptionPane
 * @param: counter
 * 
 * author @ErrolRoberts
 * Lab section: 11E
 */

public class Project0 {
    public static void main(String[] args){

        String inputStatement; //input String to be checked for e's
        int counter[] = new int[2];
        
        while(true) {

	       inputStatement = JOptionPane.showInputDialog(null, "Type a sentence to be checked and press enter: ");
	       //takes user input using JOption pane
	        
	        if(inputStatement.equalsIgnoreCase("stop")) System.exit(0);
	        //checks if input word is equal to stop, if so exit, if not continue
        
	        letterCounter(inputStatement, counter); 
	        //calls letterCounter method
	        counter[0] = 0;
	        counter[1] = 0;
	        //resets counter array values
	        
	    } //while statement to take input and call necessary methods

    } //main class
    
    /*
     * letterCounter method to take inputStatement
     * convert to char string and then proceed
     * to count number of upper or lower case e's
     * then return then send the results to the printout
     * method
     * 
     * @param: inputStatement
     * @param: toCharArray
     * @param: testStatement
     */
    
    
    public static void letterCounter(String inputStatement, int count[]) {
    	
    	char[] testStatement = inputStatement.toCharArray();
    	//converts string to a char array
       	
    	for(int i = 0; i < testStatement.length; i++) {
    		if(testStatement[i] == 'e') count[0]++;
    		if(testStatement[i] == 'E') count[1]++;
    		//if statements within for loop to count e's
    	}
    	
    	printOut(count);
    }//letterCounter method
    
    /*
     * printOut method to output the results of the 
     * letterCounter method using a JOption pane
     */
    
    
    public static void printOut(int counted[]){
    	
        JOptionPane.showMessageDialog(null, "Number of e's are " + counted[0] + "\nNumber of E's are " + counted[1]);
    }//printOut method

}
