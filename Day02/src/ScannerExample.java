import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� > "); //println�� �ٹٲ�
		String name = sc.nextLine();
		System.out.println("�̸��� " + name);
		
		System.out.print("���̸� �Է��ϼ��� > ");
		int age = sc.nextInt();
		System.out.println("���̴� " + age);
		
		System.out.print("Ű�� �Է��ϼ��� > ");
		double height = sc.nextDouble();
		System.out.println("Ű�� " +  height + "cm");
		
		System.out.print("��ȥ ���θ� �Է��ϼ��� > ");
		boolean marry = sc.nextBoolean();
		System.out.println("��ȥ ���δ� " + marry);
		
		sc.close(); //����Ǿ �ֿܼ� �ԷºҰ�
	}
}
