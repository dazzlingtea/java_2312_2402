import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String fruit = sc.next();
		
		//switch-case
		int price1;
		switch(fruit) {
			case "딸기":
			case "사과":
				price1 = 10000;
				break;
			case "배":
			case "수박":
				price1 = 15000;
				break;
			case "레몬":
				price1 = 20000;
				break;
			default:
				price1 = 0;
		}
		
		//단순if문
		int price2 = 0;
		if(fruit.equals("딸기") || fruit.equals("사과")) 
			price2 = 10000;
		if(fruit.equals("배") || fruit.equals("수박")) 
			price2 = 15000;
		if(fruit.equals("레몬")) 
			price2 = 20000;
		
		//if-else if-else
		int price3;
		if(fruit.equals("딸기") || fruit.equals("사과")) 
			price3 = 10000;
		else if(fruit.equals("배") || fruit.equals("수박")) 
			price3 = 15000;
		else if(fruit.equals("레몬")) 
			price3 = 20000;
		else 
			price3 = 0;
		
		System.out.println(price1);
		System.out.println(price2);
		System.out.println(price3);		
		
	}

}
