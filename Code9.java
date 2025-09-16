package experiments;

/** Write a java program to create an abstract class named shape that contains two integers and an empty class
 * and an empty method named print Area(). Provide three classes named rectangle, triangle and circle such that 
 * each one of the classes extends the class shape. each one of the classes contains only the method print area()
 * that prints the area of the given shape.
 */

abstract class Shape {
	int dim1,dim2;
	abstract void printArea();
}

class Rectangle extends Shape {
	Rectangle(int a, int b) {
		dim1=a;
		dim2=b;
	}
	void printArea() {
		int area = dim1 *dim2;
		System.out.println("Area of Rectangle:" + area);
	}
}

class Triangle extends Shape {
	Triangle (int a, int b) {
		dim1=a;
		dim2=b;
	}
	void printArea() {
		double area = 0.5*dim1*dim2;
		System.out.println("Area of Triangle:"+ area);
	}
}

class Circle extends Shape {
	Circle(int r) {
		dim1=r;
	}
	void printArea() {
		double area = Math.PI *dim1*dim1;
		System.out.println("Area of circle:"+ area);
	}
}



public class Code9 {
	public static void main(String[] args) {
		Rectangle rect =new Rectangle(10,20);
		Triangle tri=new Triangle(10,15);
		Circle cir =new Circle(7);
		
		rect.printArea();
		tri.printArea();
		cir.printArea();
	}
	

}
