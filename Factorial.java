package com.whileloop;

public class Factorial {
	public int productOfNumber(int num) {
		
		if(num<=0)
			return -1;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial fav=new Factorial();

		System.out.println("Factorial is "+fav.productOfNumber(7));
		
	}
}
