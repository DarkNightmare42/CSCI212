public class Monies {

	private int dollars, cents;
	
	public Monies() {
		dollars = 0;
		cents = 0;
	}
	
	public Monies(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	
	public void setCents(int cents) {
		this.cents = cents;
	}
	
	public int getDollars() {
		return dollars;
	}
	
	public int getCents() {
		return cents;
	}
	
	public boolean equals(Monies m2) {
		if(this.dollars == m2.dollars && this.cents == m2.cents)
			return true;
		else return false;
	}
	
	public String compareTo(Monies m2) {
		Monies comparison = new Monies();
		String setSign = "";
		comparison.dollars = Math.abs(this.dollars - m2.dollars);
		comparison.cents = Math.abs(this.cents - m2.cents);
		if((this.dollars - m2.dollars) < 0) setSign = "-";
		
		return setSign + comparison.toString();
	}
	
	public String toString() {
		if(cents < 10) return "$" + dollars + ".0" + cents;
		else return "$" + dollars + "." + cents;
	}
	
	
}
