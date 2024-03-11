import java.util.*; //java.util 아래 모든 걸 갖고 오겠다

interface Prob2Mouse {
    final int BUTTONS = 3; //public static 생략
    int VERSION = 0;
    void move();
    public int click();
    //protected int out();
    static public void drag() {System.out.println();} //This method requires a body instead of a semicolon
    default void drop() {
        System.out.println("마우스 드랍");
    }
}

abstract class Prob3A {
    protected int n;
    public Prob3A(int n) {
        this.n = n;
    }
    public abstract boolean isOdd();
}

class Prob3B extends Prob3A { //public class는 한 파일에 하나만
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

class Prob5B extends Prob5A { //draw() 구현해야 함
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
		System.out.println(" 반지름이 "+getRadius()+"인 원을 그립니다.");
	
	}
	public double getArea() {return this.radius * this.radius * PI;}
}

public class Assignment9Answer
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in);
       
        // 2. 위 Prob2Mouse 인터페이스에서 틀린 부분을 고치고 그 이유를 설명하세요.
        // 틀린 부분: protected, static 메소드
        // 이유: protected 사용 X, static 내용 작성
       
        // 3. 위의 Prob3A 추상 클래스와 Prob3B 클래스 코드를 보고 false가 출력되도록
        // Prob3B 클래스 코드를 완성하시오.
        Prob3B obj3B = new Prob3B(10);
        System.out.println(obj3B.isOdd());
       
        // 4. 위의 Prob4A~Prob4D 클래스를 보고 업캐스팅에 해당되는 코드를 모두 고르시오.
        // 답: 2, 3
        Prob4A obj4A = new Prob4A(); // 1번
        Prob4B obj4B = new Prob4C(); // 2번
        Prob4A obj4C = new Prob4D(); // 3번
        Prob4D obj4D = new Prob4D(); // 4번
       
        // 5. 위의 Prob5A, Prob5B 클래스를 보고 아래 코드의 실행 결과가
        // "radius = 10" 이 되도록 Prob5B 클래스를 수정하세요.
        Prob5B obj5 = new Prob5B(10);
        obj5.paint();
       
        // 6. 다음 중 인터페이스의 특징이 아닌 것을 고르시오. 전부 옳다
        // 1) 인터페이스의 객체는 생성할 수 없다.
        // 2) 인터페이스는 클래스와 같이 멤버 변수의 선언이 가능하다.
        // 3) 인터페이스의 추상 메소드는 자동으로 public이다.
        // 4) 클래스에서 인터페이스를 구현할 때 implements 키워드를 이용하며,
        //    모든 추상 메소드를 작성해야 한다.
       
       
        // 7. 아래 코드와 실행결과를 참고하여 인터페이스 Prob7Shape를 구현한
        // 클래스 Prob7Circle를 작성하고 전체 프로그램을 완성해주세요
        // 실행결과
        // REDRAW! 반지름이 10인 원을 그립니다.
        // 면적은 314.0 입니다.
        Prob7Shape obj7 = new Prob7Circle(10);
        obj7.redraw();
        System.out.println("면적은 " + obj7.getArea() + " 입니다.");
       
    }
}
