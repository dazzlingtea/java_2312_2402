import java.util.*;
class Prob5Point {
	private int x, y;
	public Prob5Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+this.x+", "+this.y+")";
	}
	public boolean equals(Object obj) {
//		Prob5Point
		return true;
	}
}

public class Assignment11Answer
{// 자세한 건 클래스룸에 올려주시는 답안 참고
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
    	Scanner sc = new Scanner(System.in);
        // 2. Wrapper 클래스를 다루는 문제입니다. 설명에 맞게 코드를 작성해주세요.
        // 2-1. 정수 20을 문자열 변수 s1에 "20"으로 저장해주세요.
    	//Integer.toString
        // 2-2. 문자열 "3.14"를 double 타입 변수 d22에 실수 3.14로 저장해주세요.
    	//Double.parseDouble(문자열)
        // 2-3. 문자열 "true"를 boolean 타입 변수 b23에 true로 저장해주세요.
    	//Boolean.parseBoolean(문자열)
        // 2-4. 정수 30을 이진수 문자열로 변환해 s24에 저장해주세요.
    	//Integer.toBinaryString(30)
       
        // 3. 다음 코드의 실행결과와 그 이유에 대해 설명해주세요.
        // 이유1: 리터럴 테이블에 저장이 되기 때문에 true가 나온다.
        // 이유2: 힙(heap) 영역에 저장이 되기 때문에 다른 주소가 되어 false가 나온다.
        String s31 = "자바"; // true
        System.out.println(s31 == "자바");
        String s32 = new String(s31); //false
        System.out.println(s31 == s32);
       
        // 4. 다음 코드 중 auto boxing과 auto unboxing 있는 것을 고르시오.
        Double d41 = 3.14; // 1 auto boxing Wrapper 클래스 더블에 일반 더블을 래퍼하고 있음
        double d42 = d41; // 2 auto unboxing Wrapper 클래스 더블에서 기본 더블을 넣어서 언박싱
        System.out.println(3 + Integer.valueOf(5)); // 3 + Wrapper -> 기본 auto unboxing
        if('c' == Character.valueOf('c')) // 4 auto unboxing
            System.out.println("c!");

        // 5. 아래 코드를 실행시켰을 때 다음과 같이 출력되도록 Prob5Point 클래스를 작성하세요.
        // <출력 결과>
        // Point(3, 5);
        // 다른 점
        Prob5Point p51 = new Prob5Point(3, 5);
        Prob5Point p52 = new Prob5Point(6, 4);
        System.out.println(p51);
        if(p51.equals(p52)) System.out.println("같은 점");
        else System.out.println("다른 점");
       
        // 6. Scanner를 이용하여 한 줄을 읽어 공백으로 분리된 어절이 총 몇 개 인지
        // 구하는 프로그램을 만들고, "종료"를 입력하면 종료되도록 하는 코드를 작성하세요.
        // <예시>
        // 문장을 입력하세요 > Java is fun.
        // 어절의 수는 3입니다.
        // 문장을 입력하세요 > I like to write codes.
        // 어절의 수는 5입니다.
        // 문장을 입력하세요 > 종료
       while(true ) {
    	   System.out.println("문장을 입력하세요 > ");
    	   String input = sc.nextLine();
    	   if(input.equals("종료")) break;
    	   String[] inputArray = input.split(" ");
    	   System.out.println("어절의 수는 "+inputArray.length + "입니다.");
       }
    }
}