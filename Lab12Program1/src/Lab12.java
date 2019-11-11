import javax.swing.*;
import java.awt.*;
public class Lab12{
   
   static TextFileInput inFile;
   static String inFileName = "input.txt";
   static JFrame myFrame;
   static Container cPane;
   static TextArea even, odd;
   
   public static void main(String[] args) {
      initialize();
      readNumbersFromFile(inFileName);
      
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      even = new TextArea();
      even.setEditable(false);
      odd = new TextArea();
      odd.setEditable(false);
      myFrame=new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  myFrame.setLayout(new GridLayout(1,2));
	  myFrame.add(odd);
	  myFrame.add(even);
      myFrame.setVisible(true);
   }
   public static void readNumbersFromFile(String fileName){
      String line;
      line = inFile.readLine();
      while (line != null) {
          if(Integer.parseInt(line) % 2 == 0) even.append(line + "\n");
          else odd.append(line + "\n");
          line = inFile.readLine();          
       } //while      
   } //readSSNsFromFile
   
      
   
   
   
} //SSN

