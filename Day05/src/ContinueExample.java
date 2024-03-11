import java.util.Scanner;
public class ContinueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//양수들의 합만 구함
		//음수가 나오면 skip
		//0이 나오면 종료 -->반복횟수가 정해진게 아니니 와일 두와일
		int sum = 0;
		int n = -1;
		while(n != 0) {
			n = sc.nextInt();
			if(n <= 0) //왜 이하? 0일때도 조건식으로 가니까 컨티뉴된 후 조건식에서 종료
				continue;
			else
				sum += n;
		}
		System.out.println(sum);
		
	}

}
