import java.util.*;
public class Counting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //������ ����
		int A[] = new int[N]; //���� ������ �迭
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int v = sc.nextInt(); //�迭���� ã���� �ϴ� ��
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
