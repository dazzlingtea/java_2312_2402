
public class ArrayExample {

	public static void main(String[] args) {
		//���� ���� ����
		int a[]; 
		a = new int[5]; //����
		//���� ���� ����
		int b[] = new int[5];
		int []c = new int[5];
		int[]d = new int[5];
		
		//�迭 �ʱ�ȭ
		int e[] = {1, 2, 3, 4}; //�迭�� �� ��� element
		
		int f[] =new int[5];
		f[3] = 2;
		for(int i=0 ; i<=4; i++) {
			System.out.println(i+" "+f[i]); //���ȣ�� f�迭���� i��° ���� �����Ͷ�
			
		}
		//System.out.println(f[-1]); java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(f[5]);
		
		int g[];
		//g[0] = 8;  ���� �� ������ ���ϸ� ���� ���� �� ���� 
		
	}

}
