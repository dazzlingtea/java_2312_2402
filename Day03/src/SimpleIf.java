import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� > ");
		int num = sc.nextInt();
		String result = "Ȧ��";
		
		if(num % 2 == 0) {
			result = "¦��";
		}
		System.out.println(result);
		
		String result2 = num % 2 == 0? "¦��":"Ȧ��";
		System.out.println(result2);
	}

}
