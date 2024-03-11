import java.util.*;

public class BasketArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int bArr[] = new int[N];
		for(int i=0; i<N; i++) { bArr[i] = i+1;	}
		
		for(int k=0; k<M; k++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			while(i < j) {
				int tmp = bArr[i];
				bArr[i++] = bArr[j];
				bArr[j--] = tmp;
			}
		}
		for(int k : bArr)
		System.out.print(k +" ");
	}

}
