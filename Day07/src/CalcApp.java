class Calc {
	char op; // operator 연산자 
	
	public Calc(char op) {
		this.op = op;
	}
	
	public Calc() {
		this('+');
	}
	
	public int getSum(int a, int b) {
		int sum;
		sum = a+b;
		return sum;  
	}
	
	public int getSum(int a, int b, int c) { //오버로딩: 이름은 같은데 매개변수만 다르다
		int sum;
		sum = a+b+c;
		return sum;
	}
//	public double getSum(int a, int b) {
//		double sum;
//		sum = (double) a+b;
//		return sum;
//	}
	
	public int getDiff(int a, int b) {
		int diff;
		diff = a - b;
		return diff;
	}
	
	public int getAns(int a, int b) {
		switch(this.op) {
			case '+':
				return getSum(a, b);
			case '-':
				return getDiff(a, b);
			default:
				return 0;
		}
	}
}
public class CalcApp {
	static void changeVal(int a) {//changeVal 스코프에만 쓰이는 a
		a = 2;
	}
	static void changeRef(Calc c1) {
		c1.op = '-';
	}
	
	public static void main(String[] args) {
		Calc c = new Calc(); 
		int a = 5;  // main 스코프에서만 쓰이는 a
		int b = 3;
		int d = 7;
		System.out.println(c.getAns(a,  b));
		changeVal(a);		// Call By Value
		System.out.println(c.getAns(a,  b));
		changeRef(c);		// Call By Reference 
		System.out.println(c.getAns(a,  b));
			//얘는 바뀜 c는 레퍼런스타입이고 int는 기본형. 값복사가 아니라 주소만 넘어감
		System.out.println(c.getSum(a, b));
		System.out.println(c.getSum(a, b, d));
	}

}
