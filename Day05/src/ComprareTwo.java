import java.util.Scanner;
public class ComprareTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// �� ���� ���Ͽ� ù��° ���� ũ�� yes �׿ܴ� no, �Ѵ� 0�̸� ���α׷� ����
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a!=0 || b!=0) { //�Ѵ� 0�� �ƴҶ� �ݺ� while(!(a == 0 && b == 0)) ��ü�� !�Ŵ� ���� ����
			if(a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			a = sc.nextInt();  // ���� �Է� �޾ƾ� ��!!!
			b = sc.nextInt();
		}
		
		//do while
		do {
			if(a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			a = sc.nextInt();  // ���� �Է� �޾ƾ� ��!!!
			b = sc.nextInt();
		} while(!(a == 0 && b == 0));
		
	}

}
