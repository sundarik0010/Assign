package com.tute.classes;

public class Conditionalstatement {

	public static void main(String[] args) {
		int a=-88;
		if(a>0) {
			System.out.println(a+ "the number is positive");
	

		}
		else if(a<0){
			System.out.println(a+ " the given number is negative");
			int b=a*-1;
			System.out.println(b+ " is converted into a positive number");
		}
		else {
			System.out.println(a+ " the given number is either positive nor negative");
		}

	}
}
