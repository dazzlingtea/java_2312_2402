import java.util.Scanner;
public class IfExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		int year = sc.nextInt();
		String pass = "";

		//단순 if문   8번비교
		if(year <= 3 && score >= 60)
			pass = "합격";
		if(year <= 3 && score < 60)
			pass = "불합격";
		if(year == 4 && score >= 70)
			pass = "합격";
		if(year == 4 && score < 70)
			pass = "불합격";
		System.out.println(pass);
		
		String pass2 = "";
		//중첩 if문 학년 -> 점수 2번비교
		if(year == 4) {
			if(score >= 70)
				pass2 = "합격";
			else
				pass2 = "불합격";
		}
		else {//4학년이 아닌 경우
			if(score >= 60)
				pass2 = "합격";
			else
				pass2 = "불합격";
		}
		System.out.println(pass2);
		
		String pass3 = "";
		// 중첩 if문 - 점수 > 학년 최소1번비교
		if(score >= 70)
			pass3 = "합격";
		else if(score >= 60) {
			if(year == 4)
				pass3 = "불합격";
			else //year !=4
				pass3 = "합격";
		}
		else // score <60
			pass3 = "불합격";
		System.out.println(pass3);
		
	}

}
