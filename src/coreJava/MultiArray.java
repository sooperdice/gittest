package coreJava;


public class MultiArray {
	
	public static void main (String[] args) {
		
		// a[row] [column]
		int a[][]= new int[2][3];;
		
		a[0][0] =2;
		a[0][1] =4;
		a[0][2] =5;
		a[1][0] =3;
		a[1][1] =4;
		a[1][2] =7;
		//System.out.println(a[1][0]);

		
		
		
		// How to print all values in 3d array

		int b[][] = {{2,4,5},{3,4,7}, {5,2,1}};   // compact way of creating array
		
		for (int row=0;row<b.length;row++)
		{	
			for (int col=0;col<b[row].length; col++)
			{
				System.out.print(b[row][col]);
			}
			System.out.println("");
		}
		
		//How to print minimum value
		int c[][] = {{2,4,5},{3,4,7}, {5,2,1}};   // compact way of creating array

		int min = c[0][0];			//assume min is first value of array i.e 2
		int minRow = 0;
		for (int row=0;row<c.length;row++)
		{	
			for (int col=0;col<c[row].length; col++)
			{
				if (c[row][col] < min)
				{
					min = c[row][col];
					minRow = row;
				}			
			
			}
			//System.out.println("the min row");
		}
		System.out.println("The min value is " + min);
		System.out.println("The min row index is " + minRow);

		
		
		int max = c[0][0];			//assume min is first value of array i.e 2
		int maxColumn = 0;
		for (int row=0;row<c.length;row++)
		{	
			for (int col=0;col<c[row].length; col++)
			{
				if (c[row][col] > max)
				{
					max = c[row][col];
					maxColumn = col;
				}			
			
			}
			//System.out.println("the min row");
		}
		System.out.println("The max value is " + max);
		System.out.println("The max column index is " + maxColumn);

		
		
		//To print the smallest number in the column of the largest number
		int minInMax = c[0][maxColumn];
		//int min = 0;
		for (int d=0;d<c.length; d++)
		{
			if (c[d][maxColumn] < minInMax)
			{
				minInMax = c[d][maxColumn];
			}			
		
		}
		System.out.println("the min number in max column is "
				 + minInMax);
		
		
		// find the max value in min row
		int maxInMin = c[minRow][0];
		//int min = 0;
		for (int d=0;d<c.length; d++)
		{
			if (c[minRow][d] > maxInMin)
			{
				maxInMin = c[minRow][d];
			}			
		
		}
		System.out.println("the max number in min row is "
				 + maxInMin);
		
		
		
		

		/*
		 * 2 4 5
		 * 
		 * 3 4 7
		 * 
		 * 5 2 1
		 */

	}
}
