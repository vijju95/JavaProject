package Abstraction;

interface insertDetails {

	public static final String password = "AAA";

	void show();

	default void calling() {
		System.out.println(password);
	}
}

class Student implements insertDetails {

	int id;
	String name;
	char grade;

	Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	void insert() {
		System.out.println(id + " " + name + " " + grade);
		System.out.println(password);
	}

	public void show() {
		System.out.println("Integrated approch book is too good >>.....");
	}
}

public class Interface_first {
	public static void main(String[] args) {
		Student i = new Student(1, "pooja", 'A');
		i.insert();
		i.show();
		i.calling();

	}
}
/*
 * interface Shape {
 * 
 * void draw(); double area(); } class Rectangle implements Shape { int length,
 * width;
 * 
 * Rectangle(int length, int width) { this.length = length; this.width = width;
 * } public void draw() { System.out.println("Rectangle has been drawn "); }
 * public double area() { return (length * width); } } class Circle implements
 * Shape { double p = 3.14; int radius;
 * 
 * Circle(int radius) { this.radius = radius; } public void draw() {
 * System.out.println("Circle has been drawn "); } public double area() { return
 * (double)((p * radius * radius)); } } public class Interface_first {
 * 
 * public static void main(String[] args) { Shape r = new Rectangle(2, 3);
 * System.out.println("Area of rectangle: "+ r.area());
 * 
 * Shape c = new Circle(2); System.out.println("Area of circle: "+ c.area()); }
 * }
 */
