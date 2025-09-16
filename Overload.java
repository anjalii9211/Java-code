package anjalicode;

class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}

public class Overload {
	public static void main(String[] args) {
		Calculator sum=new Calculator();
		System.out.println(sum.add(5,15));
		System.out.println(sum.add(2.3,4.5));
	}

}
