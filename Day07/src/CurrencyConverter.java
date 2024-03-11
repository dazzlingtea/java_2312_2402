import java.util.Scanner;
// 1�޷� 1300��
class Currency {
	private double rate;
	private String name;
	
	Currency() {
		System.out.println("����!"); //�߻��� �� �ִ� �Ͽ� �����س��ƾ� ��
	}
	
	Currency(double rate, String name) { //�����ڴ� �ۺ�? �� �ᵵ ��
		this.rate = rate;
		this.name = name;
	}
	
	public double toKRW(double money) {
		return money * getRate(); //return money * this.rate;�� �ڵ��� �ߺ����� ��
	}
	public double toTarget(double krw) {
		return krw / getRate();
	}
	//private�� ������ �ٷ� �� (����=setter/��������=getter) �� ���� ���������ڴ� ����Ʈ�� ������Ƽ��
	protected void setRate(double rate) {
		this.rate = rate;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return this.rate;
	}
	public String getName() {
		return this.name;
	}

}


public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names[] = {"USD", "JPY","CNY"};
		double rates[] = {1297.28, 9.14, 181.99};
		Currency c[] = new Currency[3];
		for(int i=0; i<c.length; i++) {
			c[i] = new Currency(rates[i], names[i]);
			
		}
		double inputKrw = sc.nextDouble();
		String inputCurrency = sc.next();
		for(Currency cur : c) {
			if(cur.getName().equals(inputCurrency)) {
				System.out.println(cur.toTarget(inputKrw)+inputCurrency);
			}
		}
		
		
	}
}
