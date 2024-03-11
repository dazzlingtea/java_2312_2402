import java.util.*;
public class Assignment12Answer{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
       Scanner sc = new Scanner(System.in);
       
        // 2. Calendar Ŭ������ �̿��� ���� �ð��� ���� ������ ����ϰ� ���ּ���.
        // ���� �ð��� 3:00 ~ 11:59�� Good Morning, 12:00 ~ 16:59�� Good Afternoon
        // 17:00~22:59 �̸� Good Evening, 23:00~2:59�� Good Night�� ����մϴ�.
       Calendar c = Calendar.getInstance();
       int h = c.get(Calendar.HOUR_OF_DAY);
       if(h >= 3 && h<12) System.out.println("Good Morning");
       else if(h >=12 && h<17) System.out.println("Good Afternoon");
       else if(h >= 17 && h<23) System.out.println("Good Evening");
       else System.out.println("Good Night");
       
        // 3. ���� ����� �̿��Ͽ� ���� ����(0.0, 0.5, 1.0, 1.5, ... 4.5) �� ��µǴ� �ڵ带 �ۼ����ּ���.
       Random r = new Random();
       double grade = r.nextInt(10) / 2.0;
       System.out.println(grade);
       
        // 4. ���� �ð��� 2024�� 1�� 1�� 0�� 0�� 0�� (�ѱ��ð� ����) �� �� �� ���̰� ������ ����ϴ� �ڵ带 �ۼ����ּ���.
       Calendar c4 = Calendar.getInstance(); //����\
       c4.set(2024, 0, 1, 0, 0, 0);
       
        // 5. �Ʒ� ���ڿ����� �ܾ� ���̿� �ִ� ������ ���� ���ϴ� �ڵ带 �ۼ����ּ���.
        String s51 = "hello123java45is91fun14"; // ���� 273
        String s52 = "100hidden30number10finding20is40so60hard20"; // ���� 280
        String s53 = "a1b2c3d4e5f6g7"; // ���� 28
       
        String[] s51a = s51.split("[a-z]");
        String[] s52a = s52.split("[a-z]");
        String[] s53a = s53.split("[a-z]");
        
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(String i: s51a) {
        	if(i.length() > 0)
        		sum1 += Integer.parseInt(i);
        }
        for(String i: s52a) {
        	if(i.length() > 0)
        		sum2 += Integer.parseInt(i);
        }
        for(String i: s53a) {
        	if(i.length() > 0)
        		sum3 += Integer.parseInt(i);
        }
        System.out.println(sum1 + " " + sum2 + " " + sum3);
        
    }
}