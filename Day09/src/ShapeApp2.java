//class Shape2 {  
//	public void draw( ) {
//		System.out.println("Shape");
//	}
//} �������̵��� ���� �뵵�ϱ� ���� Ʋ�� ä�� �ʿ䰡 ���� ->�߻�ȭ

abstract class Shape2 {
	abstract public void draw();
	
}

class Line2 extends Shape2 {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect2 extends Shape2 {
	public void draw() {
		System.out.println("Rect");
	}
}


public class ShapeApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
