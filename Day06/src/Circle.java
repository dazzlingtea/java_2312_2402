
public class Circle {
	public int radius;
	public String name;
	
	public Circle() {  //Ŭ���� �̸��� �����ؾ���
		radius = 2; //������ ���ÿ� radius�� 2�� ��, ���� ���ϸ� 0
		System.out.println("Circle ������!");
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // Circle �̶�� Ʋ�� �̿��ؼ� ���ڶ�� ��ü�� ����
		pizza = new Circle();
		
		Circle pizza2 = new Circle(); // ����� ���� ���ÿ�
		
		pizza.radius = 10;
		pizza.name = "ġ������";
		
		double area = pizza.getArea();
		System.out.println(area);   //radius 10
		
		double area2 = pizza2.getArea();
		System.out.println(area2);  //radius 2
	}
}
