import java.util.Scanner;
class Shape {
	Shape next; //나 안에서 나를 가리키면 다음에 만들 객체를 가리킨다
	
	void draw() {
		System.out.println("shape");
	}
 }

class Line extends Shape {
	void draw() {   //이 메서드가 없으면 전부 "Shape"만 나옴
		System.out.println("Line");
	}
}

class Rect extends Shape {
	//int draw() { //draw override하니까 int->void거나 원형을 바꿔라
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
		l1.draw(); // 오버라이딩
		
		Shape s2 = new Line(); //업캐스팅
		s2.draw(); // 동적 바인딩 + 오버라이딩
				
		paint(s1); 
		paint(l1); //업캐스팅 돼서 Line
		paint(new Shape());
		paint(new Line()); //업캐스팅이라 원래 성분인 Line이 나온다
		
		System.out.println("===============");
		Shape start = new Shape(); // 초기화
		Shape last = new Shape();
		Shape obj = new Shape();
		
		System.out.println("입력할 노드의 개수를 ");
		int nodes = sc.nextInt();
		sc.nextLine(); // 숫자 입력 후 버퍼 비워주기
		
		for(int i=1; i<=nodes ; i++) {
			System.out.print("도형을 입력하세요 > ");
			String input = sc.nextLine();
			if(i == 1) { // 첫 케이스만 다르게 처리
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
		
		start = new Line(); //Line 성분을 시작점으로 
		last = start; //last는 옮겨갈 커서
		obj = new Rect();
		last.next = obj; //last의 next는 obj고 obj는 Rect 출신, last.next에 연결
		last = obj;
		
		obj = new Tri();
		last.next = obj;
		last = obj;   // Tri.next=null (공집합)
		
		Shape cursor = start;
		while(cursor != null) {
			cursor.draw();
			cursor = cursor.next; //커서 이동
		}
		/*
		cursor.draw();
		cursor = cursor.next; //커서 이동
		cursor.draw();
		cursor = cursor.next; //커서 이동
		cursor.draw();
		cursor = cursor.next; //커서 이동
		cursor.draw();
		cursor = cursor.next; //커서 이동
		cursor.draw();  //null이니까 nullpointerexception
		*/
	}

}
