import java.util.Scanner;
public class Assignment5
{	
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
       Scanner sc = new Scanner(System.in);
       
       	// 2. while���� break���� �̿��Ͽ� ����ؼ� ������ �Է¹޴ٰ�
       	// 0�� �Է¹����� �ݺ����� Ż���ϴ� �ڵ带 �ۼ����ּ���.
       	int i2 = sc.nextInt();
       	while(i2 != 0) {
    	   System.out.println(i2);
    	   if(i2 == 0)
    		   break;
    	   i2 = sc.nextInt();
       	}
       
        // 3. �Ʒ� ������ ���� �迭�� �����ϼ���
        // 3-1. 10���� ���ڸ� ������ �迭 c�� ����, �������ּ���.
       		char c[];
       		c = new char[10];
        // 3-2. 0���� 5���� ���� ������ �ʱ�ȭ�� ���� ���� n�� ����, �������ּ���.
       		int n[] = {0, 1, 2, 3, 4, 5};
        // 3-3. ���� ���� �����ϴ� ���ڿ� �迭 day�� ����, �������ּ���.
       		String day[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
        // 3-4. 4���� �� ���� ������ �迭 b�� �����ϰ� true, false, true, false�� �ʱ�ȭ���ּ���.
       		boolean b[] = new boolean[4];
       		b = new boolean[]{true, false, true, false};
       
        // 4. �Ʒ� �ڹ� �ڵ带 ���� �ùٸ��� �ڵ尡 ����ǵ��� �������ּ���.
        int array4[];
        array4 = new int[2];
        array4[0] = 1;
        array4[1] = array4[0] + 1;
       
        // 5. ���� alpha �迭�� �ִ� ���ڸ� ��� ����Ϸ��� �մϴ�. �� ĭ�� ������ �ڵ带 �ۼ����ּ���.
        // 5-1
        char alpha1[] = {'a', 'b', 'c', 'd'};
        for(int i=0 ; i<alpha1.length ; i++)
            System.out.print(alpha1[i]);
       
        char alpha2[] = {'a', 'b', 'c', 'd'};
        for(char i: alpha2)
            System.out.print(i);
        System.out.println();
        
        // 6-1. ���� ���� 10���� �Է¹޾� �迭�� �������ּ���.
        // 6-2. �迭�� �ִ� ���� �߿��� 3�� ����� ������ּ���.
        int Array6[] = new int[10];
        for(int i=0; i<10 ; i++) {
        	Array6[i] = sc.nextInt();
        }
        for(int i: Array6) {
        	if(i % 3 == 0)
        		System.out.print(i +" ");
        }
        System.out.println();
        
        // 7-1. ���� 10���� �����ϴ� �迭�� ������ּ���.
        int Array7[] = new int[10];
        // 7-2. 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �������ּ���.
        // 1���� 10���� ������ ������ �����ϰ� �����ϴ� �ڵ�� ������ �����ϴ�.
        int randomNumber = (int)(Math.random()*10 + 1);
        for(int i=0 ; i<10 ; i++) {
        	randomNumber = (int)(Math.random()*10 + 1);
        	Array7[i] = randomNumber;
        }
        // 7-3. �迭�� ����� ���ڸ� �� �ٿ� ��� ����ϰ�, �� ���ڵ��� ����� ������ּ���.
        int sum = 0;
        for(int i: Array7) {
           System.out.print(i +" ");
           sum += i;
        }
        System.out.println("���:"+ sum/10.0);
       
        // 8-1. 4x4ũ���� 2���� �迭�� ������ּ���.
        // 8-2. ������ ��ġ�� 1���� 10������ ������ ������ �����ϰ� �����Ͽ� ������ �������ּ���.
        // 8-3. 2���� �迭�� 4x4 ���·� ������ּ���.
       	int Array8[][] = new int[4][4];
        for(int i=0 ; i<4 ; i++) {
        	for(int j=0 ; j<4 ; j++) {
        	randomNumber = (int)(Math.random()*10 + 1);
        	Array8[i][j] = randomNumber;
        	System.out.print(Array8[i][j] +"");
        	}
        	System.out.println();
        }
       	
    }
}