import java.util.Scanner;
// 1달러 1300원
class Currency {
	private double rate;
	private String name;
	
	Currency() {
		System.out.println("오류!"); //발생할 수 있는 일에 대응해놓아야 함
	}
	
	Currency(double rate, String name) { //생성자는 퍼블릭? 안 써도 됨
		this.rate = rate;
		this.name = name;
	}
	
	public double toKRW(double money) {
		return money * getRate(); //return money * this.rate;도 코드의 중복으로 봄
	}
	public double toTarget(double krw) {
		return krw / getRate();
	}
	//private한 변수를 다룰 때 (수정=setter/가져오기=getter) 이 둘의 접근지정자는 디폴트나 프로텍티드
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
