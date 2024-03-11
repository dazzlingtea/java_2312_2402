
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 20;
		// short b = a;
		
		short a = 20;
		int b = a; // 큰거에 작은걸 넣어야 타입변환 가능

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
		
		//boolean r = true; 불린은 커도 타입변환 안 됨
		//int s =r;
		
		int i1 = 300;
		byte b1 = (byte)i1; //앞괄호에 쓰는게 강제 형 변환 300은 127보다 큰데? byte -128+173=44
		System.out.println(i1);
		System.out.println(b1);
		
		int i2 = 32768;
		short s1 = (short)i2;
		//- 다시 반복이 오버플로우 현상
		System.out.println(i2);
		System.out.println(s1);
		
		int i3 = -129;
		byte b2 = (byte)i3;
		// 언더플로우 현상
		System.out.println(i3);
		System.out.println(b2);
		
		double d1 = 3.14;
		int i4 = (int)d1;
		// 실수에서 정수가 된다 : 소수점에 대한 손실
		System.out.println(i4);
		
		byte b5 = 127;
		int i5 = 100;
		System.out.println(b5 + i5);
		System.out.println((byte)(b5 + i5));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((char)0x11110041);
		System.out.println(10.0/4);
		System.out.println(10/4); //인트라서 2.5에서 0.5탈락
				
		
		
		
	}

}
