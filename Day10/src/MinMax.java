import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//-100��>= && <=100��  �Է� ���� �� �� ��!!!
		int min = 1000001; //�ּڰ�
		int max = -1000001; //�ִ�
		for(int i=0; i<N; i++) {
			if(A[i] < min) min = A[i];
			if(A[i] > max) max = A[i];
		}
		System.out.println(min+" "+max);
	}

}
