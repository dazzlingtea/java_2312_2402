import java.util.Scanner;

abstract class Converter2 {
	abstract protected double convert(double src); // 변환기
	abstract protected String getSrcString(); // 출발의 이름 getter
	abstract protected String getDestString(); // 도착의 이름 getter
	protected double ratio; // 비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print(getSrcString() + " -> ");
		System.out.println(getDestString());
		System.out.print(getSrcString() + " 값을 입력 > ");
		double original = sc.nextDouble();
		double changed = convert(original);
		System.out.println("변환 결과: " + changed + " " + getDestString());
	}
}
//USD -> KRW
//USD 값을 입력 > 2
//변환 결과: 2600 KRW
class WonDollar2 extends Converter2 {
	public WonDollar2(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	}
	protected String getSrcString() {return "USD";}
	protected String getDestString() {return "KRW";}
}

//KM -> MILE
//KM 값을 입력 > 1
//변환 결과: 0.6214 MILE
class KmMile2 extends Converter {
	public KmMile2(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	}
	protected String getSrcString() {return "KM";}
	protected String getDestString() {return "MILE";}
}


public class ConverterApp2 {
	public static void main(String[] args) {
		WonDollar2 c1 = new WonDollar2(1300);
		c1.run();
		
		KmMile2 c2 = new KmMile2(0.6214);
		c2.run();
	}
}