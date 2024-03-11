import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력해주세요 (1901~2100)> ");
		int year = sc.nextInt();
		
		if(year >= 2001) {
			System.out.println("21세기 입니다.");
		}
		else {
			System.out.println("20세기 입니다.");
		}
		
		System.out.println(year >= 2001 ? "21세기":"20세기2");
		
	}

}
