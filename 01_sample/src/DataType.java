
public class DataType {
	public static void main(String[] args) {
		// �⺻ Ÿ��
		// �� Ÿ��
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	
		// ���� Ÿ��
		char c1 = 'a';
		char c2 = '��';
		String c3 = "Hello";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// ���� Ÿ��
		byte b3 = 100; //-128 ~ 127
		short s1 = 32000; //-32768 ~ 32768
		int i1 = 2100000000; // �� -21�� ~ 21��
		long l1 = 922000000000000L; // �� -922�� ~ 922�� 0 12�� L(���ͷ���)������ ����
		System.out.println(b3);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		// �Ǽ� Ÿ��
		float f1 = 3.14F; // ��ó�� �Ǽ� �⺻���� �����̶� F �ʿ�
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		// ���� ���ͷ�
		// 10����
		int i2 =15;
		System.out.println(i2);
		// 2���� : 0 �� 1
		int i3 = 0b101; // 0b�� �տ� ���δ�
		System.out.println(i3);
		// 8���� : 0~7
		int i4 = 017; // 017 8+7=15
		System.out.println(i4);
		// 16���� : 0~9 + A~F
		int i5 = 0x25;
		int i6 = 0x1a; // a�� �ҹ��ڸ� x�� �ҹ���
		System.out.println(i5);
		System.out.println(i6);
		int i7 = 0X1A;
		System.out.println(i7);
	}
}
