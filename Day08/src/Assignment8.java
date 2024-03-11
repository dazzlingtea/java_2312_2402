import java.util.Scanner;

class Prob2A {
    int a;
    double b;
    void f1() {
        return;
    }
}

class Prob2B extends Prob2A {
    int c;
    double d;
    void f2() {
        return;
    }
}

class Prob3A {
    private int a;
    public void set(int a) { this.a = a; }
}

class Prob3B extends Prob3A {
    protected int b, c;
}


class Prob3C extends Prob3B {
    public int d, e;
}

class Prob3D extends Prob3C {
    public void f() {
        set(1);
        set(10);
        b = 2;
        d = 3;
    }
}

class Prob5TV {
    private int size;
    public Prob5TV(int n) {
        this.size = n;
    }
}

class Prob5ColorTV extends Prob5TV {
    private int colors;
    public Prob5ColorTV(int colors, int size) {
        super(size);
        this.colors = colors;
    }
}

class Prob6A {
    private int a;
    public Prob6A() {}
    protected Prob6A(int i) {
        this.a = i;
    }
}

class Prob6B extends Prob6A {
    private int b;
    public Prob6B() {
        b = 0;
    }
}

public class Assignment8
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
        // 2. ����� Prob2A, Prob2B Ŭ���� �ڵ带 ���� ���� ��� ����� �����,
        // �ʿ� ���� ������ �������ּ���.
       
        // 3. ����� Prob3A, Prob3B, Prob3C Ŭ������ ���� ������ ���ϼ���.
        // 3-1. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3A�� ������� �����ΰ���?
        // ��: a, set()
        Prob3A obj3A = new Prob3A();
       
        // 3-2. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3B�� ������� �����ΰ���?
        // ��: a, b, c, set()
        Prob3B obj3B = new Prob3B();
       
        // 3-3. �Ʒ� �ڵ忡 ���� �����Ǵ� ��ü obj3C�� ������� �����ΰ���?
        // ��: a, b, c, d, e, set()
        Prob3C obj3C = new Prob3C();
       
        // 3-4. Prob3D Ŭ���� �ڵ带 ���� ������ �߻��ϴ� �ڵ带 ã�� �����ϰ�
        // �� ������ �ۼ����ּ���
        // ���� ��ġ: a = 1;
        // ����: private int a�� �����ϱ� ���ؼ��� set(int a)�� ����ؾ� ��
       
        // 4. ��ӿ� ���õ� ���������ڿ� ���� �����Դϴ�. Ʋ�� ���� ����ּ���.
        // 1) ���� Ŭ������ private ����� ���� Ŭ�������� ������ �� ����.
        // 2) ���� Ŭ������ protected ����� ���� ��Ű���� �ִ� ���� Ŭ���������� ������ �� �ִ�.
        // 3) ���� Ŭ������ public ����� ��� �ٸ� Ŭ�������� ������ �� �ִ�.
        // 4) ���� Ŭ������ default ����� ���� ��Ű���� �ִ� ��� �ٸ� ��Ű������ ���� �����ϴ�.
        // ��: 2��, 4��
       
        // 5. ����� Prob5TV, Prob5ColorTV Ŭ���� �ڵ带 ���� ��ĭ�� ������ �ڵ带 ä�켼��.

        // 6. ����� Prob6A, Prob6B Ŭ���� �ڵ带 ���� ������ ã�� �����ϰ�
        // �� ������ �ۼ����ּ���
        // ���� ��ġ: public Prob6A() {} �θ�Ŭ���� �⺻������ �߰�
        // ����: �ڽ�Ŭ������ Prob6B�� ȣ���Ϸ��� �θ�Ŭ������ �⺻�����ڰ� �־�� ��
    }
}
