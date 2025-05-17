package com.whileloop;

public class NeonNumber {
	
	public boolean isNeon(int num) {
		if(num<=1)
			return false;
		int temp=num;
		int result=num*num;
		int sum=0;
		int a;
		while(result!=0) {
			a=result%10;
			sum=sum+a;
			result=result/10;
		}
		
		if(sum==temp) {
			System.out.println(num+" is a Neon Number");
		}
		else
		{
			System.out.println(num+" is not a Neon Number");
		}
		return true;
	}
	public static void main(String[] args) {
		NeonNumber neon=new NeonNumber();
		neon.isNeon(9);
	}
}
