import java.util.Scanner;
public class AlramClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		//10:50  �� �״�� ��-45   
		//10:30  ��-1 ��+15    m+60-45 �� m+15
		//0:30   �� 23 ��+15 
		
		//���� Ǭ��...�̷��� �ϸ� 0�� 45�� �ȵ�
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
