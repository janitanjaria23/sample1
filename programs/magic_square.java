import java.util.*;
class magic_square
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=0;
		do
		{
		System.out.print("Ennet the no. of rows: ");
		N=sc.nextInt();
        }while(N%2==0);
		int[][] magic = new int[N][N];
	        int row = N-1;
        	int col = N/2;
        	magic[row][col] = 1;

	        for (int i = 2; i <= N*N; i++) 
		{
        	    if (magic[(row + 1) % N][(col + 1) % N] == 0) 
		    {
                	row = (row + 1) % N;
             	col = (col + 1) % N;
	            }
        	    else 
		    {
        	        row = (row - 1 + N) % N;
        	        // don't change col
        	    }
       	 	   magic[row][col] = i;
      	 	 }
	
	        // print results
        	for (int i = 0; i <N; i++) 
		{
           		 for (int j = 0; j <N; j++) 
		         {
         	      		 if (magic[i][j] < 10)  System.out.print(" ");  // for alignment
               			 if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                			System.out.print(magic[i][j] + " ");
            		}
                System.out.println();System.out.println();System.out.println();
        	}

    }
}


