import java.util.Scanner;
public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ������ = sc.nextInt();
		int ���� = sc.nextInt();  //������ ����ŭ �ݺ�
		int ���� = 0;
		for(int i=1 ; i<=���� ; i++) {
			int �ܰ� = sc.nextInt();   //�̰� �� ���� ������? ���� �Է� �� �Է��� �̷��� �޾ƾ� ��
			int ���� = sc.nextInt();
			���� += �ܰ�*����;
		}
		if(������ >= ����) 
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
