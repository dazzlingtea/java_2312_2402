import java.util.Scanner;
public class ContinueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//������� �ո� ����
		//������ ������ skip
		//0�� ������ ���� -->�ݺ�Ƚ���� �������� �ƴϴ� ���� �ο���
		int sum = 0;
		int n = -1;
		while(n != 0) {
			n = sc.nextInt();
			if(n <= 0) //�� ����? 0�϶��� ���ǽ����� ���ϱ� ��Ƽ���� �� ���ǽĿ��� ����
				continue;
			else
				sum += n;
		}
		System.out.println(sum);
		
	}

}
