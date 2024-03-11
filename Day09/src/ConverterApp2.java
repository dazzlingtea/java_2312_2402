import java.util.Scanner;

abstract class Converter2 {
	abstract protected double convert(double src); // ��ȯ��
	abstract protected String getSrcString(); // ����� �̸� getter
	abstract protected String getDestString(); // ������ �̸� getter
	protected double ratio; // ����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print(getSrcString() + " -> ");
		System.out.println(getDestString());
		System.out.print(getSrcString() + " ���� �Է� > ");
		double original = sc.nextDouble();
		double changed = convert(original);
		System.out.println("��ȯ ���: " + changed + " " + getDestString());
	}
}
//USD -> KRW
//USD ���� �Է� > 2
//��ȯ ���: 2600 KRW
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
//KM ���� �Է� > 1
//��ȯ ���: 0.6214 MILE
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