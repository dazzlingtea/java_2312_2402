class Coffee {
	int price;
	String item;
	
	void show() {
		System.out.println(item + " " + price + "��");
	}
	
	public Coffee() {
		this.price = 0; //this(0, "�޴�����"); �� �ٷ� ���� �� ����
		this.item = "�޴�����";
		System.out.println("Ŀ�� ������ ȣ��!");
	}
	public Coffee(String item) {
		this.price= 0;   //this(0, item); �� �ٷ� ���� �� ����
		this.item = item;
	}
	
	public Coffee(int price, String item) {
		this.price = price;
		this.item = item;
	}
	
	
}
public class CoffeeApp {

	public static void main(String[] args) {
		Coffee c1 = new Coffee(2000, "�Ƹ޸�ī��"); 
		Coffee c2 = new Coffee("ī���");
		Coffee c3 = new Coffee(); 
		Coffee c4 = c1;
		
		c1.show();
		c2.show();
		c3.show();
		c4.show();
		
		c4.item = "����������"; //���� ����Ǵ°� �ƴ϶� �ּҰ� ����
		c1.show(); //Coffee ���۷��������� c4 �ٲٸ� c1�� �ٲ�
		c4.show();
		
	}

}
