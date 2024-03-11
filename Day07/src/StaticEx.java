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
	void f1(int x) { // non-static 메소드 -> non-static 필드 (o)
		n = x;
	}
	void f2(int x) { // non-static 메소드 -> static 필드 (o)
		m = x; 
	}
	
	static void s1(int x) { // static 메소드 -> non-static 필드 (x)
		// n = x;
	}
	static void s2(int x) { // static 메소드 -> non-static 메소드 (x)
		// f1(x);
	}
	static void s3(int x) { // static 메소드 -> static 필드 (o)
		m = x;
	}
	static void s4(int x) { // static 메소드 -> static 메소드 (o)
		s3(x);
	}
}

class StaticThis {
	int n;
	static int m;
	void f1(int n) {
		this.n = n;
	}
	void f2(int m) { //non-static 메소드 -> static 필드 (세모) 나중에 생긴게 먼저 생긴걸 접근하니까.
		this.m = m; //StaticThis.m = m; static way
	}
	static void s1(int n) { // static 메소드 -> non-static 필드 (x)
		//this.n = n;
	}
	static void s2(int m) { // static 메소드 -> static 필드 (x) 
		//this.m = m;  static에서 this X 객체 없어서 객체에서 가져오는 this 안 됨
	}
}


public class StaticEx {

	public static void main(String[] args) {
		StaticSample s1, s2; // 선언만 함 static 멤버 m과 f()가 생성
		s1 = new StaticSample(); // s1 객체 생성
		s1.n = 5; //일반 멤버
		s1.g(); // 일반메소드라 m = 20
		//s1.m = 50; // m = 50    -->m은 static 변수니까 이렇게 바로 접근하면 안되고 클래스 이름 써라
		StaticSample.m = 50;
		s2 = new StaticSample();
		System.out.println(s2.m); //50 출력 ->static은 같은 클래스면 값을 공유
		s2.n = 8; // 일반 멤버
		s2.h();
		System.out.println(s2.m);
		System.out.println(s1.m); // 공용이라 얘도 바뀜
		s1.f(); 
		System.out.println(s1.m); // m = 5

	}

}
