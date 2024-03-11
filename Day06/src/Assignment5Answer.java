import java.util.Scanner;
public class Assignment5Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
       Scanner sc = new Scanner(System.in);
       
       	// 2. while���� break���� �̿��Ͽ� ����ؼ� ������ �Է¹޴ٰ�
        // 0�� �Է¹����� �ݺ����� Ż���ϴ� �ڵ带 �ۼ����ּ���.
       	while(true) { //�ϴ� ���ѷ��� ������ �ȿ��� �����Է� ����
       		int n = sc.nextInt();
       		if(n == 0) break;
       	}
       	int n2 = sc.nextInt();
       	while(n2 !=0) {
       		n2 = sc.nextInt();  //�� ���� �극��ũ �� �ʿ� ����
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
       	boolean b[] = {true, false, true, false};
       	
       	
        // 4. �Ʒ� �ڹ� �ڵ带 ���� �ùٸ��� �ڵ尡 ����ǵ��� �������ּ���.
        int array4[] = new int[2];
        array4[0] = 1;
        array4[1] = array4[0] + 1;
       
        // 5. ���� alpha �迭�� �ִ� ���ڸ� ��� ����Ϸ��� �մϴ�. �� ĭ�� ������ �ڵ带 �ۼ����ּ���.
        // 5-1
        char alpha1[] = {'a', 'b', 'c', 'd'};
        for(int i=0; i<alpha1.length; i++)  //�ܼ� for�� 
            System.out.print(alpha1[i]);
       
        char alpha2[] = {'a', 'b', 'c', 'd'};
        for(char c2: alpha2) // for-each�� ����: ���۷��� ����
            System.out.print(c2);
           
        // 6-1. ���� ���� 10���� �Է¹޾� �迭�� �������ּ���.
        // 6-2. �迭�� �ִ� ���� �߿��� 3�� ����� ������ּ���.
        int a[] = new int[10];
        for(int i=0; i<a.length; i++) {
        	a[i] = sc.nextInt();
        }
        for(int i: a) {
        	if(i % 3 == 0)
        		System.out.println(i + " ");
        }
        
        // 7-1. ���� 10���� �����ϴ� �迭�� ������ּ���.
        int f[] = new int[10];
        // 7-2. 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �������ּ���.
        // 1���� 10���� ������ ������ �����ϰ� �����ϴ� �ڵ�� ������ �����ϴ�.
        int randomNumber = (int)(Math.random()*10 + 1);
        for(int i=0; i<f.length ; i++) {
        	f[i] = (int)(Math.random()*10 + 1);
        }
        // 7-3. �迭�� ����� ���ڸ� �� �ٿ� ��� ����ϰ�, �� ���ڵ��� ����� ������ּ���.
        int sum = 0;
        for(int i=0; i<f.length ; i++) {
        	System.out.print(f[i] + " ");
        	sum += f[i];
        }
        System.out.println("��� = " + (sum/10.0));
        
        // 8-1. 4x4ũ���� 2���� �迭�� ������ּ���.
        int g[][] = new int[4][4];
        
        // 8-2. ������ ��ġ�� 1���� 10������ ������ ������ �����ϰ� �����Ͽ� ������ �������ּ���.
        for(int i=0; i<g.length; i++) {
        	for(int j=0 ; j<g[0].length; j++) {
        		g[i][j] = (int)(Math.random()*10 + 1);
        	}
        }
        // 8-3. 2���� �迭�� 4x4 ���·� ������ּ���.
        for(int[] i: g) {
        	for(int j: i) {
        		System.out.println(j + " ");
        	}
        	System.out.println();
        }
    }
}
