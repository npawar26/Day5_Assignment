package com.bridgelabz.day5_assignment;
import java.util.Scanner;

public class FlipCoin {
	static void flipPerc(int times) {
		double heads = 0;
		for (int i = 0; i < times; i++) 
		{
			if (Math.random() > 0.5) 
			{
				heads++;
			}
		}
		System.out.println("Heads percentage is " +  (heads / times) * 100);
		System.out.println("Tails percentage is " +  (times - heads) / times * 100);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of times to flip the coin");
		int times = s.nextInt();
		flipPerc(times);
	}
}