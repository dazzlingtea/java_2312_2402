import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//-100만>= && <=100만  입력 범위 잘 볼 것!!!
		int min = 1000001; //최솟값
		int max = -1000001; //최댓값
		for(int i=0; i<N; i++) {
			if(A[i] < min) min = A[i];
			if(A[i] > max) max = A[i];
		}
		System.out.println(min+" "+max);
	}

}
