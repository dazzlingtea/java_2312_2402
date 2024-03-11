import java.util.Scanner;
public class WhileSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		//정수를 계속 입력받음 
		//-1을 입력받으면 반복이 종료되면서 입력받은 정수의 수와 합을 출력
		//while문으로
		int num = sc.nextInt();
		while(num != -1) {
			count++;
			sum += num;
			num = sc.nextInt(); //이거 없으면 무한
		}
		System.out.println("횟수: " + count + " 합: " + sum );
		
		//do-while
		count = 0;
		sum = 0;
		do {
			num = sc.nextInt();
			if(num != -1) {   //이거 없으면 처음에 -1 입력됐을 때 안되니까, 입력 후 조건이니까 sc이후
				count++;
				sum += num;
			}
		} while(num != -1);
		System.out.println("횟수: " + count + "합: " + sum );
		
	}

}
