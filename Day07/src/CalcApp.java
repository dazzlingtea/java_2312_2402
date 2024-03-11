class Calc {
	char op; // operator ������ 
	
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
	
	public int getSum(int a, int b, int c) { //�����ε�: �̸��� ������ �Ű������� �ٸ���
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
	static void changeVal(int a) {//changeVal ���������� ���̴� a
		a = 2;
	}
	static void changeRef(Calc c1) {
		c1.op = '-';
	}
	
	public static void main(String[] args) {
		Calc c = new Calc(); 
		int a = 5;  // main ������������ ���̴� a
		int b = 3;
		int d = 7;
		System.out.println(c.getAns(a,  b));
		changeVal(a);		// Call By Value
		System.out.println(c.getAns(a,  b));
		changeRef(c);		// Call By Reference 
		System.out.println(c.getAns(a,  b));
			//��� �ٲ� c�� ���۷���Ÿ���̰� int�� �⺻��. �����簡 �ƴ϶� �ּҸ� �Ѿ
		System.out.println(c.getSum(a, b));
		System.out.println(c.getSum(a, b, d));
	}

}
