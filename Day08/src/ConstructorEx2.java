class D {
	public D() {
		System.out.println("생성자 D 호출");
	}
	public D(int x) {
		System.out.println("D" + x);
	}
}
class E extends D {
	public E() {
		System.out.println("생성자 E 호출");
	}
	public E(int x) {
		super(x); //반드시 첫 줄에, 부모에 먼저 가야되니까
		System.out.println("E" + x);
	}
}


public class ConstructorEx2 {

	public static void main(String[] args) {
		E e = new E(5);
		System.out.println("--------");
		E e2 = new E();
	}

}
