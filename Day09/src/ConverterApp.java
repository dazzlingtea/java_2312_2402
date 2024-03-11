import java.util.Scanner;

abstract class Converter {
	
	abstract protected double convert(double src); // 변환기 
	abstract protected String getSrcString(); // 출발의 이름 getter
	abstract protected String getDestString(); // 도착의 이름 getter
	protected double ratio; // 비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print(getSrcString() + "을");
		System.out.print(getDestString());
		System.out.print(getSrcString() + " 값을 입력 > ");
		double original = sc.nextDouble();
		double changed = convert(original);
		System.out.println("변환 결과: "+changed + " " + getDestString());
	}
}

// USD -> KRW
// KRW 값을 입력 > 2600
// 변환 결과 : 2 USD

// KM -< MILE
// KM 값을 입력 > 1
// 변환 결과: 0.6214 MILE

class WonDollar extends Converter {
	public WonDollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	} // 변환기 
	protected String getSrcString() {return "USD";} // 출발의 이름 getter
	protected String getDestString() {return "KRW";} // 도착의 이름 getter
	
}

class KmMile extends Converter {
	public KmMile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	} // 변환기 
	protected String getSrcString() {return "KM";} // 출발의 이름 getter
	protected String getDestString() {return "MILE";} // 도착의 이름 getter
}


public class ConverterApp {
	public static void main(String[] args) {
		WonDollar c1 = new WonDollar(1300);
		c1.run();
		
		KmMile c2 = new KmMile(0.6214);
		c2.run();

	}

}
