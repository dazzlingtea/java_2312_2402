
class A {
	public A() {
		System.out.println("������ A ȣ��");
	}
}
class B extends A { 
	public B() {
		System.out.println("������ B ȣ��");
	}
}
class C extends B { 
	public C() {
		System.out.println("������ C ȣ��");
	}
}


public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C();

	}

}
