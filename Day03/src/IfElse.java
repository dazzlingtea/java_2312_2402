import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� (1901~2100)> ");
		int year = sc.nextInt();
		
		if(year >= 2001) {
			System.out.println("21���� �Դϴ�.");
		}
		else {
			System.out.println("20���� �Դϴ�.");
		}
		
		System.out.println(year >= 2001 ? "21����":"20����2");
		
	}

}
