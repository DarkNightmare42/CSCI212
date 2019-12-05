/**
 * Description: CandleNode class
 * 				Base CandleNode class
 * @param: CandleNode
 * @author errol
 *
 */

//CandleNode
public class CandleNode {
	protected Candle data;
	protected CandleNode next;
	
	public CandleNode(Candle input) {
		data = input;
		next = null;
	}//end of constructor
}//end of class