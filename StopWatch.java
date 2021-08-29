package com.bridgelabz;
import java.util.Scanner;
public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Press ' 1 ' to Start :");
		long startTime = System.currentTimeMillis();
		sc.nextFloat();

		System.out.print("Press ' 2 ' to Stop :");
		sc.nextFloat();
                sc.close();


		long finishTime = System.currentTimeMillis();

		long timeElapsed = (finishTime - startTime) / 1000;
		System.out.print("Time between two was in second: " + timeElapsed);
	}

}
