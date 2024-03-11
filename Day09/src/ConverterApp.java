import java.util.Scanner;

abstract class Converter {
	
	abstract protected double convert(double src); // ��ȯ�� 
	abstract protected String getSrcString(); // ����� �̸� getter
	abstract protected String getDestString(); // ������ �̸� getter
	protected double ratio; // ����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print(getSrcString() + "��");
		System.out.print(getDestString());
		System.out.print(getSrcString() + " ���� �Է� > ");
		double original = sc.nextDouble();
		double changed = convert(original);
		System.out.println("��ȯ ���: "+changed + " " + getDestString());
	}
}

// USD -> KRW
// KRW ���� �Է� > 2600
// ��ȯ ��� : 2 USD

// KM -< MILE
// KM ���� �Է� > 1
// ��ȯ ���: 0.6214 MILE

class WonDollar extends Converter {
	public WonDollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	} // ��ȯ�� 
	protected String getSrcString() {return "USD";} // ����� �̸� getter
	protected String getDestString() {return "KRW";} // ������ �̸� getter
	
}

class KmMile extends Converter {
	public KmMile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src * this.ratio;
	} // ��ȯ�� 
	protected String getSrcString() {return "KM";} // ����� �̸� getter
	protected String getDestString() {return "MILE";} // ������ �̸� getter
}


public class ConverterApp {
	public static void main(String[] args) {
		WonDollar c1 = new WonDollar(1300);
		c1.run();
		
		KmMile c2 = new KmMile(0.6214);
		c2.run();

	}

}
