//********************************************************************************
//	HW1Prob2__ian_nobile.java		Author: Ian Nobile
//
//	Reads a telephone number from the keyboard as a string of 10 digits and outputs
//	that same telephone number formatted as (nnn) nnn-nnnn. If the user inputs 
//	“3552468765”, the program will output “(355) 246-8765”.
//********************************************************************************

import java.util.Scanner;

public class HW1Prob2__ian_nobile
{
	//----------------------------------------------------------------------------
	//	Telephone Echo
	//----------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		
		String sUserNumber;
		Scanner scan = new Scanner(System.in);

		System.out.print("Good day to you. Please enter your ten digit telephone number: ");
		sUserNumber = scan.next();
		System.out.print("You've entered: (" + sUserNumber.substring(0, 3) + ") ");
		System.out.print(sUserNumber.substring(3, 6) + "-" + sUserNumber.substring(6) + ".");
		scan.close();
		
	} //end void

	
} //end class

