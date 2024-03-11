import java.util.Scanner;
import java.util.InputMismatchException;

class Samp {
    int id;
    public Samp(int x) {
        this.id = x;
    }
    public Samp() {
    	this(0);
        System.out.println("생성자 호출");
    }
}

class Samp2 {
    int x;
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public Samp2(int x) {
        this.x = x;
    }
}

class TV {
	String company;
	int year;
	int size;
	
	public TV(String company, int year, int size) {
		//쓰다 말았음
	}
	
	public void explain() {
		System.out.println(this.company +"에서 만든"
						+this.year);
	}
}

class Grade {
	int a, b, c;
	
	public Grade(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void getAverage() {
		System.out.println("평균은 " + (this.a + this.b + this.c)/3);
	}
}


public class Assignment6Answer
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in); //생성자는 System.in을 받는다
        // 2. 아래 코드는 2개의 정수를 입력받아 곱을 구하는 코드입니다.
        // 10과 5를 입력한다면 정상적으로 50이 출력됩니다.
        // 그러나 2.5와 4를 입력한다면 java.util.InputMismatchException 예외가 발생합니다.
        // 이 예외를 처리하여 2.5와 4가 나온다면 "실수는 입력하면 안됩니다." 라는 문장이 나오도록
        // 코드를 수정해주세요.
    	try {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
    	}
    	catch(InputMismatchException e) {
    		System.out.println("실수는 입력하면 안됩니다.");
    	}
        // 3. 위의 Samp 클래스 코드에서 잘못된 부분을 3군데 고친 후, 아래에 고친 부분을 작성해주세요.
        // 1) 생성자에 void 지우기
        // 2) 생성자에 void 지우기
        // 3) this(0)를 첫 번째 줄로 옮긴다
       
        // 4. 위의 Samp2 클래스 코드와 아래 코드를 보고 잘못된 부분을 고친 후, 아래에 고친 부분을 작성하세요.
        // 1) 클래스 코드에서 public -> class 바꾸기
    	// 2) 아래의 생성 코드에서 생성자 매개변수 넣기
        Samp2 a = new Samp2(10);  //기본 생성자
        int n4 = a.getX(); //a객체에서 getX()호출
       
        // 5. 자바의 클래스와 객체에 대한 설명 중 틀린 것은?
        // 1) 클래스 바깥에 전역 변수를 선언할 수 없다.
        // 2) 클래스는 객체를 생성하기 위한 틀이다.
        // 3) 클래스의 멤버 변수를 필드라 부르며, 클래스는 필드와 메소드로 이루어진다.
        // 4) 필드는 클래스 내에서 private보다 public으로 선언하는 것이 바람직하다.
          // 4번 캡슐화, 접근지정자 -> 보호가 우선이라 틀림
        // 6. 생성자에 대한 설명 중 틀린 것은?
        // 1) 생성자가 작성되어 있지 않으면 컴파일러가 자동으로 기본 생성자를 추가한다.
        // 2) 생성자의 이름은ㅇ 클래스의 이름과 반드시 같아야 한다.
        // 3) this()는 생성자 내에서 다른 생성자를 호출하는 코드이다.
        // 4) 생성자에서는 아무 값도 리턴하지 않기 때문에 return 을 쓸 수 없다.
          // 쓸 수는 있다. public void Samp() 식으로 써도 안되고 return 뒤에 뭐가 있으면 안 됨
        // 7. 아래 코드를 실행 시켰을 때 "Samsung에서 만든 2023년식 72인치 TV" 가 나오도록
        // 클래스를 작성해주세요.
        TV myTV = new TV("Samsung", 2023, 72);
        myTV.explain();
       
        // 8. 아래 코드를 실행시켰을 때 "평균은 91" 가 나오도록 클래스를 작성해주세요.
        Grade myGrade = new Grade(90, 88, 96);
        myGrade.getAverage();
    }
}
