import java.util.Scanner;
public class Assignment2
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���
    	Scanner sc = new Scanner(System.in);
       
        // 2. ���� 7�� WEEK ���� Ÿ���� ����� �������ּ���
    	final int WEEK = 7;
       
        // 3. �ѱ� '��' �� 2���� ����� �̿��� ���� ���ͷ��� ǥ�����ּ���.
        // �ѱ� '��'�� �����ڵ� ���ڴ� 44608 �Դϴ�.
       char c1 = '��';
       char c2 = '\uAE40';
       
        // 4. Scanner�� �̿��� ����(4.5����)�� �����(���ڿ�)�� �� �ٷ� �Է¹޴� �ڵ带 �ۼ����ּ���.
       System.out.println("����(4.5����)�� ������� ����� �����Ͽ� �Է��ϼ���.");
       double ���� = sc.nextDouble();
       String ����� = sc.next();
       sc.close();
       
        // 5-1. ���� 7�� 3�� �����ϴ� ������ ������ּ���.
        // 5-2. �� ������ ��, ��, ��, ��, �������� ������ּ���.
       int i1 = 7;
       int i2 = 3;
       int add = i1 + i2;
       int sub = i1 - i2;
       int mul = i1 * i2;
       int div = i1 / i2;
       int rem = i1 % i2;
       System.out.println(add+", "+sub+", "+mul+", "+div+", "+rem);
       
        // 6-1. ���� 10�� �����ϴ� ������ ������ּ���.
        // 6-2. ���� �����ڸ� �̿��� �� ������ ���� �ٲٸ鼭 ����ϵ�, ��� ���� 11, 12, 13, 12, 11 ������ �������� ���ּ���.
       int i3 = 10;
       ++i3;
       System.out.println(i3++ +", "+ i3++ +", "+ i3-- +", "+ i3 +", "+ --i3);
       
        // 7. �� �����ڿ� �� �����ڸ� �̿��� ���� true�� ������ �ڵ带 2�� �ۼ����ּ���.
       System.out.println((5<7 && 6==9) || (5>7 ^ 3<=4));
       System.out.println(!(6!=9) ^ (7>=5 && 3<4));
       
        // 8. ��Ʈ �����ڸ� �̿��� ���� 5�� 12�� �������� �ϴ� �ڵ带 �ۼ����ּ���. (1�̳� 0 ��� ����)
       System.out.println((8 | 2) ^ 15);
       System.out.println(3 << 2);       
    }
}
