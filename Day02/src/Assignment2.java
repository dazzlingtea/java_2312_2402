import java.util.Scanner;
public class Assignment2
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요
    	Scanner sc = new Scanner(System.in);
       
        // 2. 값이 7인 WEEK 정수 타입을 상수로 선언해주세요
    	final int WEEK = 7;
       
        // 3. 한글 '김' 을 2가지 방식을 이용해 문자 리터럴로 표현해주세요.
        // 한글 '김'의 유니코드 숫자는 44608 입니다.
       char c1 = '김';
       char c2 = '\uAE40';
       
        // 4. Scanner를 이용해 학점(4.5만점)과 과목명(문자열)을 한 줄로 입력받는 코드를 작성해주세요.
       System.out.println("학점(4.5만점)과 과목명을 띄어쓰기로 구분하여 입력하세요.");
       double 학점 = sc.nextDouble();
       String 과목명 = sc.next();
       sc.close();
       
        // 5-1. 정수 7과 3을 저장하는 변수를 만들어주세요.
        // 5-2. 두 정수의 합, 차, 곱, 몫, 나머지를 출력해주세요.
       int i1 = 7;
       int i2 = 3;
       int add = i1 + i2;
       int sub = i1 - i2;
       int mul = i1 * i2;
       int div = i1 / i2;
       int rem = i1 % i2;
       System.out.println(add+", "+sub+", "+mul+", "+div+", "+rem);
       
        // 6-1. 정수 10을 저장하는 변수를 만들어주세요.
        // 6-2. 증감 연산자를 이용해 위 변수의 값을 바꾸면서 출력하되, 출력 값이 11, 12, 13, 12, 11 순서로 나오도록 해주세요.
       int i3 = 10;
       ++i3;
       System.out.println(i3++ +", "+ i3++ +", "+ i3-- +", "+ i3 +", "+ --i3);
       
        // 7. 비교 연산자와 논리 연산자를 이용해 값이 true가 나오는 코드를 2개 작성해주세요.
       System.out.println((5<7 && 6==9) || (5>7 ^ 3<=4));
       System.out.println(!(6!=9) ^ (7>=5 && 3<4));
       
        // 8. 비트 연산자를 이용해 값이 5와 12가 나오도록 하는 코드를 작성해주세요. (1이나 0 사용 금지)
       System.out.println((8 | 2) ^ 15);
       System.out.println(3 << 2);       
    }
}
