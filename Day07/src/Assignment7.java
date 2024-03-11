import java.util.Scanner;

class Prob2 {
	public double getSum(double d2[]) {
		double sum = 0;
		for(int i=0; i<d2.length; i++) {
		   sum += d2[i];
		}
		return sum; 
   }
}

class Prob3 {
    public int a;
    protected int b;
    int c;
    private int d;
}

class Prob6 {
    public static int[] concat(int a[], int b[]) {
        // �迭 a�� �迭 b�� ������ ���ο� �迭 ��ȯ
    	int c[] = new int[a.length + b.length];
    	for(int i=0; i<a.length; i++) {
    		c[i] = a[i];
    	}
    	for(int i=0; i<b.length; i++) {
    		c[a.length+i] = b[i];
    	}
    	return c;
    }
    public static void print(int[] a) {
        // �迭 a�� ���
    	for(int i : a) {
    		System.out.print(i +" ");
    	}
    	System.out.println();
    }
}

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        // x, y, radius �ʱ�ȭ �ڵ帣 �ۼ����ּ���
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    }
    public void show() {
        // �Ʒ��� ���·� ��µǵ��� �ڵ带 �ۼ����ּ���
        // (x��ǥ, y��ǥ) ������ ex) (3.0, 4.0) 5
    	System.out.println("("+ this.x + ", " + this.y +") "+ this.radius);
    }
}

public class Assignment7
{
    static int p4;
    public static void setV(int x) {
        Assignment7.p4 = x;
    }
   
    int p5;
    static int q5;
   
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
        // 2. Prob2 Ŭ���� ���ο� double Ÿ���� ������ �迭�� �Ű������� �Է¹޾�
        // �迭�� ���� �����ϴ� getSum() �޼ҵ带 �ۼ����ּ���.
        Prob2 p2 = new Prob2();
        double d2[] = {3.14, 1.59, 2.65, 3.58};
        System.out.println(p2.getSum(d2));
       
        // 3. �Ʒ� �ڵ带 ���� ������ ������ �߻��ϴ� ���� �ּ� ó���ϰ�
        // �� ������ �������ּ���.
        // ����:
        Prob3 p3 = new Prob3();
        p3.a = 1;
        p3.b = 2;
        p3.c = 3;
//        p3.d = 4; private�ε� �ٸ� Ŭ�������� ����ؼ� ���� �߻�
       
        // 4. ���� static int p4; public static void setV(int x) { this.p4 = x; } �ڵ帣 ������
        // �߸��� �κ��� ã�� ��ġ�� ������ �������ּ���.
        // ����: static �޼ҵ�� ��ü ���̵� ������ �� �־ this�� �� �� ����,
        //		static-way�� class���� ����ؾ� ��
       
        // 5. �Ʒ� �ڵ忡�� Ʋ�� �κ��� ��� ã�� ��ġ�� ��ģ �κ��� �Ʒ��� �ۼ����ּ���.
        //Assignment7.p5 = 10; 	���� ��ü ������ �� ����
        //obj.q5 = 40;			static-way�� Ŭ�������� ����ؾ� ��
        //System.out.println(obj.q5); static-way�� Ŭ�������� ����ؾ� ��
        int p5 = 10;
        Assignment7.q5 = 20;
        Assignment7 obj = new Assignment7();
        obj.p5 = 30;
        Assignment7.q5 = 40;
        System.out.println(obj.p5);
        System.out.println(Assignment7.q5);
       
        // 6. Prob6 Ŭ������ �ִ� ������ ���� static �޼ҵ带 ä���ּ���.
        int p6[] = {1, 3, 5, 7};
        int q6[] = {3, 6, 9, 12, 15};
        int r6[] = Prob6.concat(p6, q6);
        Prob6.print(r6);
       
        // 7. �ڵ忡 �ִ� ������ ���� �ۼ��� Circle Ŭ������ �Ʒ� �ڵ��� �� ĭ�� ä���ּ���.
        Circle c[] = new Circle[2];
       
        for(int i=0 ; i<c.length ; i++) {
            System.out.print("x, y, radius �Է� >> ");
            double x = sc.nextDouble(); // x �� �б�
            double y = sc.nextDouble(); // y �� �б�
            int radius = sc.nextInt(); // ������ �� �б�
            c[i] = new Circle(x, y, radius); // Circle ��ü ����
        }
       
        for(int i=0 ; i<c.length ; i++)
            c[i].show(); // ��� Circle ��ü�� ���
    }
}