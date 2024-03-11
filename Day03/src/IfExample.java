import java.util.Scanner;
public class IfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade1=' ', grade2=' ', grade3=' '; //콤마로도 바로 만들 수 있음
		//90~100 A, 80~89 B, 70~79 C, ~69 F
		
		//단순 if문
		if(score >= 90 && score <= 100) // 단순은 조건을 상세하게 써야함 중복없이
			grade1 = 'A';
		if(score >= 80 && score <= 89)
			grade1 = 'B';
		if(score >= 70 && score <= 79)
			grade1 = 'C';
		if(score <= 69)
			grade1 = 'F';
		
		
		//중첩 if문
		if(score >= 90)
			grade2 = 'A';
		else {// score <=89 걸러져서 굳이 쓸 필요 없음
			if(score >= 80)
				grade2 = 'B';
			else {
				if(score >= 70)
					grade2 = 'C';
				else {
					grade2 = 'F';
				}
			}
		}
		
		//if-else if-else 문
		if(score >= 90)
			grade3 = 'A';
		else if(score >= 80) 
			grade3 = 'B';
		else if(score >= 70) 
			grade3 = 'C';
		else  //score <= 69
			grade3 = 'F';
		
		System.out.println(score+"점 "+grade1+" "+grade2+" "+grade3);
		
	}
}
