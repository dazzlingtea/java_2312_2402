class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ", " + y +")"; //Point 클래스에 맞게
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj; //다운캐스팅 (자식으로) 표시
		return this.x == p.x && this.y == p.y;
	}
}



public class ObjectEx {

	public static void main(String[] args) {
		Object obj = new Object();
		String a = "apple";
		System.out.println(a.equals("apple")); //Object랑 String a 상속관계, 오버라이딩
			
		Point p = new Point(2, 3);
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
		
		Point q = new Point(2, 3);
		Point r = p; //레퍼런스 타입에서 대입은 주소 복사라 같은 값을 가리킨다
		
		if(p == q) //달리 생성해서 주소 다르니 출력 안됨
			System.out.println("p == q"); //
		if(p.equals(q))
				System.out.println("p.equals(q)"); //
		if(p == r)
			System.out.println("p == r");
	}

}
