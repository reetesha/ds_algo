package com.g4g;

public class recurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recurrsion r = new recurrsion();
		r.print1ToN(5);
		System.out.println();
		r.printNTo1(5);
		System.out.println();
		System.out.print(r.sumOfDigit(123));

	}

	public static void print1ToN(int n) {
		if(n==1) {
		System.out.print(n);
		return;
		}
		
		print1ToN(n-1);
		System.out.print(n);
	}
	
	public static void printNTo1(int n) {
		if(n==1) {
		 System.out.print(n);
		return;
		}
		System.out.print(n);

		printNTo1(n-1);
		System.out.print(n);
	}
	
	public static int sumOfDigit(int n) {
		if(n==0) {
		 System.out.print(n);
		return 0;
		}
		return n%10 + sumOfDigit(n/10);
		
	}
}
