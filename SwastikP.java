// Java implementation to
// print swastika pattern

import java.util.Scanner;
class Swastik
{
	// function to print swastika
	public void swastika(int row, int col,String p)
	{
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
			{
				// checking if i < row/2
				if (i < row / 2)
				{
					
					// checking if j<col/2
					if (j < col / 2)
					{
						
						// print '*' if j=0
						if (j == 0)
							System.out.print(p);
							
						// else print space
						else
							System.out.print(" "+ " ");
					}
					
					// check if j=col/2
					else if (j == col / 2)
					System.out.print(p);
					
					else
					{
						// if i=0 then first row
						// will have '*'
						if (i == 0)
							System.out.print(p);
					}
				}
				else if (i == row / 2)
					System.out.print(p);
				else
				{
					
					// middle column and last column
					// will have '*' after i > row/2
					if (j == col / 2 || j == col - 1)
					System.out.print(p);
					
					// last row
					else if (i == row - 1)
					{
						
						// last row will be have '*' if
						// j <= col/2 or if it is last column
						if (j <= col / 2 || j == col - 1)
							System.out.print(p);
						else
							System.out.print(" "+ " ");
					}
					else
					System.out.print(" "+" ");
				}
			}
			System.out.print("\n");
		}
	}
	
	// Driver code
	public static void main (java.lang.String[] args)
	{
		// odd number of row and column
		// to get perfect swastika
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value : ");
        int row = sc.nextInt();
        System.out.println("Enter the column value : ");
		int col = sc.nextInt();
        System.out.println("What do you want to print : ");
        java.lang.String p = sc.next();
		// function calling
		swastika(row, col, p);
	}
}