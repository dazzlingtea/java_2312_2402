
public class ForExample {

	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 5 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println("����");
		// �ʱ� i=0 -> ���� i<5 true -> 0 ���
		// ��ȭ i=1 -> ���� i<5 true -> 1 ���
		// ��ȭ i=2 -> ���� i<5 true -> 2 ���
		// ��ȭ i=3 -> ���� i<5 true -> 3 ���
		// ��ȭ i=4 -> ���� i<5 true -> 4 ���
		// ��ȭ i=5 -> ���� i<5 false -> �ݺ� ����
		
	
		//for���� �̿��ؼ� 1~100������ ���� ���ϴ� �ڵ�
		int sum = 0;
		for(i=1 ; i<=100 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1~100���� Ȧ���� ���� ���ϴ� �ڵ�
		int oddsum = 0;
		for(i=1 ; i<=100 ; i+=2) {
			oddsum += i;
		}
		System.out.println(oddsum);
		
		//¦��
		int evensum = 0;
		for(i=2 ; i<=100 ; i+=2) {
			evensum += i;
		}
		System.out.println(evensum);
	}

}
