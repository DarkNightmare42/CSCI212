
public class Lab7 {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		int[][] testArray;
		
		testArray = fillArray(args[0]);
		
		for(int i = 0; i < testArray.length; i++) {
			for(int j = 0; j < testArray.length; j++)
				display(testArray[i][j]);
			System.out.println();
		}
		
	}
	
	private static void display (int num){
		if(num > 10)System.out.print(num+" ");
		else System.out.print(num+"  ");
	}
	
	
	public static int[][] fillArray(String myFile){
		TextFileInput tfi = new TextFileInput(myFile);
		int row = Integer.parseInt(tfi.readLine());
		int col = Integer.parseInt(tfi.readLine());
		int[][] fillArray = new int[row][col];


		
		for(int i  = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				fillArray[i][j] = Integer.parseInt(tfi.readLine());	
			}
		}
		
		return fillArray;
	}
	
}