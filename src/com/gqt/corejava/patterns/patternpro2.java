package com.gqt.corejava.patterns;
import java.util.Scanner;

public class patternpro2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size");
		int n= sc.nextInt();
		for( int i=1;i<=n;i++) {
		System.out.print("*\n");
		}
	}

}
