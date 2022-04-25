package com.bridgelabz.day5_assignment;
import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the value of n1, n2 & n3 : ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		int num3 = reader.nextInt();

		if(num1>num2 && num1>num3) 
		{
			System.out.println(num1 + " " + "Num1 is the Largest ");	
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println(num2 + " " + "Num2 is the Largest");
		}
		else
		{
			System.out.println(num3 + " " + "Num3 is the Largest");
		}
	}

}
