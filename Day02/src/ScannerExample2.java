import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ���ֵ���, ������ ����� �����Ͽ� �Է��ϼ���. ");
		
		String name = sc.next();
		int age = sc.nextInt();
		String city = sc.next(); //nextLine ���� ���ֵ��ÿ� ���� ������ ���� ����
		String gender = sc.next();
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("���ֵ���: " + city);
		System.out.println("����: " + gender);
		
		sc.close();
	}
}
