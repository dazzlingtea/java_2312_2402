
import java.util.*;

class Rectangle {
	double width, height;
	Rectangle() {
		this(0,0);
	}
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return this.width * this.height;
	}
	double getPerimeter() {
		return (this.width + this.height) * 2;
	}
}



public class RactangleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double w1, h1;
		w1 = sc.nextDouble();
		h1 = sc.nextDouble();
		
		Rectangle r1 = new Rectangle();
		r1.width = w1;  // �����ϰ� �����ϱ� private�� �� �� 
		r1.height = h1;
		System.out.printf("%.2f\n", r1.getArea()); //double�Ҽ���2�ڸ����� ����ض� ���� ����

	    Rectangle r2 = new Rectangle(w1, h1);
	    System.out.printf("%.2f\n", r2.getPerimeter());
	}

}
