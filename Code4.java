package experiments;

import java.util.Scanner;

//Write a java program that accepts three integers from the user & returns true if 2nd number is greater than 1st number and 3rd number is greater then 2nd number. If "abc" is true second number does not need to be greater than 1st number.
public class Code4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a= sc.nextInt();
		System.out.println("Enter second number:");
		int b= sc.nextInt();
		System.out.println("Enter third number:");
		int c= sc.nextInt();
		
		boolean result= (b>a)&&(c>b);
		System.out.println("Result:"+ result);
		
	}

}
