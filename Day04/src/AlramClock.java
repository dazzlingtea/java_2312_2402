import java.util.Scanner;
public class AlramClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		//10:50  시 그대로 분-45   
		//10:30  시-1 분+15    m+60-45 라서 m+15
		//0:30   시 23 분+15 
		
		//내가 푼거...이렇게 하면 0시 45분 안됨
		if(h != 0) {
			if(m >= 45) 
				System.out.println(h + ":" + (m - 45)) ;
			else
				System.out.println((h - 1) + ":" + (m + 15));	
		}
		else
			System.out.println(23 + ":" + (m + 15));
		
		
		if(m >= 45) {
			System.out.println(h + ":" + (m - 45)) ;
		}
		else {
			if(h != 0)
				System.out.println((h - 1) + ":" + (m + 15));
			else
				System.out.println(23 + ":" + (m + 15));
		}
			

	}

}
