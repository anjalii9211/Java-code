package com.java.testInher;

public class Parent {
	public void add(int a) {
		System.out.println(a+a);
	}
	

}
class child extends Parent
{
	public void add (int a) {
		System.out.println(a*a);
	}
}

public class TestIn{
	public static void main(String[] args) {
		Parent child=new Parent();
		child.add(12);
	}
}

