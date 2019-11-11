
public class Lab3 {
        public static void main(String[] args){
        float fahrenheit;
        float centigrade;
        
        fahrenheit = 98.6F;
        centigrade = (fahrenheit - 32)*5/9;
    	System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+ centigrade + " degrees Centrigade.\n");
    	
    	
    	for(fahrenheit = 0; fahrenheit <= 40; fahrenheit += 5) {
        	//fahrenheit = i;
            centigrade = (fahrenheit - 32)*5/9;
        	System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+ centigrade + " degrees Centrigade.\n");

        }
        
       	System.out.println("");
     
        fahrenheit = 0.0F;
        
        while(fahrenheit <= 40) {
            centigrade = (fahrenheit - 32)*5/9;
        	System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+ centigrade + " degrees Centrigade.\n");
        	fahrenheit += 5;
        }

        }
}