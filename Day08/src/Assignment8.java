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
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in);
        // 2. 상단의 Prob2A, Prob2B 클래스 코드를 보고 서로 상속 관계로 만들고,
        // 필요 없는 변수를 삭제해주세요.
       
        // 3. 상단의 Prob3A, Prob3B, Prob3C 클래스를 보고 질문에 답하세요.
        // 3-1. 아래 코드에 의해 생성되는 객체 obj3A의 멤버들은 무엇인가요?
        // 답: a, set()
        Prob3A obj3A = new Prob3A();
       
        // 3-2. 아래 코드에 의해 생성되는 객체 obj3B의 멤버들은 무엇인가요?
        // 답: a, b, c, set()
        Prob3B obj3B = new Prob3B();
       
        // 3-3. 아래 코드에 의해 생성되는 객체 obj3C의 멤버들은 무엇인가요?
        // 답: a, b, c, d, e, set()
        Prob3C obj3C = new Prob3C();
       
        // 3-4. Prob3D 클래스 코드를 보고 오류가 발생하는 코드를 찾아 수정하고
        // 그 이유를 작성해주세요
        // 수정 위치: a = 1;
        // 이유: private int a에 접근하기 위해서는 set(int a)를 사용해야 함
       
        // 4. 상속에 관련된 접근지정자에 대한 설명입니다. 틀린 것을 골라주세요.
        // 1) 슈퍼 클래스의 private 멤버는 서브 클래스에서 접근할 수 없다.
        // 2) 슈퍼 클래스의 protected 멤버는 같은 패키지에 있는 서브 클래스에서만 접근할 수 있다.
        // 3) 슈퍼 클래스의 public 멤버는 모든 다른 클래스에서 접근할 수 있다.
        // 4) 슈퍼 클래스의 default 멤버는 같은 패키지에 있는 모든 다른 패키지에서 접근 가능하다.
        // 답: 2번, 4번
       
        // 5. 상단의 Prob5TV, Prob5ColorTV 클래스 코드를 보고 빈칸에 적절한 코드를 채우세요.

        // 6. 상단의 Prob6A, Prob6B 클래스 코드를 보고 오류를 찾아 수정하고
        // 그 이유를 작성해주세요
        // 수정 위치: public Prob6A() {} 부모클래스 기본생성자 추가
        // 이유: 자식클래스인 Prob6B를 호출하려면 부모클래스의 기본생성자가 있어야 함
    }
}
