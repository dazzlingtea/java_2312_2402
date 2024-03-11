import java.util.Scanner;
import java.util.InputMismatchException; //인풋미스매치 예외 위해서
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			System.out.print("나뉨수를 입력하세요 > "); Arithmetic만 할 땐 이것도 상관 없음
//			int dividend = sc.nextInt();
//			System.out.print("나눗수를 입력하세요 > ");
//			int divisor = sc.nextInt();
			try {
				System.out.print("나뉨수를 입력하세요 > "); //입력mismatch예외 위해서
				int dividend = sc.nextInt();
				System.out.print("나눗수를 입력하세요 > ");
				int divisor = sc.nextInt();
				int answer = dividend / divisor;
				System.out.println("결과는 " + answer);
				break;
			}
			catch(ArithmeticException e) { //e exception의 줄임말
				System.out.println(e);
				System.out.println("0으로 나눌 수 없습니다!");
			}
			catch(InputMismatchException e) { //위에 import 해줘야됨
				sc = new Scanner(System.in);
				System.out.println(e);
				System.out.println("입력이 올바르지 않습니다."); //엔터가 나온거에 들어가고들어가고...
			}
		}
		
	}

}
