package com.gqt.corejava.patterns;
 import java.util.Scanner;

	public class patternpro16 {
		public static void main (String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the count");
			int n = sc.nextInt();
			 int count =1;
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print(count+ " ");
				count ++;
				}
				System .out.println();
				
			}
			
		}

	}



