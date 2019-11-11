/**
 * Description: SortedCandleList class
 * 				with each call, each element is checked
 * 				and based on price, either inserted or appended
 * 				to the existing list, or in the beginning creates a new list
 * 
 * @param: SortedCandleList
 * @param: CandleNode
 * @param: int
 * @author errol
 *
 */


public class SortedCandleList extends CandleList {

	public SortedCandleList(){
	}//constructor class
	
	public void add(Candle newInput) {
		CandleNode current = first;
		CandleNode point = first.next;
		CandleNode newData = new CandleNode(newInput);

		
		if(length == 0) {
			append(newInput);
		}//adds a node if the list is empty
			
		else {
			while(point != null && newData.data.getPrice() >= point.data.getPrice()) { //checks if the next node is null
					current = point;//moves the current node to the next node
					point = point.next; //moves the next node to the node after that
				}
			current.next = newData;
			newData.next = point;
			length++;
			}//compares the new nodes to existing nodes and inserts it where it is smaller than the one after
			//or equal to
	
		}
}//add class to insert nodes and keep the list sorted
//SortedCandleList method