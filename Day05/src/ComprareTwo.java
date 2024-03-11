import java.util.Scanner;
public class ComprareTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 두 수를 비교하여 첫번째 수가 크면 yes 그외는 no, 둘다 0이면 프로그램 종료
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a!=0 || b!=0) { //둘다 0이 아닐땐 반복 while(!(a == 0 && b == 0)) 전체에 !거는 법도 있음
			if(a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			a = sc.nextInt();  // 새로 입력 받아야 함!!!
			b = sc.nextInt();
		}
		
		//do while
		do {
			if(a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			a = sc.nextInt();  // 새로 입력 받아야 함!!!
			b = sc.nextInt();
		} while(!(a == 0 && b == 0));
		
	}

}
