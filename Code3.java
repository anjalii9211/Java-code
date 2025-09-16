package experiments;

import java.util.Scanner;

//Write a java program to accept number and check number is even or not. Print 1 if number even, 0 if number odd.
public class Code3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		System.out.println("if number is even then 1,if it is odd then 0");
		
		if (num%2==0) {
			System.out.println(num + "->" + 1);
		} else {
			System.out.println(num + "->" + 0);
		}
		
	}
	
	

}
