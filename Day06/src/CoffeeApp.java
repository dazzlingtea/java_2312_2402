class Coffee {
	int price;
	String item;
	
	void show() {
		System.out.println(item + " " + price + "원");
	}
	
	public Coffee() {
		this.price = 0; //this(0, "메뉴없음"); 한 줄로 줄일 수 있음
		this.item = "메뉴없음";
		System.out.println("커피 생성자 호출!");
	}
	public Coffee(String item) {
		this.price= 0;   //this(0, item); 한 줄로 줄일 수 있음
		this.item = item;
	}
	
	public Coffee(int price, String item) {
		this.price = price;
		this.item = item;
	}
	
	
}
public class CoffeeApp {

	public static void main(String[] args) {
		Coffee c1 = new Coffee(2000, "아메리카노"); 
		Coffee c2 = new Coffee("카페라떼");
		Coffee c3 = new Coffee(); 
		Coffee c4 = c1;
		
		c1.show();
		c2.show();
		c3.show();
		c4.show();
		
		c4.item = "에스프레소"; //값이 복사되는게 아니라 주소가 복사
		c1.show(); //Coffee 레퍼런스변수라 c4 바꾸면 c1도 바뀜
		c4.show();
		
	}

}
