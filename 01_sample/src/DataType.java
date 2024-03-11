
public class DataType {
	public static void main(String[] args) {
		// 기본 타입
		// 논리 타입
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	
		// 문자 타입
		char c1 = 'a';
		char c2 = '가';
		String c3 = "Hello";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// 정수 타입
		byte b3 = 100; //-128 ~ 127
		short s1 = 32000; //-32768 ~ 32768
		int i1 = 2100000000; // 약 -21억 ~ 21억
		long l1 = 922000000000000L; // 약 -922경 ~ 922경 0 12개 L(리터러리)없으면 오류
		System.out.println(b3);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		// 실수 타입
		float f1 = 3.14F; // 롱처럼 실수 기본형은 더블이라서 F 필요
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		// 정수 리터럴
		// 10진수
		int i2 =15;
		System.out.println(i2);
		// 2진수 : 0 과 1
		int i3 = 0b101; // 0b를 앞에 붙인다
		System.out.println(i3);
		// 8진수 : 0~7
		int i4 = 017; // 017 8+7=15
		System.out.println(i4);
		// 16진수 : 0~9 + A~F
		int i5 = 0x25;
		int i6 = 0x1a; // a가 소문자면 x도 소문자
		System.out.println(i5);
		System.out.println(i6);
		int i7 = 0X1A;
		System.out.println(i7);
	}
}
