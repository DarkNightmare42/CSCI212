/**
 * Description: CandleList class
 * 				Super class
 * 				contains the default constructor and append method
 * 				also contains the toString method
 * 
 * @param: CandleList
 * @param: CandleNode
 * @param: int
 * @author errol
 *
 */

public abstract class CandleList {
	protected CandleNode first;

	protected CandleNode last;

	protected int length;
	
	public CandleList(){
		first = new CandleNode(null);
		last = first;
		length = 0;
		
	}//default constructor
	 
	public void append(Candle input) {
		CandleNode newData = new CandleNode(input);

		last.next = newData;
		last = last.next;
		length++;
	} //append method to add new nodes to the end of the list
	
	 public String toString() { 
		 CandleNode p = first.next; 
		 String returnString =""; 
		 while (p != null) { 
			 returnString += p.data + " "; 
			 p = p.next; 
			 } 
		 return
	returnString; 
	}//custom toString method
	 

} // class CandleList

