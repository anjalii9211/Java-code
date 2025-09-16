package anjalicode;

class Animal{ 
	public void sound() {
		System.out.println("Animals make sound");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class Override {
	public static void main(String[] args) {
		Animal a1=new Dog();
		Animal a2=new Cat();
		
		a1.sound();
		a2.sound();
	}

}
