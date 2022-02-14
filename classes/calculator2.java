package com.tute.classes;

public class calculator2 {
	public void addTwoNumber(int a,int b){
		
		int c=a+b;
		System.out.println(c);
		
	}
	
public void subTwoNumber(int d,int e){
		
		int f=d-e;
		System.out.println(f);
		
	}
	public static void main(String[] args) {
		calculator2 val=new calculator2();
		val.addTwoNumber(10,10);
		val.addTwoNumber(20,30);
		val.addTwoNumber(30,40);
		val.addTwoNumber(50,60);

	 val.subTwoNumber(100,5);

}
	
}
