abstract class Shape { // 추상 클래스 선언
	String name; // 일반 변수 선언 가능
	int size;
	public Shape() {} // 기본 생성자 가능
	public Shape(String name) {} // 매개변수 생성자 가능
	public Shape(int size) {
		this.size = size; // 생성자에 내용  채우기 가능
	}
	abstract public void draw(); // 추상 메소드 가능
	//abstract public void draw2() {} // 내용이 있는 추상 메소드 X
	
	public void paint() { // 일반 메소드 선언 가능
		draw(); // 일반 메소드에 내용 O
	}
}
// 추상 클래스의 비어있는 드로우를 반드시 채워야 함
class Line extends Shape {//The type Line must implement the inherited abstract method Shape.draw()
	public void draw() { // abstract빼고 그대로
		System.out.println("Line");
	}
}
abstract class ShapeA extends Shape {//추상을 상속받은 추상클래스
	abstract public void draw2(); // 요것도 구현해야 함
}

class Line2A extends ShapeA {
	public void draw() {
		System.out.println("Line2");
	}
	public void draw2() {
		System.out.println("Line2A");
	}
}


/* -> 일반 클래스는 추상 메소드를 가질 수 없다. 일반클래스는 클래스틀이 아니잖아
class Shape2 { //The type Shape2 must be an abstract class to define abstract methods
	abstract public void f();
	//The abstract method f in type Shape2 can only be defined by an abstract class
} */


public class ShapeApp {
	public static void main(String[] args) {
		Shape s; // 선언은 가능
		//s = new Shape; 생성은 불가능

	}

}
