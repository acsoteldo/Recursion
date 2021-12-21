//Andrea Soteldo
package college;

import java.util.Scanner;

public class Recursion { 
	public static void main(String args[])
	{
		String[][]table = new String[100][100];
		/* How to use array table in program?
		 * Instead of line 15, 
		 *		Is it possible to use nested for loop, and declare char elements inside string array?
		 *		Or, how to fill string array with the alphabet?
		*/
		String[][] data = {{"a","b", "c"},{"d","e","f"},{"g","h","i"}};
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please enter row number: ");
	 	int row = keyboard.nextInt();  
	    System.out.println("Please enter column number: ");
	 	int column = keyboard.nextInt();   
	 	keyboard.close();
		System.out.println("Combination for " + row + " row(s)");
		System.out.println("and " + column + " column(s)");
		String newsize[]=new String[row];
		printArray(data,row,column,0,newsize);
	}
	static void printArray(String[][] data,int row,int column,int i,String[] newsize)
	{
		if(i<row)
		{
			for(int j=0;j<column;j++)
			{
				newsize[i]=data[i][j];
				printArray(data,row,column,i+1,newsize);
				}
			}
		else
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(newsize[j]+" ");
				}
			System.out.println("");
			}
		}
}