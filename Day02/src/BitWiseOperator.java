
public class BitWiseOperator {
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a); //�� 6�ƴ�? int���� 4����Ʈ
		
		System.out.println(9 >> 2); // 1001 ������ 2���� ������� 10
		System.out.println(9 << 2); // 100100
		System.out.println(9 >>> 2); // 10
		
		System.out.println(-10 >> 2); // 
		System.out.println(-10 << 2); // 
		System.out.println(-10 >>> 2); //
	}
}
