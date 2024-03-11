abstract class Shape { // �߻� Ŭ���� ����
	String name; // �Ϲ� ���� ���� ����
	int size;
	public Shape() {} // �⺻ ������ ����
	public Shape(String name) {} // �Ű����� ������ ����
	public Shape(int size) {
		this.size = size; // �����ڿ� ����  ä��� ����
	}
	abstract public void draw(); // �߻� �޼ҵ� ����
	//abstract public void draw2() {} // ������ �ִ� �߻� �޼ҵ� X
	
	public void paint() { // �Ϲ� �޼ҵ� ���� ����
		draw(); // �Ϲ� �޼ҵ忡 ���� O
	}
}
// �߻� Ŭ������ ����ִ� ��ο츦 �ݵ�� ä���� ��
class Line extends Shape {//The type Line must implement the inherited abstract method Shape.draw()
	public void draw() { // abstract���� �״��
		System.out.println("Line");
	}
}
abstract class ShapeA extends Shape {//�߻��� ��ӹ��� �߻�Ŭ����
	abstract public void draw2(); // ��͵� �����ؾ� ��
}

class Line2A extends ShapeA {
	public void draw() {
		System.out.println("Line2");
	}
	public void draw2() {
		System.out.println("Line2A");
	}
}


/* -> �Ϲ� Ŭ������ �߻� �޼ҵ带 ���� �� ����. �Ϲ�Ŭ������ Ŭ����Ʋ�� �ƴ��ݾ�
class Shape2 { //The type Shape2 must be an abstract class to define abstract methods
	abstract public void f();
	//The abstract method f in type Shape2 can only be defined by an abstract class
} */


public class ShapeApp {
	public static void main(String[] args) {
		Shape s; // ������ ����
		//s = new Shape; ������ �Ұ���

	}

}
