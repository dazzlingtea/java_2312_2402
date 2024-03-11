
abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double average(int[] a);
}

class Calc extends Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public double average(int[] a) {
		double sum = 0;
		for(int i: a) 
			sum += i;
		return sum / a.length;
	}
}


public class CalcApp {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(5, 3));
		System.out.println(c.average(new int[] {4, 5, 6}));

	}

}
