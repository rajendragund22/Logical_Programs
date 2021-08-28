package com.bridgelabz;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 sc.close();
		 int a=0, b=1,c;
		 for(int i=1; i<=num; i++) {
			 c=a+b;
			 System.out.print(c+ ", ");
			 a=b;
			 b=c;
		 }
		 
	}

}
