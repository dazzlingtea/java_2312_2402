
class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + this.x + ", " + this.y + ")") ;
	}
}
class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
		
	}
	public void setAll(int x, int y, String color) {
		set(x, y); //this.x=x; ���� "change visibility of x to protected" private�̶� �� �� 
		setColor(color);
	}
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint(); // ��Ӱ���ϱ� ��ǥ�� �� point���� �������� ��
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("black");
		cp.showPoint();
		cp.showColorPoint();
		
		String a = "Hello";
		String b = "Hello";
		System.out.println(a.getClass());
		System.out.println(p.getClass());
		System.out.println(cp.getClass());
		System.out.println(p.hashCode()); //p��ü�� ���� id
		System.out.println(cp.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
