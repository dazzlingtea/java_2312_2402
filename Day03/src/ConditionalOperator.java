import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = 10;
		b = ++b>10 && b<12 ? b++ : --b;
		// true true
		//   true   -> b++  
		System.out.println(b);
		
		int score = sc.nextInt();
		// score  80 이상이면 '통과', 아니면 '재수강'
		String pass = score >= 80?"통과":"재수강";
		System.out.println(pass);
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		// 두 수의 차이(절댓값)으로 출력 -> 음수일 때는 -를 떼고
		int result = (i1 - i2)>0 ? i1-i2 : i2-i1;
		System.out.println(result);
		
	}

}
