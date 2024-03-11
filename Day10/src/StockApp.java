import java.util.*;

class Stock {
	private String id, name; //필드 선언
	private double 전일종가;
	private double 당일시가;
	
	Stock(String id, String name) {
		this.id = id;
		this.name = name;
	}
	double getPreviousClosingPrice() {
		return this.전일종가;
	}
	double getCurrentPrice() {
		return this.당일시가;
	}
	void setPreviousClosingPrice(double 전일종가) {
		this.전일종가 = 전일종가;
	}
	void setCurrentPrice(double 당일시가) {
		this.당일시가 = 당일시가;
	}
	double getChangePercent() {
		return (this.당일시가 - this.전일종가) / this.전일종가;
	}
}


public class StockApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Stock stock = new Stock(sc.nextLine(), sc.nextLine());
        stock.setPreviousClosingPrice(sc.nextDouble());
        stock.setCurrentPrice(sc.nextDouble());

        System.out.printf("Prev Price: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("Curr Price: %.2f\n", stock.getCurrentPrice());
        System.out.printf("Price Change: %.2f%%\n", stock.getChangePercent() * 100);
    }
}