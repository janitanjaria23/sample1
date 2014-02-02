import java.io.*;
import java.util.Arrays;
public class MagicSquares {

	
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader in=new BufferedReader (isr);
		
		System.out.println("Magic Squares assignment\n");
		
		int[][]square=getASquare();
		
		
		printSquare(square);
		System.out.println("\nIs normal=  "+isNormal(square));
		
		
		int c = getMagicConstant(square);
		
		//CORRECTION FTA
		/*
		System.out.println("Rows=  "+CheckRows(square,c));
		System.out.println("Columns=  "+CheckColumns(square,c));
		System.out.println("Diagonals=  "+CheckDiagonals(square,c));
		*/
		// write them again as methods, not ass classnames...
		System.out.println("Rows=  "+checkRows(square));
		System.out.println("Columns=  "+checkColumns(square));
		System.out.println("Diagonals=  "+checkDiagonals(square));
		System.out.println("Magic constant=" + getMagicConstant(square));
		System.out.println("Is assiociative: " + isAssociative(square));
		

	}
	
	/**
	 * Change the return value of this method to pass a magic square, associative magic square, etc
	 * 
	 * @return a square
	 * @throws IOException
	 */
	static int[][] getASquare()throws IOException{
		
		// MAGIC SQUARE but not Associative Magic Square
		// figure 1 of assignment
		int[][] square1 = {{9,6,3,16}, {4,15,10,5}, {14,1,8,11}, {7,12,13,2}};
		
		//Associative Magic Square => order even
		// figure 4 of assignment
		int[][] square4 = {{2,13,11,8},{16,3,5,10},{7,12,14,1},{9,6,4,15}};
		
		//Magic Square => order odd
		// figure 5 of assignment
		int[][] square5 = {{3,7,14,16,25},{11,20,23,2,9},{22,4,6,15,18},{10,13,17,24,1},{19,21,5,8,12}};
		
		//Associative Magic Square => order odd
		// figure 8 of assignment
		int[][] square8 = {{1,15,24,8,17},{23,7,16,5,14},{20,4,13,22,6},{12,21,10,19,3},{9,18,2,11,25}};
		
		return square8;
	}
	
	/*
	 * Check if all the numbers in the matrix correspond to the form 1 ... n²
	 * */
	static boolean isNormal(int[][] veld){
		int n=veld.length;
		boolean normal=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(veld[i][j]>Math.pow(n,2)){
					normal=false;}
			}
		}
		return normal;
	}
	
	/*
	 * Get the magic constant of a square
	 * */
	static int getMagicConstant(int[][]square){
		
		int sum=0;
		for(int i=0;i<square.length;i++){
			sum+=square[0][i];
		}
		return sum;
	}
	
	/*
	 * Check if all rows add up to the same magical constant
	 * */
	static boolean checkRows(int[][] veld) {
		boolean returnvalue = true;
		for (int rowNumber = 0; rowNumber < veld.length; rowNumber++) {
			int som = 0;
			for (int colNumber = 0; colNumber < veld.length; colNumber++) {
				som += veld[rowNumber][colNumber];
			}
			//System.out.println("Sum of row " + rowNumber + " is: " + som);
			if (som != getMagicConstant(veld))
			{
				System.out.println("Row " + rowNumber + " with values: " + Arrays.toString(veld[rowNumber]) + " adds up to " + som + " instead of " + getMagicConstant(veld));
				returnvalue = false;
			}

		}
		return returnvalue;
	}
	/*
	 * Check if all columns add up to the same magical constant
	 * */
	static boolean checkColumns(int[][]veld){
		boolean returnvalue = true;
		for(int colNumber=0;colNumber<veld.length;colNumber++){
			int som=0;
			for(int rowNumber=0;rowNumber<veld.length;rowNumber++){
				som+=veld[rowNumber][colNumber];
			}
			//System.out.println("Sum of column " + colNumber + " is: " + som);
			if(som!=getMagicConstant(veld))
			{
				System.out.println("Column " + colNumber + " with values: " + Arrays.toString(veld[colNumber]) + " adds up to " + som + " instead of " + getMagicConstant(veld));
				returnvalue = false;
			}
		}
		return returnvalue;
	}
		
	static int getOrder(int[][] veld)
	{
		
		return veld.length;
	}
	
	static boolean isAssociative(int[][] veld)
	{
		int check = getAssciativeChecksum(veld);
		System.out.println("Checksum: " + check);
		return checkPairs(veld);
		
	}
	static int getAssciativeChecksum(int[][] veld)
	{
		return ((int)Math.pow(getOrder(veld), 2)) + 1;
	}
	
	/*
	 * Check if all pairs symmetrically opposite to the center sum up to n² + 1.
	 * */
	static boolean checkPairs(int[][] veld)
	{
		// use recursion to walk through array
		return (checkPairs_helper(0, 0, veld));
	}
	/*
	 * Use of recursion to search the two dimensional array
	 * 
	 * checkPairs_helper checks for a given cell and its opposite cell if the sum is equal to the checksum
	 * 
	 * if checkPairs_helper determines that it is 'true' it calls itselfs 
	 * for the cell below to the current cell 
	 * AND 
	 * for the cell on the right of the current cell
	 * 
	 * */
	static boolean checkPairs_helper(int row, int col, int[][]veld)
	{
		if(row == getOrder(veld) || col == getOrder(veld) )
		{
			return true;
		}else
		{
			int rowindex = getOrder(veld)-1-row;
			int colindex = getOrder(veld)-1-col;
			//System.out.println("Checking couple: " + rowindex + " " +  colindex); 
			
			if(veld[row][col] + veld[rowindex][colindex] == getAssciativeChecksum(veld) )
			{
				if(row + 1 == getOrder(veld) || col + 1 == getOrder(veld))
					return true;
				else
					return checkPairs_helper(row+1, col, veld) && checkPairs_helper(row, col+1, veld);
			}else
			{
				System.out.println("Sum of values: " + veld[row][col] + " + " + veld[rowindex][colindex] + " is not equal to " + getAssciativeChecksum(veld));
				return false;
			}
		}
	}
	
	/*
	 * Check if the diagonals add up to the same magical constant
	 * */
	static boolean checkDiagonals(int[][] veld) {
		int sumD_leftToRight = 0;
		int sumD_rightToLeft = 0;
		for (int rowNumber = 0; rowNumber < veld.length; rowNumber++) {
			sumD_leftToRight += veld[rowNumber][rowNumber];
			sumD_rightToLeft += veld[rowNumber][veld.length - 1 - rowNumber];
		}

		if (sumD_leftToRight == getMagicConstant(veld) && sumD_rightToLeft == getMagicConstant(veld))
			return true;
		else
			return false;
	}
	
	/*
	 * This method prints a given square to the standard output
	 * */
	static void printSquare(int [][]square){
		
		for(int row=0;row<square.length;row++){
			System.out.print("\n\t| ");
			for(int col=0;col<square.length;col++){
				System.out.print(square[row][col]+"\t|  ");
				}
		}
	}

}
