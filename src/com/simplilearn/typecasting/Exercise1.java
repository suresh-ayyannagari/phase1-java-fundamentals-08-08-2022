package com.simplilearn.typecasting;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a integer:");
		int number=input.nextInt();
		float floatnum=number;
		double doublenum=floatnum;
		long longnum=number;

		System.out.println("integer:"+number);
		System.out.println("float:"+floatnum);
		System.out.println("double:"+doublenum);
		System.out.println("long:"+longnum);
	

		
		// TODO :: WAP for data converting from int, byte, short  -> float , double & long.

	}
}
