class Rect {
	private int width, height;
	Rect(int width, int height) {
	this.width = width;
	this.height = height;
	}
	public int getArea() {
		return this.width * this.height;
	}
	public String toString() {
		return this.width + ", " +this.height + ", " + this.getArea();
	}
	public boolean equals(Object obj) { //rect끼리 비교하기 위해 다운캐스팅
		Rect r = (Rect)obj;
		return this.getArea() == r.getArea();//나랑 다른 rect 비교
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rect r1 = new Rect(2, 3);
		Rect r2 = new Rect(3, 4);
		Rect r3 = new Rect(6, 2);
		System.out.println(r1); //문자열 형으로 자동으로 출력된다
		
		if(r2 == r3) System.out.println("r2 == r3"); //객체 자체를 비교해서 실행x
		if(r2.equals(r3)) System.out.println("r2.equals(r3)");		
	}
}
