package com.tute.classes;

public class factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inp = 7;
		int fact = 1;
		for (int i = 1; i <= inp; i++) {
			fact *= i;
			
		}
		System.out.println(fact);
	}

}

