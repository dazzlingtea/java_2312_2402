import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		//피라미드
		System.out.println();
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		//역피라미드
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n-i+1 ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		//역피라미드 --방식
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j>=i+1 ; j-- ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 12 123 1234 12345
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 12 123 1234 12345 1234 123 12 1
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1 ; i<=n-1 ; i--) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//   (     3) (   23) (  123) 안 공백 출력 중첩2개
		for(int i=n ; i<=n/2 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}
		// 대칭
		for(int i=n ; i<=n/2+1 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}		for(int i=n ; i<=n ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}
		
		//* 삼각형  첫 공백4 별1 2: 공3 별1 공1 별1 
		for(int i=1 ; i<=n-1 ; i++ ) {
			System.out.print(" ");
			}
		System.out.println("*"); //첫째줄
		
		for(int i=1 ; i<=n-2 ; i++) {  //두번째줄~~밑변 하나 전
			for(int j =1 ; j<=n-1-i ; j++)
				System.out.println(" ");
			System.out.println("*");
			for(int j=1 ; j<=i*2-1 ; j++)
				System.out.println(" ");
			System.out.println("*");
		}
		for(int i=1 ; i<=n*2-1 ; i++)
			System.out.println("*"); //삼각형 밑변
		
	}

}
