import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 거주도시, 성별을 띄어쓰기로 구분하여 입력하세요. ");
		
		String name = sc.next();
		int age = sc.nextInt();
		String city = sc.next(); //nextLine 쓰면 거주도시에 서울 여성이 들어가서 ㄴㄴ
		String gender = sc.next();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("거주도시: " + city);
		System.out.println("성별: " + gender);
		
		sc.close();
	}
}
