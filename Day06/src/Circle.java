
public class Circle {
	public int radius;
	public String name;
	
	public Circle() {  //클래스 이름과 동일해야함
		radius = 2; //생성과 동시에 radius는 2가 됨, 지정 안하면 0
		System.out.println("Circle 생성됨!");
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // Circle 이라는 틀을 이용해서 피자라는 객체를 선언
		pizza = new Circle();
		
		Circle pizza2 = new Circle(); // 선언과 생성 동시에
		
		pizza.radius = 10;
		pizza.name = "치즈피자";
		
		double area = pizza.getArea();
		System.out.println(area);   //radius 10
		
		double area2 = pizza2.getArea();
		System.out.println(area2);  //radius 2
	}
}
