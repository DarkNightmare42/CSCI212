/**
 * Description: UnsortedCandleList class
 * 				appends new elements to the list
 * 
 * @param: CandleNode
 * @param: int
 * @author errol
 *
 */
public class UnsortedCandleList extends CandleList {
	public UnsortedCandleList(){
	}//default constructor
	
	public void add(Candle candle) {
		append(candle);
	}//adds a new node to the end of the list
}//UnsortedCandleList method
