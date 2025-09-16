package experiments;

//Write a program in java to demonstrate method overloading

public class Code7 {
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public int add(int a, int b, int c,int d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		Code7 obj=new Code7();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(2,4,5,7));
		System.out.println(obj.add(30.2,40.6));
	}

}
