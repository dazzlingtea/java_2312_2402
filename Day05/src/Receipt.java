import java.util.Scanner;
public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int 소지금 = sc.nextInt();
		int 종류 = sc.nextInt();  //종류의 수만큼 반복
		int 총합 = 0;
		for(int i=1 ; i<=종류 ; i++) {
			int 단가 = sc.nextInt();   //이걸 왜 생각 못했지? 종류 입력 후 입력을 이렇게 받아야 함
			int 수량 = sc.nextInt();
			총합 += 단가*수량;
		}
		if(소지금 >= 총합) 
			System.out.println("Yes");
		else
			System.out.println("No");
	
		
		/*
		 250000
		 4
		 20000 5
		 30000 2
		 10000 8
		*/
	
	}
	

}
