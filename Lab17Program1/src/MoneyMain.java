
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","P","P","P","P","N","N","N","D","D","D"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else if (dataItem == 'Q')
        	 wallet[i]=new Quarter();
         else if (dataItem == 'P') 
        	 wallet[i] = new Penny();
         else if (dataItem == 'N')
        	 wallet[i] = new Nickel();
         else if (dataItem == 'D')
        	 wallet[i] = new Dime();
         
      }
         
      printWallet();
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
         if (wallet[i] instanceof Bill)
            System.out.println(wallet[i]);
         else
            System.out.println(wallet[i]);         
      }
      System.out.println("Sum within the wallet is: $" + sumWallet());
   }
   
   private static float sumWallet() {
	   float sum = 0.00f;
	   for(int i = 0; i < dataSource.length; i++) {
		  if(wallet[i] instanceof Bill)
			  sum += (float)(((Bill) wallet[i]).getValue());
		  else { sum += ((((Coin) wallet[i]).getValue()) / 100f);
		  }
	   }
	  return sum;
   }
}
