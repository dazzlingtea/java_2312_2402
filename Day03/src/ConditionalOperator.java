import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = 10;
		b = ++b>10 && b<12 ? b++ : --b;
		// true true
		//   true   -> b++  
		System.out.println(b);
		
		int score = sc.nextInt();
		// score  80 �̻��̸� '���', �ƴϸ� '�����'
		String pass = score >= 80?"���":"�����";
		System.out.println(pass);
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		// �� ���� ����(����)���� ��� -> ������ ���� -�� ����
		int result = (i1 - i2)>0 ? i1-i2 : i2-i1;
		System.out.println(result);
		
	}

}
