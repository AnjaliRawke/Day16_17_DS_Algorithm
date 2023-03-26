package com.bridgelabz;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :-");
		int h = sc.nextInt();
		int low =0;
		int high= (int)Math.pow(2,h);
		System.out.printf("Think of a number between 0 and %d: ", high - 1);
		int secretNumber = sc.nextInt();
		boolean flag = false;
		while(!flag){
			int guess = ((low +high)/2);
			System.out.println("is your number is less than or equal to "+guess+"(Y/N)");
			String user_response = sc.next();
			if(user_response=="y"){
				high=(guess+1);
			}
			else {
				low=(guess-1);
			}
			if(low==high)
			{
				System.out.println("your magic number is "+low);
			}
		}
	}
}
