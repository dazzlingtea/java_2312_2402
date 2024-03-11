import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 > "); //println은 줄바꿈
		String name = sc.nextLine();
		System.out.println("이름은 " + name);
		
		System.out.print("나이를 입력하세요 > ");
		int age = sc.nextInt();
		System.out.println("나이는 " + age);
		
		System.out.print("키를 입력하세요 > ");
		double height = sc.nextDouble();
		System.out.println("키는 " +  height + "cm");
		
		System.out.print("결혼 여부를 입력하세요 > ");
		boolean marry = sc.nextBoolean();
		System.out.println("결혼 여부는 " + marry);
		
		sc.close(); //종료되어서 콘솔에 입력불가
	}
}
