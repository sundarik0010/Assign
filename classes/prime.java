package com.tute.classes;

public class prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		      int a=13 ; 
		    		int count=0;
		      
		      
		      for(int i=2; i<a; i++)
		      {
		         if(a%i == 0)
		         {
		            count++;
		            
		            
		            
		         }
		      }
		      
		      if(count==0)
		         System.out.println("\nIt is a Prime Number.");
		      else
		         System.out.println("\nIt is not a Prime Number.");
		   }
		}