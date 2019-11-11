
public class Lab14Program1 {
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
		Money m = new Money(5,243);
	    System.out.println(m.toString());
		
		// LAB 15
		m1 = new Money(4,87);
		m2 = new Money(5,243);
		
		m1.add(m2);
		
		System.out.println(m1.toString());
		
	}

}
