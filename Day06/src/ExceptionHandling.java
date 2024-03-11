import java.util.Scanner;
import java.util.InputMismatchException; //��ǲ�̽���ġ ���� ���ؼ�
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			System.out.print("�������� �Է��ϼ��� > "); Arithmetic�� �� �� �̰͵� ��� ����
//			int dividend = sc.nextInt();
//			System.out.print("�������� �Է��ϼ��� > ");
//			int divisor = sc.nextInt();
			try {
				System.out.print("�������� �Է��ϼ��� > "); //�Է�mismatch���� ���ؼ�
				int dividend = sc.nextInt();
				System.out.print("�������� �Է��ϼ��� > ");
				int divisor = sc.nextInt();
				int answer = dividend / divisor;
				System.out.println("����� " + answer);
				break;
			}
			catch(ArithmeticException e) { //e exception�� ���Ӹ�
				System.out.println(e);
				System.out.println("0���� ���� �� �����ϴ�!");
			}
			catch(InputMismatchException e) { //���� import ����ߵ�
				sc = new Scanner(System.in);
				System.out.println(e);
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�."); //���Ͱ� ���°ſ� �������...
			}
		}
		
	}

}
