import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		//�Ƕ�̵�
		System.out.println();
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		//���Ƕ�̵�
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n-i+1 ; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		//���Ƕ�̵� --���
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j>=i+1 ; j-- ) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 12 123 1234 12345
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 12 123 1234 12345 1234 123 12 1
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1 ; i<=n-1 ; i--) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//   (     3) (   23) (  123) �� ���� ��� ��ø2��
		for(int i=n ; i<=n/2 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}
		// ��Ī
		for(int i=n ; i<=n/2+1 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}		for(int i=n ; i<=n ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("  ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
			System.out.println(j + " ");
			}
			System.out.println();
		}
		
		//* �ﰢ��  ù ����4 ��1 2: ��3 ��1 ��1 ��1 
		for(int i=1 ; i<=n-1 ; i++ ) {
			System.out.print(" ");
			}
		System.out.println("*"); //ù°��
		
		for(int i=1 ; i<=n-2 ; i++) {  //�ι�°��~~�غ� �ϳ� ��
			for(int j =1 ; j<=n-1-i ; j++)
				System.out.println(" ");
			System.out.println("*");
			for(int j=1 ; j<=i*2-1 ; j++)
				System.out.println(" ");
			System.out.println("*");
		}
		for(int i=1 ; i<=n*2-1 ; i++)
			System.out.println("*"); //�ﰢ�� �غ�
		
	}

}
