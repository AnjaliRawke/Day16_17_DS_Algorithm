package com.bridgelabz;

import java.util.Scanner;

public class RegEx {
	static String str ="Hello <<name>>,\nWe have your full name as <<full name>> in our system. \nyour contact number is 91-xxxxxxxxxx.\nPlease,let us know in case of any clarification \nThank you BridgeLabz day/month/2016.";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your name:");
		String name = sc.next();
		System.out.println();
		System.out.print("Enter your full name:");
		String fullname = sc.next();
		System.out.println();
		System.out.print("Enter contact number:");
		String phno = sc.next();
		System.out.println();
		System.out.print("Enter Date:");
		String date = sc.next();
		System.out.println();
		System.out.print("Enter month");
		String month= sc.next();
		System.out.println();
		System.out.print("Enter year");
		String year = sc.next();
		System.out.println();
		str=str.replaceAll(("<<name>>"),name);
		str=str.replaceAll(("<<full name>>"),fullname);
		str=str.replaceAll(("91-xxxxxxxxxx"),phno);
		str=str.replaceAll(("day"),date);
		str=str.replaceAll(("month"),month);
		System.out.println(str.replaceAll(("2016"),year));
	}
}
