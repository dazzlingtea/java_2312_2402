import java.util.*;
public class Counting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정수의 개수
		int A[] = new int[N]; //수를 저장할 배열
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int v = sc.nextInt(); //배열에서 찾고자 하는 수
		int count = 0;
		for(int i : A) {
			if(v == A[i]) count++;
		}
		System.out.println(count);
		
		int count2 = 0;
		for(int i: A) {
			if(i == v) count2++;
		}
		System.out.println(count2);
	}

}
