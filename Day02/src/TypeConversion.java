
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 20;
		// short b = a;
		
		short a = 20;
		int b = a; // ū�ſ� ������ �־�� Ÿ�Ժ�ȯ ����

		float c = 3.14f;
		double d = c;
		
		//float c = 3.14f;
		//double d = c;
		
		int h = 300;
		double i = h;
		
		int j = 400;
		float k = j;
		
		long l = 10L;
		double m = l;
		
		long n = 10L;
		float o = n;
		
		char p = 'a';
		int q = p;
		System.out.println(p);
		System.out.println(q);
		
		//boolean r = true; �Ҹ��� Ŀ�� Ÿ�Ժ�ȯ �� ��
		//int s =r;
		
		int i1 = 300;
		byte b1 = (byte)i1; //�հ�ȣ�� ���°� ���� �� ��ȯ 300�� 127���� ū��? byte -128+173=44
		System.out.println(i1);
		System.out.println(b1);
		
		int i2 = 32768;
		short s1 = (short)i2;
		//- �ٽ� �ݺ��� �����÷ο� ����
		System.out.println(i2);
		System.out.println(s1);
		
		int i3 = -129;
		byte b2 = (byte)i3;
		// ����÷ο� ����
		System.out.println(i3);
		System.out.println(b2);
		
		double d1 = 3.14;
		int i4 = (int)d1;
		// �Ǽ����� ������ �ȴ� : �Ҽ����� ���� �ս�
		System.out.println(i4);
		
		byte b5 = 127;
		int i5 = 100;
		System.out.println(b5 + i5);
		System.out.println((byte)(b5 + i5));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((char)0x11110041);
		System.out.println(10.0/4);
		System.out.println(10/4); //��Ʈ�� 2.5���� 0.5Ż��
				
		
		
		
	}

}
