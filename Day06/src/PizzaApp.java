class Pizza {
	int radius;
	String name;

	public Pizza() {
		 this.radius = 1;
		 this.name = "";
	}
	public Pizza(int radius) {
		this.radius = radius; // 이름이 같은 경우에도 this
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
		Pizza pizza1 = new Pizza(10, "치즈피자"); // public Pizza(int r, String n)로 가게 됨
		
		double area = pizza1.getArea();
		System.out.println(pizza1.name + "의 면적은 " + area);
		
		Pizza pizza2 = new Pizza(); //	public Pizza()로 가게 됨
		pizza2.name = "콤비피자";		
		
		area = pizza2.getArea();
		System.out.println(pizza2.name + "의 면적은 " + area);
		
	}

}
