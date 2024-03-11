class StaticSample {
	public int n;
	public static int m;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public void f() {
		m = 5;
	}
}

class StaticClass {
	int n;
	static int m;
	void f1(int x) { // non-static �޼ҵ� -> non-static �ʵ� (o)
		n = x;
	}
	void f2(int x) { // non-static �޼ҵ� -> static �ʵ� (o)
		m = x; 
	}
	
	static void s1(int x) { // static �޼ҵ� -> non-static �ʵ� (x)
		// n = x;
	}
	static void s2(int x) { // static �޼ҵ� -> non-static �޼ҵ� (x)
		// f1(x);
	}
	static void s3(int x) { // static �޼ҵ� -> static �ʵ� (o)
		m = x;
	}
	static void s4(int x) { // static �޼ҵ� -> static �޼ҵ� (o)
		s3(x);
	}
}

class StaticThis {
	int n;
	static int m;
	void f1(int n) {
		this.n = n;
	}
	void f2(int m) { //non-static �޼ҵ� -> static �ʵ� (����) ���߿� ����� ���� ����� �����ϴϱ�.
		this.m = m; //StaticThis.m = m; static way
	}
	static void s1(int n) { // static �޼ҵ� -> non-static �ʵ� (x)
		//this.n = n;
	}
	static void s2(int m) { // static �޼ҵ� -> static �ʵ� (x) 
		//this.m = m;  static���� this X ��ü ��� ��ü���� �������� this �� ��
	}
}


public class StaticEx {

	public static void main(String[] args) {
		StaticSample s1, s2; // ���� �� static ��� m�� f()�� ����
		s1 = new StaticSample(); // s1 ��ü ����
		s1.n = 5; //�Ϲ� ���
		s1.g(); // �Ϲݸ޼ҵ�� m = 20
		//s1.m = 50; // m = 50    -->m�� static �����ϱ� �̷��� �ٷ� �����ϸ� �ȵǰ� Ŭ���� �̸� ���
		StaticSample.m = 50;
		s2 = new StaticSample();
		System.out.println(s2.m); //50 ��� ->static�� ���� Ŭ������ ���� ����
		s2.n = 8; // �Ϲ� ���
		s2.h();
		System.out.println(s2.m);
		System.out.println(s1.m); // �����̶� �굵 �ٲ�
		s1.f(); 
		System.out.println(s1.m); // m = 5

	}

}
