
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
		set(x, y); //this.x=x; 오류 "change visibility of x to protected" private이라서 안 됨 
		setColor(color);
	}
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint(); // 상속관계니까 좌표는 위 point에서 가져오면 됨
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
		System.out.println(p.hashCode()); //p객체의 개별 id
		System.out.println(cp.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
