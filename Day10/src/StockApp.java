import java.util.*;

class Stock {
	private String id, name; //�ʵ� ����
	private double ��������;
	private double ���Ͻð�;
	
	Stock(String id, String name) {
		this.id = id;
		this.name = name;
	}
	double getPreviousClosingPrice() {
		return this.��������;
	}
	double getCurrentPrice() {
		return this.���Ͻð�;
	}
	void setPreviousClosingPrice(double ��������) {
		this.�������� = ��������;
	}
	void setCurrentPrice(double ���Ͻð�) {
		this.���Ͻð� = ���Ͻð�;
	}
	double getChangePercent() {
		return (this.���Ͻð� - this.��������) / this.��������;
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