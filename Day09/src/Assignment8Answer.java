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
    public ProbA5TV(int n) { //생성자
        this.size = n;
    }
}

class ProbA5ColorTV extends ProbA5TV {
    private int colors;
    public ProbA5ColorTV(int colors, int size) {// 생성자
        super(size);
        this.colors = colors;
    }
}

class ProbA6A {
    private int a;
    protected ProbA6A() {
    	System.out.println("기본 생성자");
    }
    protected ProbA6A(int i) {
        System.out.println("매개변수 생성자");
    	this.a = i;
    }
}

class ProbA6B extends ProbA6A {
    private int b;
    public ProbA6B(int i) {
    	System.out.println("자식 클래스 생성자");
        b = 0;
    }
}

public class Assignment8Answer
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in);
        // 2. 상단의 ProbA2A, ProbA2B 클래스 코드를 보고 서로 상속 관계로 만들고,
        // 필요 없는 변수를 삭제해주세요.
       
        // 3. 상단의 ProbA3A, ProbA3B, ProbA3C 클래스를 보고 질문에 답하세요.
        // 3-1. 아래 코드에 의해 생성되는 객체 obj3A의 멤버들은 무엇인가요?
        // 답: a, set()
        ProbA3A obj3A = new ProbA3A();
        //obj3A.a private이라서 a 접근을 못할 뿐 생성은 됨
        
        // 3-2. 아래 코드에 의해 생성되는 객체 obj3B의 멤버들은 무엇인가요?
        // 답: a, b, c, set()
        ProbA3B obj3B = new ProbA3B();
       
        // 3-3. 아래 코드에 의해 생성되는 객체 obj3C의 멤버들은 무엇인가요?
        // 답: a, b, c, d, e, set()
        ProbA3C obj3C = new ProbA3C();
       
        // 3-4. ProbA3D 클래스 코드를 보고 오류가 발생하는 코드를 찾아 수정하고
        // 그 이유를 작성해주세요
        // 수정 위치: a = 1을 set(1)로 변경한다
        // 이유: a는 private 변수기 때문에 다른 클래스에서 접근X -> setter사용
       
        // 4. 상속에 관련된 접근지정자에 대한 설명입니다. 틀린 것을 골라주세요. (2) (4)
        // 1) 슈퍼 클래스의 private 멤버는 서브 클래스에서 접근할 수 없다.
        // 2) 슈퍼 클래스의 protected 멤버는 같은 패키지에 있는 서브 클래스에서만 접근할 수 있다.
        // 3) 슈퍼 클래스의 public 멤버는 모든 다른 클래스에서 접근할 수 있다.
        // 4) 슈퍼 클래스의 default 멤버는 같은 패키지에 있는 모든 다른 패키지에서 접근 가능하다.
        
       
        // 5. 상단의 ProbA5TV, ProbA5ColorTV 클래스 코드를 보고 빈칸에 적절한 코드를 채우세요.

        // 6. 상단의 ProbA6A, ProbA6B 클래스 코드를 보고 오류를 찾아 수정하고
        // 그 이유를 작성해주세요
        // 수정 위치: 자식 클래스의 생성자에 매개변수 추가, 부모 클래스에 기본 생성자 추가
        // 이유: 자식 클래스에 생성자가 있다면, 부모 클래스에는 기본 생성자가 명시 되어야 함
        ProbA6B obj6B = new ProbA6B(1);
    }
}