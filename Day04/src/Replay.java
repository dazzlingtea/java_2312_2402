import java.util.Scanner;
public class Replay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		//������ ��� �Է¹���
		//-1 �Է¹����� �ݺ��� ����Ǹ� �Է¹��� ������ ������ ���� ���
		//while��
		
		int num = sc.nextInt();
		while(num != -1) {
			count++;
			sum += num; //������� �ϸ� ���ѷ���
			num = sc.nextInt(); //���� �Է¹޴� �ͱ��� �����ؾ� ��
		}
		System.out.println("Ƚ��: "+ count + " ��: " + sum);
		
		//do-while
		count = 0;
		sum = 0;
		
		do {
			num = sc.nextInt();
			if(num == -1) {
				break;
			}
			count++;
			sum += num;
			//num=sc.nextInt �� �ʿ�� ������ ���� �� �Է��� �ʿ䵵 ����
		} while(num != -1);
		System.out.println("dwȽ��:"+ count +" ��:"+ sum);
		
		//a~z ���
		//for
		for(char i='a' ; i <='z' ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while
		char i2 = 'a';
		while(i2 <='z') {
			System.out.print(i2+" ");
			i2++;
		}
		System.out.println();
		//do-while
		i2 = 'a';
		do {
			System.out.print(i2+" ");
			i2++; //(char)(i+1) ĳ���� ��ĵ� �� 
		} while(i2 <= 'z');
		System.out.println();
		
		//�ݸ�����
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1 ; i<=n-1 ; i++) {
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//�ݸ����� �Ʒ�
		n = sc.nextInt();
		for(int i=n-1 ; i>=1 ; i--) { //���� ����
			for(int j=1 ; j<=i ; j++) { //���� ����
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//���������� 5 ,4 5, ... ,1 2 3 4 5
		//����8 5 1, ����6 4 5, ���� 4 3 4 5 ...
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n-i ; j++) {//����
				System.out.print("  ");
			}//for�� ���μ����� �� �ص� ��
			for(int j=n-i+1 ; j<=n ; j++) {//���η� ù��° 5 4 3 2 1
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 12345 2345 345 2345 12345
		for(int i=1 ; i<=n/2 ; i++) { //������ ���Ŀ��� ���κи� �ٲٸ� �Ǵϱ� i<=n/2
			for(int j=1 ; j<=i-1 ; j++) {//i=1 j=n��, ����0��
				System.out.print("  ");
			}
			for(int j=i ; j<=n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n/2+1 ; i<=n ; i++) {//�Ʒ��ϱ� ��ü n�� �� ���κ� �ִ�ġ �������� 
			for(int j=1 ; j<=2*(n-i) ; j++) {//����
				System.out.print(" ");
			}
			for(int j=n-i+1 ; j<=n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//���ﰢ��
		for(int i=1 ; i<=n-1 ; i++) 
			System.out.print(" ");
		System.out.println("*");
		
		for(int i=1 ; i<=n-2 ; i++) {
			for(int j=n-1-i ; j>=1 ; j--) {//j=1;j<=n-1-i;j++
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i=1 ; i<=2*n-1 ; i++)
			System.out.print("*");
		System.out.println();
	}

}
