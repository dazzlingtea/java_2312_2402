class D {
	public D() {
		System.out.println("������ D ȣ��");
	}
	public D(int x) {
		System.out.println("D" + x);
	}
}
class E extends D {
	public E() {
		System.out.println("������ E ȣ��");
	}
	public E(int x) {
		super(x); //�ݵ�� ù �ٿ�, �θ� ���� ���ߵǴϱ�
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
