class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ", " + y +")"; //Point Ŭ������ �°�
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj; //�ٿ�ĳ���� (�ڽ�����) ǥ��
		return this.x == p.x && this.y == p.y;
	}
}



public class ObjectEx {

	public static void main(String[] args) {
		Object obj = new Object();
		String a = "apple";
		System.out.println(a.equals("apple")); //Object�� String a ��Ӱ���, �������̵�
			
		Point p = new Point(2, 3);
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
		
		Point q = new Point(2, 3);
		Point r = p; //���۷��� Ÿ�Կ��� ������ �ּ� ����� ���� ���� ����Ų��
		
		if(p == q) //�޸� �����ؼ� �ּ� �ٸ��� ��� �ȵ�
			System.out.println("p == q"); //
		if(p.equals(q))
				System.out.println("p.equals(q)"); //
		if(p == r)
			System.out.println("p == r");
	}

}
