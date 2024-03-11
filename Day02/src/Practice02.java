
public class Practice02 {
	public static void main(String[] args) {

		// 오버플로우 언더플로우
		int a = 1000;
		int b = -300;
		int c = -1000;
		byte b1 = (byte) a;
		byte b2 = (byte) b;
		byte b3 = (byte) c;
		System.out.println(a + ", " + b1 + ", " + b + ", " + b2 + ", " + c + ", " + b3);

		// 증감연산자 전위 후위

		int i = 5, j = 0;

		j = i++; // 후위형은 대입연산자= 먼저 실행 후 값을 증가
		System.out.println("i++ 실행 후 i=" + i + "j=" + j);

		i = 5;
		j = 0;

		j = ++i;

		System.out.println("++i 실행 후 i=" + i + "j=" + j);
		// -2:x=x 대입 후 'x++' ++, '++x' ++로 (++++x) 돼서 10-12
		int x = 10;
		x = x++ - ++x;
		System.out.println(x);

	}
}
