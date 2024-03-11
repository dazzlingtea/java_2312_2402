//class Shape2 {  
//	public void draw( ) {
//		System.out.println("Shape");
//	}
//} 오버라이딩을 위한 용도니까 굳이 틀을 채울 필요가 없다 ->추상화

abstract class Shape2 {
	abstract public void draw();
	
}

class Line2 extends Shape2 {
	public void draw() { // 메소드 오버라이딩
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
