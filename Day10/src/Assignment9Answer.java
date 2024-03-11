import java.util.*; //java.util �Ʒ� ��� �� ���� ���ڴ�

interface Prob2Mouse {
    final int BUTTONS = 3; //public static ����
    int VERSION = 0;
    void move();
    public int click();
    //protected int out();
    static public void drag() {System.out.println();} //This method requires a body instead of a semicolon
    default void drop() {
        System.out.println("���콺 ���");
    }
}

abstract class Prob3A {
    protected int n;
    public Prob3A(int n) {
        this.n = n;
    }
    public abstract boolean isOdd();
}

class Prob3B extends Prob3A { //public class�� �� ���Ͽ� �ϳ���
    public Prob3B(int n) {
        super(n);
    }
    public boolean isOdd() {
    	if(this.n % 2 == 1) return true;
    	else return false;
    }
}

class Prob4A {
    int i;
}

class Prob4B extends Prob4A {
    int j;
}

class Prob4C extends Prob4B {
    int k;
}

class Prob4D extends Prob4B {
    int m;
}

abstract class Prob5A {
    public void paint() { draw(); }
    abstract public void draw();
}

class Prob5B extends Prob5A { //draw() �����ؾ� ��
    private int radius;
    public Prob5B(int radius) { this.radius = radius; }
    double getArea() { return 3.14 * this.radius * this.radius; }
    
    public void draw() {
    	System.out.println("radius = " + this.radius);
    }
}

interface Prob7Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("REDRAW!");
        draw();
    }
}

class Prob7Circle implements Prob7Shape {
	private int radius;
	public Prob7Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return this.radius;
	}
	public void draw() {
		System.out.println(" �������� "+getRadius()+"�� ���� �׸��ϴ�.");
	
	}
	public double getArea() {return this.radius * this.radius * PI;}
}

public class Assignment9Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
       
        // 2. �� Prob2Mouse �������̽����� Ʋ�� �κ��� ��ġ�� �� ������ �����ϼ���.
        // Ʋ�� �κ�: protected, static �޼ҵ�
        // ����: protected ��� X, static ���� �ۼ�
       
        // 3. ���� Prob3A �߻� Ŭ������ Prob3B Ŭ���� �ڵ带 ���� false�� ��µǵ���
        // Prob3B Ŭ���� �ڵ带 �ϼ��Ͻÿ�.
        Prob3B obj3B = new Prob3B(10);
        System.out.println(obj3B.isOdd());
       
        // 4. ���� Prob4A~Prob4D Ŭ������ ���� ��ĳ���ÿ� �ش�Ǵ� �ڵ带 ��� ���ÿ�.
        // ��: 2, 3
        Prob4A obj4A = new Prob4A(); // 1��
        Prob4B obj4B = new Prob4C(); // 2��
        Prob4A obj4C = new Prob4D(); // 3��
        Prob4D obj4D = new Prob4D(); // 4��
       
        // 5. ���� Prob5A, Prob5B Ŭ������ ���� �Ʒ� �ڵ��� ���� �����
        // "radius = 10" �� �ǵ��� Prob5B Ŭ������ �����ϼ���.
        Prob5B obj5 = new Prob5B(10);
        obj5.paint();
       
        // 6. ���� �� �������̽��� Ư¡�� �ƴ� ���� ���ÿ�. ���� �Ǵ�
        // 1) �������̽��� ��ü�� ������ �� ����.
        // 2) �������̽��� Ŭ������ ���� ��� ������ ������ �����ϴ�.
        // 3) �������̽��� �߻� �޼ҵ�� �ڵ����� public�̴�.
        // 4) Ŭ�������� �������̽��� ������ �� implements Ű���带 �̿��ϸ�,
        //    ��� �߻� �޼ҵ带 �ۼ��ؾ� �Ѵ�.
       
       
        // 7. �Ʒ� �ڵ�� �������� �����Ͽ� �������̽� Prob7Shape�� ������
        // Ŭ���� Prob7Circle�� �ۼ��ϰ� ��ü ���α׷��� �ϼ����ּ���
        // ������
        // REDRAW! �������� 10�� ���� �׸��ϴ�.
        // ������ 314.0 �Դϴ�.
        Prob7Shape obj7 = new Prob7Circle(10);
        obj7.redraw();
        System.out.println("������ " + obj7.getArea() + " �Դϴ�.");
       
    }
}
