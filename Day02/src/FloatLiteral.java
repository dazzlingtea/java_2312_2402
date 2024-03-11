
public class FloatLiteral {
	public static void main(String[] args) {
		float f = 3.14F;
		double d = 3.14D;
		
		double e1 = 0.000000001234;
		double e2 = 0.1234E-8;
		System.out.println(e1);
		System.out.println(e2);
		
		double e3 = 4567.890000;
		double e4 =4.56789E+3;
		System.out.println(e3);
		System.out.println(e4);
		
		char c1 = '가';
		char c2 = '\uac00';
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("Hello\nJava\tHi\bProgram\\\"\'");
		
		final double PI = 3.14;
		// PI = 5.55; -> 상수는 바꿀 수 없다
		
	}
}
