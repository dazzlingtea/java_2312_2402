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
	public boolean equals(Object obj) { //rect���� ���ϱ� ���� �ٿ�ĳ����
		Rect r = (Rect)obj;
		return this.getArea() == r.getArea();//���� �ٸ� rect ��
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rect r1 = new Rect(2, 3);
		Rect r2 = new Rect(3, 4);
		Rect r3 = new Rect(6, 2);
		System.out.println(r1); //���ڿ� ������ �ڵ����� ��µȴ�
		
		if(r2 == r3) System.out.println("r2 == r3"); //��ü ��ü�� ���ؼ� ����x
		if(r2.equals(r3)) System.out.println("r2.equals(r3)");		
	}
}
