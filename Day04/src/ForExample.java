
public class ForExample {

	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 5 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println("종료");
		// 초기 i=0 -> 조건 i<5 true -> 0 출력
		// 변화 i=1 -> 조건 i<5 true -> 1 출력
		// 변화 i=2 -> 조건 i<5 true -> 2 출력
		// 변화 i=3 -> 조건 i<5 true -> 3 출력
		// 변화 i=4 -> 조건 i<5 true -> 4 출력
		// 변화 i=5 -> 조건 i<5 false -> 반복 종료
		
	
		//for문을 이용해서 1~100까지의 합을 구하는 코드
		int sum = 0;
		for(i=1 ; i<=100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1~100까지 홀수의 합을 구하는 코드
		int oddsum = 0;
		for(i=1 ; i<=100 ; i+=2) {
			oddsum += i;
		}
		System.out.println(oddsum);
		
		//짝수
		int evensum = 0;
		for(i=2 ; i<=100 ; i+=2) {
			evensum += i;
		}
		System.out.println(evensum);
	}

}
