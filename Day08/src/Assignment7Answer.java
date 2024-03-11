import java.util.Scanner;
class Prob2 {
	double getSum(double[] d) {
		double sum = 0;
		for(double i: d)
			sum += i;
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
        // 배열 a와 배열 b를 연결한 새로운 배열 반환
    	int c[] = new int[a.length + b.length];
    	for(int i=0; i<a.length; i++) {
    		c[i] = a[i];
    	}
    	for(int i=0; i<b.length; i++) {
    		c[i+a.length] = b[i];
    	}
    	return c;
    }
    public static void print(int[] a) {
        // 배열 a를 출력
    	for(int i: a) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
}

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        // x, y, radius 초기화 코드르 작성해주세요
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    }
    public void show() {
        // 아래의 형태로 출력되도록 코드를 작성해주세요
        // (x좌표, y좌표) 반지름 ex) (3.0, 4.0) 5
    	System.out.println("("+ this.x + ", " + this.y +") "+ this.radius);
    }
}

public class Assignment7Answer
{
    static int p4;
    public static void setV(int x) {
        //this.p4 = x;
    }
   
    int p5;
    static int q5;
   
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in);
        // 2. Prob2 클래스 내부에 double 타입의 일차원 배열을 매개변수로 입력받아
        // 배열의 합을 리턴하는 getSum() 메소드를 작성해주세요.
        Prob2 p2 = new Prob2();
        double d2[] = {3.14, 1.59, 2.65, 3.58};
        System.out.println(p2.getSum(d2));
       
        // 3. 아래 코드를 보고 컴파일 오류가 발생하는 줄을 주석 처리하고
        // 그 이유를 설명해주세요.
        // 이유: d 변수는 private 변수여서 다른 클래스에서는 접근 X
        Prob3 p3 = new Prob3();
        p3.a = 1;
        p3.b = 2;
        p3.c = 3;
        //p3.d = 4; 
       
        // 4. 위의 static int p4; public static void setV(int x) { this.p4 = x; } 코드르 보보고
        // 잘못된 부분을 찾아 고치고 이유를 설명해주세요.
        // 이유: static 메소드에서는 this를 사용 X
       
       
        // 5. 아래 코드에서 틀린 부분을 모두 찾아 고치고 고친 부분을 아래에 작성해주세요.
        // static 메소드에서는 non-static 변수를 접근 X
        // static 변수에 접근 할 때는 static-way로 접근
        // -> 객체.필드 가 아닌 클래스명.필드 로 접근
        //Assignment7Answer.p5 = 10;
        Assignment7Answer.q5 = 20; 
        Assignment7Answer obj = new Assignment7Answer();
        obj.p5 = 30;
        Assignment7Answer.q5 = 40; //
        System.out.println(obj.p5);
        System.out.println(obj.q5);
       
        // 6. Prob6 클래스에 있는 설명을 보고 static 메소드를 채워주세요.
        int p6[] = {1, 3, 5, 7};
        int q6[] = {3, 6, 9, 12, 15};
        int r6[] = Prob6.concat(p6, q6); //concat은 static 메소드다
        Prob6.print(r6);
       
        // 7. 코드에 있는 설명대로 위에 작성된 Circle 클래스와 아래 코드의 빈 칸을 채워주세요.
        Circle c[] = new Circle[3];
       
        for(int i=0 ; i<c.length ; i++) {
            System.out.print("x, y, radius 입력 >> ");
            double x = sc.nextDouble(); // x 값 읽기
            double y = sc.nextDouble(); // y 값 읽기
            int radius = sc.nextInt(); // 반지름 값 읽기
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }
       
        for(int i=0 ; i<c.length ; i++)
            c[i].show(); // 모든 Circle 객체를 출력
    }
}
