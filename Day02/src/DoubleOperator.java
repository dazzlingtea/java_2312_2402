
public class DoubleOperator {
	public static void main(String[] args) {
		int a = 1;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		int b = 1;
		System.out.println(++b); //2
		System.out.println(--b); //2-1
		
		System.out.println(b++); //1 ��1? b++���� ���� �����ϰ� 1�� ���ض�
		System.out.println(b); //2 ���⿡���� +1 �ż� 2
		
		System.out.println(--b+b++); // 1 -> (1) + 1 -> (2) = 2
	//���� �ۿ��Ϸ��� �����̳� �޼ҵ忡�� ���ž� ��
		System.out.println(b+++--b); // 2 -> (3) + 2 -> (2) = 4
	//1���� ���������� ������ 2�ǰ� 2���� ���������� +1-1�� 2�Ȱ� 3���� ���������+ �����ؼ� 2+2
	}
}
