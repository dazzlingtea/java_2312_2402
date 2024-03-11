import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//단순 if문
		int score = sc.nextInt();
		// score/10 9, 10A 8B 7C 나머지 F
		char grade = ' ';
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A'; //switch문을 부수고 나간다
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
		}
		System.out.println(grade);

	}
}
