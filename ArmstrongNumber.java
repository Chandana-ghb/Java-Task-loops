package com.whileloop;

public class ArmstrongNumber {

	public int factorial(int num) {
		
		if(num<=0)
			System.out.println("invalid");
		int temp=num;
		int sum=0;
		while(num>0) {
			int rev=num%10;
			sum+=rev*rev*rev;
			num/=10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Armstrong number");
		}
		else {
			System.out.println(temp+" is not an  Amstrong Number");
		}
	return sum;
	}
	public static void main(String[] args) {
		ArmstrongNumber armstrong=new ArmstrongNumber();
		armstrong.factorial(153);
	}
}
