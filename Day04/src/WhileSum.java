import java.util.Scanner;
public class WhileSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		//������ ��� �Է¹��� 
		//-1�� �Է¹����� �ݺ��� ����Ǹ鼭 �Է¹��� ������ ���� ���� ���
		//while������
		int num = sc.nextInt();
		while(num != -1) {
			count++;
			sum += num;
			num = sc.nextInt(); //�̰� ������ ����
		}
		System.out.println("Ƚ��: " + count + " ��: " + sum );
		
		//do-while
		count = 0;
		sum = 0;
		do {
			num = sc.nextInt();
			if(num != -1) {   //�̰� ������ ó���� -1 �Էµ��� �� �ȵǴϱ�, �Է� �� �����̴ϱ� sc����
				count++;
				sum += num;
			}
		} while(num != -1);
		System.out.println("Ƚ��: " + count + "��: " + sum );
		
	}

}
