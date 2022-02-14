package com.tute.classes;

public class calculator {
	public void addTwoNumbers() {
		int a=1;
		int b=2;
		int c=a+b;
		 System.out.println(c);
		
		
			
	}
	public void subTwoNumbers() {
		int a=8;
		int b=4;
		int d=a-b;
		 System.out.println(d);
	}
	public void multiplyTwoNumbers() {
		int a=2;
		int b=5;
		int e=a*b;
		 System.out.println(e);
	}
	public void divideTwoNumbers() {
		int a=2;
		int b=20;
		int f=a/b;
		 System.out.println(f);
	}
	
	public static void main(String[]args) {
		calculator calc=new calculator();
		calc.addTwoNumbers();
		calc.subTwoNumbers();
		calc.multiplyTwoNumbers();
		calc.divideTwoNumbers();
		
	}

}
