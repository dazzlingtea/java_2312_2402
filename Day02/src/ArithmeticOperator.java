
public class ArithmeticOperator {

	public static void main(String[] args) {
		double a = 10;  //double 쓰면 모두 double되니까 아래 int는 전부 double
		int b = 20;
		
		double ad = a + b; //30
		double sub = a - b; // -10
		double mul = a * b; //200
		double div = a / b; //0.5가 int로 캐스팅 되어서 0
		double rem = a % b; //10
		
		System.out.println(ad);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		
				
	}

}
