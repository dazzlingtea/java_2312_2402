import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String fruit = sc.next();
		
		//switch-case
		int price1;
		switch(fruit) {
			case "����":
			case "���":
				price1 = 10000;
				break;
			case "��":
			case "����":
				price1 = 15000;
				break;
			case "����":
				price1 = 20000;
				break;
			default:
				price1 = 0;
		}
		
		//�ܼ�if��
		int price2 = 0;
		if(fruit.equals("����") || fruit.equals("���")) 
			price2 = 10000;
		if(fruit.equals("��") || fruit.equals("����")) 
			price2 = 15000;
		if(fruit.equals("����")) 
			price2 = 20000;
		
		//if-else if-else
		int price3;
		if(fruit.equals("����") || fruit.equals("���")) 
			price3 = 10000;
		else if(fruit.equals("��") || fruit.equals("����")) 
			price3 = 15000;
		else if(fruit.equals("����")) 
			price3 = 20000;
		else 
			price3 = 0;
		
		System.out.println(price1);
		System.out.println(price2);
		System.out.println(price3);		
		
	}

}
