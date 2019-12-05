/**
 * @description: Project3
 * 				 GUI based program that reads input from a file, tokenizes
 * 				 and displays in a textarea panel on a gridlayout pane
 * @description: Candle Class, contains get, set methods for the candle class, 
 * 				 inclusive of the general candle constructor 
 * 				 Candle Class when instantiated creates a candle and fills necessary data
 * 				 sets its height, width, price from input data and lit status 
 * 				 as false unless set to true by the setStatus method
 * 				 set and get methods perform each task accordingly as called/needed
 * 
 * @param: boolean
 * @param: float
 * @param: toString
 * @param: int
 * @returns: candles/candle data
 * @see: CandleGUI output
 * 
 * @author errol
 * @section: 11E
 */
public class Candle {
	
	Candle(){
	}

	private int candleHeight, candleWidth;
	private float candlePrice;
	private boolean candleLit;
	//instance variables
	
	Candle(int candleHeight, int candleWidth, float candlePrice) {
		this.candleHeight = candleHeight;
		this.candleWidth = candleWidth;
		this.candlePrice = candlePrice;
		this.candleLit = false;
	}//inputData method for filling all parts of the class
	
	public void setHeight(int candleHeight) {
		this.candleHeight = candleHeight;
	}//setHeight method
	
	public void setWidth(int candleWidth) {
		this.candleWidth = candleWidth;
	}//setWidth method
	
	public void setPrice(float candlePrice) {
		this.candlePrice = candlePrice;
	}//setPrice method
	
	public void setStatus(boolean candleLit) {
		this.candleLit = candleLit;
	}//setStatus method
	
	public boolean getLitStatus() {
		return candleLit;
	}//getStatus method
	
	public int getHeight() {
		return candleHeight;
	}//getHeight method
	
	public int getWidth() {
		return candleWidth;
	}//getWidth method
	
	public float getPrice() {
		return candlePrice;
	}//getPrice method
	
	public String toString() {
		return (candleHeight + "," + candleWidth + "," + candlePrice);
	}//custom toString method
}//Candle Class
