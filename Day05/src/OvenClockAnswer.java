import java.util.Scanner;
public class OvenClockAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // �ǹ̾��� if�� ����ϰ� ����
        
        B += C; // �ݺ��Ǵ� ������ �̸� ����
        
        if (B > 59) {
            // ������ ���������� ����
            int addHour = B / 60; // ������ �ð�
            int hour = (A + addHour) % 24; // ���� �Ʒ� ���ǹ� �ʿ���� ó��
            int min = B % 60; // hour�� ������ ���
            
            System.out.println(hour + " " + min);
            
            /* �� ���ǹ��� C�� 60���Ϸ� ���� ��쿡�� ���Դϴ�.
            if (A == 23) {
                System.out.println((addHour-1)+" "+min);
            } else
                System.out.println((A+addHour)+" "+min);
            */
        } else System.out.println(A+" "+(B));
    }
}