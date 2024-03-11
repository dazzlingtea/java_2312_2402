class Pizza {
	int radius;
	String name;

	public Pizza() {
		 this.radius = 1;
		 this.name = "";
	}
	public Pizza(int radius) {
		this.radius = radius; // �̸��� ���� ��쿡�� this
	}
	
	public Pizza(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}	

public class PizzaApp { 

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(10, "ġ������"); // public Pizza(int r, String n)�� ���� ��
		
		double area = pizza1.getArea();
		System.out.println(pizza1.name + "�� ������ " + area);
		
		Pizza pizza2 = new Pizza(); //	public Pizza()�� ���� ��
		pizza2.name = "�޺�����";		
		
		area = pizza2.getArea();
		System.out.println(pizza2.name + "�� ������ " + area);
		
	}

}
