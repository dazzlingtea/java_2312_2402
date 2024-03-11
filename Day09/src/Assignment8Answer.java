import java.util.Scanner;

class ProbA2A {
    int a;
    double b;
    void f1() {
        return;
    }
}

class ProbA2B extends ProbA2A {
    double d;
    void f2() {
        return;
    }
}

class ProbA3A {
    private int a;
    public void set(int a) { this.a = a; }
}

class ProbA3B extends ProbA3A {
    protected int b, c;
}


class ProbA3C extends ProbA3B {
    public int d, e;
}

class ProbA3D extends ProbA3C {
    public void f() {
        set(1);
        set(10);
        b = 2;
        d = 3;
    }
}

class ProbA5TV {
    private int size;
    public ProbA5TV(int n) { //������
        this.size = n;
    }
}

class ProbA5ColorTV extends ProbA5TV {
    private int colors;
    public ProbA5ColorTV(int colors, int size) {// ������
        super(size);
        this.colors = colors;
    }
}

class ProbA6A {
    private int a;
    protected ProbA6A() {
    	System.out.println("�⺻ ������");
    }
    protected ProbA6A(int i) {
        System.out.println("�Ű����� ������");
    	this.a = i;
    }
}

class ProbA6B extends ProbA6A {
    private int b;
    public ProbA6B(int i) {
    	System.out.println("�ڽ� Ŭ���� ������");
        b = 0;
    }
}

public class Assignment8Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
        // 2. ����� ProbA2A, ProbA2B Ŭ���� �ڵ带 ���� ���� ��� ����� �����,
        // �ʿ� ���� ������ �������ּ���.
       
        // 3. ����� ProbA3A, ProbA3B, ProbA3C Ŭ������ ���� ������ ���ϼ���.
        // 3-1. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3A�� ������� �����ΰ���?
        // ��: a, set()
        ProbA3A obj3A = new ProbA3A();
        //obj3A.a private�̶� a ������ ���� �� ������ ��
        
        // 3-2. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3B�� ������� �����ΰ���?
        // ��: a, b, c, set()
        ProbA3B obj3B = new ProbA3B();
       
        // 3-3. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3C�� ������� �����ΰ���?
        // ��: a, b, c, d, e, set()
        ProbA3C obj3C = new ProbA3C();
       
        // 3-4. ProbA3D Ŭ���� �ڵ带 ���� ������ �߻��ϴ� �ڵ带 ã�� �����ϰ�
        // �� ������ �ۼ����ּ���
        // ���� ��ġ: a = 1�� set(1)�� �����Ѵ�
        // ����: a�� private ������ ������ �ٸ� Ŭ�������� ����X -> setter���
       
        // 4. ��ӿ� ���õ� ���������ڿ� ���� �����Դϴ�. Ʋ�� ���� ����ּ���. (2) (4)
        // 1) ���� Ŭ������ private ����� ���� Ŭ�������� ������ �� ����.
        // 2) ���� Ŭ������ protected ����� ���� ��Ű���� �ִ� ���� Ŭ���������� ������ �� �ִ�.
        // 3) ���� Ŭ������ public ����� ��� �ٸ� Ŭ�������� ������ �� �ִ�.
        // 4) ���� Ŭ������ default ����� ���� ��Ű���� �ִ� ��� �ٸ� ��Ű������ ���� �����ϴ�.
        
       
        // 5. ����� ProbA5TV, ProbA5ColorTV Ŭ���� �ڵ带 ���� ��ĭ�� ������ �ڵ带 ä�켼��.

        // 6. ����� ProbA6A, ProbA6B Ŭ���� �ڵ带 ���� ������ ã�� �����ϰ�
        // �� ������ �ۼ����ּ���
        // ���� ��ġ: �ڽ� Ŭ������ �����ڿ� �Ű����� �߰�, �θ� Ŭ������ �⺻ ������ �߰�
        // ����: �ڽ� Ŭ������ �����ڰ� �ִٸ�, �θ� Ŭ�������� �⺻ �����ڰ� ��� �Ǿ�� ��
        ProbA6B obj6B = new ProbA6B(1);
    }
}