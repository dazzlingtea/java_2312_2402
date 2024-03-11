import test.AccessEx2;


class Sample {
	public int a; //누구나
	private int b; // 같은 클래스
	int c; //디폴트 같은 패키지
	//protected 같은 패키지 + 다른 패키지 나를 상속받은 클래스
	protected int d;
}

class Sample2 extends AccessEx2 {
    void f() {
        a = 1;
        // b = 2;
        // c = 3;
        d = 4;
//protected 조건 중 다른 패키지에서 상속받은 경우는 부모 클래스의 멤버 변수에 바로 접근할 경우에만 해당합니다.
//자식 클래스 내에서 부모 클래스 멤버 변수에 바로 접근하는 것이 아니라 부모 클래스의 객체를 생성하여 접근 하는 경우에는 
//protected의 조건에 해당하지 않아 컴파일 오류가 발생합니다.
    }
}


public class AccessEx {

	public static void main(String[] args) {
		Sample s = new Sample(); 
		s.a = 1;
		//s.b = 2; 에러; 지금 이건 AccessEx 클래스에 있어서 같은 클래스가 아님
		s.c = 3;

		AccessEx2 t = new AccessEx2(); // 다른 패키지
		t.a = 1;
		// t.b = 2; 아예 패키지도 다름
		// t.c = 3; 다른 패키지
		// t.d = 4; 다른 패키지인데 상속이 아님
		
	}

}
