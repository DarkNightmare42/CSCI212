
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
		
		this.dollars = dollars;
		this.cents = cents;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LAB 14
		Money m1 = new Money(), m2= new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2);
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.equals(m2));
		
		// LAB 15
		m1 = new Money(4,87);
		m2 = new Money(5,243);
		
		m1.add(m2);
		
		System.out.println(m1.toString());
		
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
		else {
			return ((dollars - other.dollars) * 100 + (cents - other.cents));
		}
			
		
		
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if(other!=null && this.getClass().equals(other.getClass())) {
			Money secondVar = (Money) other;
			if(secondVar.dollars == dollars && secondVar.cents == cents)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String c;
		if(cents<10) {
			c = "0" + cents;
		} else {
			c = "" + cents;
		}
		return "$" + dollars + "." + c;
	}
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}
