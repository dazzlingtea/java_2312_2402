import java.util.Scanner;
class Shape {
	Shape next; //�� �ȿ��� ���� ����Ű�� ������ ���� ��ü�� ����Ų��
	
	void draw() {
		System.out.println("shape");
	}
 }

class Line extends Shape {
	void draw() {   //�� �޼��尡 ������ ���� "Shape"�� ����
		System.out.println("Line");
	}
}

class Rect extends Shape {
	//int draw() { //draw override�ϴϱ� int->void�ų� ������ �ٲ��
	void draw() {	
		//return 5;
		System.out.println("Rect");
	}
}
class Tri extends Shape {
	void draw() {	
		System.out.println("Tri");
	}
}

public class ShapeApp {
	static void paint(Shape p) {
		p.draw();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s1 = new Shape();
		s1.draw();
		
		Line l1 = new Line();
		l1.draw(); // �������̵�
		
		Shape s2 = new Line(); //��ĳ����
		s2.draw(); // ���� ���ε� + �������̵�
				
		paint(s1); 
		paint(l1); //��ĳ���� �ż� Line
		paint(new Shape());
		paint(new Line()); //��ĳ�����̶� ���� ������ Line�� ���´�
		
		System.out.println("===============");
		Shape start = new Shape(); // �ʱ�ȭ
		Shape last = new Shape();
		Shape obj = new Shape();
		
		System.out.println("�Է��� ����� ������ ");
		int nodes = sc.nextInt();
		sc.nextLine(); // ���� �Է� �� ���� ����ֱ�
		
		for(int i=1; i<=nodes ; i++) {
			System.out.print("������ �Է��ϼ��� > ");
			String input = sc.nextLine();
			if(i == 1) { // ù ���̽��� �ٸ��� ó��
				switch(input) {
				case "Line":
					start = new Line();
					break;
				case "Rect":
					start = new Rect();
					break;
				case "Tri":
					start = new Tri();
					break;
				}
				last = start;
			} else {
				switch(input) {
				case "Line":
					obj = new Line();
					break;
				case "Rect":
					obj = new Rect();
					break;
				case "Tri":
					obj = new Tri();
					break;
				}
				last.next = obj;
				last = obj;
			}
		}
		
		start = new Line(); //Line ������ ���������� 
		last = start; //last�� �Űܰ� Ŀ��
		obj = new Rect();
		last.next = obj; //last�� next�� obj�� obj�� Rect ���, last.next�� ����
		last = obj;
		
		obj = new Tri();
		last.next = obj;
		last = obj;   // Tri.next=null (������)
		
		Shape cursor = start;
		while(cursor != null) {
			cursor.draw();
			cursor = cursor.next; //Ŀ�� �̵�
		}
		/*
		cursor.draw();
		cursor = cursor.next; //Ŀ�� �̵�
		cursor.draw();
		cursor = cursor.next; //Ŀ�� �̵�
		cursor.draw();
		cursor = cursor.next; //Ŀ�� �̵�
		cursor.draw();
		cursor = cursor.next; //Ŀ�� �̵�
		cursor.draw();  //null�̴ϱ� nullpointerexception
		*/
	}

}
