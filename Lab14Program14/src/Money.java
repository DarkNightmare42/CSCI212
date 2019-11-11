
public class Money implements Comparable<Money> {
	
	private int dollars, cents;
	
	/**
	 * Constructor makes a call to {@link #Money(int, int)} 
	 * with (0,0) as parameters
	 */
	public Money() {
		this(0,0);
	}
	
	public Money(int dollars, int cents) {
		if(cents > 99) {
			this.dollars = dollars + (cents / 100);
			this.cents = cents % 100;
		}
		else {
			this.dollars = dollars;
			this.cents = cents;
		}
	}	
	
	
	public void add(Money other) {
		int cent = cents + other.cents;
		if(cent > 100) {
			dollars += other.dollars + (cent / 100);
			cents = cent % 100;
		}
		
		else {
			dollars += other.dollars;
			cents += other.cents;
		}
	}

	@Override
	public int compareTo(Money other) {
		if(dollars == other.dollars && cents == other.cents)
			return 0;
		if(dollars > other.dollars) return 1;
		
		else return -1;	
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if(other!=null && this.getClass().equals(other.getClass())) {
			if(((Money)other).dollars == dollars && ((Money)other).cents == cents)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(cents < 10) return "$" + dollars + ".0" + cents;
		else return "$" + dollars + "." + cents;
	}
	
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}
