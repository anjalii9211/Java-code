package experiments;

//Write a program in java to demonstrate multi-level inheritance in java.

class Animal {
	void eat() {
		System.out.println("Animals eat food");
	}
}	
class Mammal extends Animal {
	void walk() {
		System.out.println("Mammals can walk");
	}
}	
class Dog extends Mammal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class Code8 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.walk();
		d.bark();
	}

}
