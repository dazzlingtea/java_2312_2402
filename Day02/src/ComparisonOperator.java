import java.util.Scanner;
public class ComparisonOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력하세요 >");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		boolean b1 = num1 > num2;
		boolean b2 = num1 < num2;
		boolean b3 = num1 >= num2;
		boolean b4 = num1 <= num2;
		boolean b5 = num1 == num2;
		boolean b6 = num1 != num2;
		
		System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b6);
	}

}
