import java.util.*;
//³ª¸ÓÁö

public class Remain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r[] = new int[42];
		
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
			r[A % 42] = 1;
		}
		int count = 0;
		for(int i=0; i<42 ; i++) {
			count += r[i]; //if(r[i] == 1) count++;
		}
		System.out.println(count);

	}

}
