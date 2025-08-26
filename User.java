package one;

public class User {

	public static void main(String[] args) {
		System.out.println("MAIN BLOCK");
		User obj=new User();
		obj.add(12,12);
		obj.sub(12,12);
		obj.multiply(10,12);
		obj.divide(12,12);
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	public void divide(int a,int b) {
		System.out.println(a/b);
	}

}
