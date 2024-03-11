import java.util.Scanner;
public class Replay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		//정수를 계속 입력받음
		//-1 입력받으면 반복이 종료되며 입력받은 정수의 개수와 합을 출력
		//while문
		
		int num = sc.nextInt();
		while(num != -1) {
			count++;
			sum += num; //여기까지 하면 무한루프
			num = sc.nextInt(); //새로 입력받는 것까지 포함해야 함
		}
		System.out.println("횟수: "+ count + " 합: " + sum);
		
		//do-while
		count = 0;
		sum = 0;
		
		do {
			num = sc.nextInt();
			if(num == -1) {
				break;
			}
			count++;
			sum += num;
			//num=sc.nextInt 쓸 필요는 없었네 여러 번 입력할 필요도 없고
		} while(num != -1);
		System.out.println("dw횟수:"+ count +" 합:"+ sum);
		
		//a~z 출력
		//for
		for(char i='a' ; i <='z' ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while
		char i2 = 'a';
		while(i2 <='z') {
			System.out.print(i2+" ");
			i2++;
		}
		System.out.println();
		//do-while
		i2 = 'a';
		do {
			System.out.print(i2+" ");
			i2++; //(char)(i+1) 캐스팅 방식도 ㅇ 
		} while(i2 <= 'z');
		System.out.println();
		
		//반마름모
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1 ; i<=n-1 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//반마름모 아래
		n = sc.nextInt();
		for(int i=n-1 ; i>=1 ; i--) { //세로 개수
			for(int j=1 ; j<=i ; j++) { //가로 개수
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//오른쪽정렬 5 ,4 5, ... ,1 2 3 4 5
		//공백8 5 1, 공백6 4 5, 공백 4 3 4 5 ...
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n-i ; j++) {//공백
				System.out.print("  ");
			}//for문 내부선언은 또 해도 됨
			for(int j=n-i+1 ; j<=n ; j++) {//가로로 첫번째 5 4 3 2 1
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 12345 2345 345 2345 12345
		for(int i=1 ; i<=n/2 ; i++) { //오른쪽 정렬에서 윗부분만 바꾸면 되니까 i<=n/2
			for(int j=1 ; j<=i-1 ; j++) {//i=1 j=n개, 공백0개
				System.out.print("  ");
			}
			for(int j=i ; j<=n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n/2+1 ; i<=n ; i++) {//아래니까 전체 n줄 중 윗부분 최대치 다음부터 
			for(int j=1 ; j<=2*(n-i) ; j++) {//공백
				System.out.print(" ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//별삼각형
		for(int i=1 ; i<=n-1 ; i++) 
			System.out.print(" ");
		System.out.println("*");
		
		for(int i=1 ; i<=n-2 ; i++) {
			for(int j=n-1-i ; j>=1 ; j--) {//j=1;j<=n-1-i;j++
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i=1 ; i<=2*n-1 ; i++)
			System.out.print("*");
		System.out.println();
	}

}
