
public class Practice02 {
	public static void main(String[] args) {

		// �����÷ο� ����÷ο�
		int a = 1000;
		int b = -300;
		int c = -1000;
		byte b1 = (byte) a;
		byte b2 = (byte) b;
		byte b3 = (byte) c;
		System.out.println(a + ", " + b1 + ", " + b + ", " + b2 + ", " + c + ", " + b3);

		// ���������� ���� ����

		int i = 5, j = 0;

		j = i++; // �������� ���Կ�����= ���� ���� �� ���� ����
		System.out.println("i++ ���� �� i=" + i + "j=" + j);

		i = 5;
		j = 0;

		j = ++i;

		System.out.println("++i ���� �� i=" + i + "j=" + j);
		// -2:x=x ���� �� 'x++' ++, '++x' ++�� (++++x) �ż� 10-12
		int x = 10;
		x = x++ - ++x;
		System.out.println(x);

	}
}
