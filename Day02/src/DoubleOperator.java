
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
		
		System.out.println(b++); //1 왜1? b++뜻은 먼저 실행하고 1을 더해라
		System.out.println(b); //2 여기에서야 +1 돼서 2
		
		System.out.println(--b+b++); // 1 -> (1) + 1 -> (2) = 2
	//후위 작용하려면 수식이나 메소드에서 사용돼야 함
		System.out.println(b+++--b); // 2 -> (3) + 2 -> (2) = 4
	//1순위 증감연산자 후위라 2되고 2순위 증감전위로 +1-1로 2된걸 3순위 산술연산자+ 적용해서 2+2
	}
}
