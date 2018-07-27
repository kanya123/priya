/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int yr;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a year:");
		yr=s.nextInt();
		if(yr%4==0)
		{
			
			System.out.println("given year is leap");
		}
		else 
		{
			System.out.println("given year is not leap");
		}
		// your code goes here
	}
}
