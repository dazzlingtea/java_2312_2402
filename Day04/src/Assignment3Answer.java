import java.util.Scanner;
public class Assignment3Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���
       Scanner sc = new Scanner(System.in);
       
        // 2-1. Scanner�� �̿��Ͽ� ���� ������ �Է¹޾��ּ���.
        // 2-2. �Է� ���� ���� ������ ¦����� "even", �ƴϸ� "odd"��
        //  ���ڿ� ������ �����ϴ� �ڵ带 ���� �����ڸ� �̿��� �ۼ����ּ���.
       int i1 = sc.nextInt();
       String s1 = i1 % 2 == 0 ? "even" : "odd";
       
        // 3-1. Scanner�� �̿��Ͽ� �Ǽ� ������ �Է¹޾��ּ���.
        // 3-2. �ܼ� if���� �̿��Ͽ� 0 �̸��̸� "����", 0 �̻� 1 �̸��̸� "�Ҽ�",
        //      1 �̻��̸� "���"�� ���ڿ� ������ �����Ͽ� ������ּ���.
       double d1 = sc.nextDouble();
       String s2 = "";
       if(d1 < 0)
    	   s2 = "����";
       if(d1 >= 0 && d1 < 1)
    	   s2 = "�Ҽ�";
       if(d1 >= 1)
    	   s2 = "���";
       
        // 4-1. Scanner�� �̿��Ͽ� ���� �ٸ� 3���� ������ �Է¹޾��ּ���.
        // 4-2. ��ø if���� �̿��Ͽ� 3���� �� �� �� ��°�� ū ���� ������ּ���.
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       
       if(num1 < num2) {
    	   if(num2 < num3) 
    		   System.out.println(num2);
    	   else {
    		   if(num1 < num3) 
    			   System.out.println(num3);
    		   else
    			   System.out.println(num1);
    	   }
       }
       else {
    	   if(num1 < num3)
    		   System.out.println(num1);
    	   else {
    		   if(num2 < num3)
    			   System.out.println(num3);
    		   else
    			   System.out.println(num2);
    	   }
       }
       
       
       
        // 5-1. Scanner�� �̿��Ͽ� ���� 1���� �Է¹޾��ּ���. (1~99 ����)
        // 5-2. ��ø if���� �̿��Ͽ� 369���ӿ��� �� ���� �ڼ��� �� �� �ľ� �ϴ��� ������ּ���.
       int i2 = sc.nextInt();
       int one = i2 % 10;  // 1�� �ڸ� 
       int ten = i2 / 10;  // 10�� �ڸ� 
       
       if(one % 3 == 0 && one != 0) {//���� �ڸ��� 369�� ���
    	   if(ten % 3 == 0 && ten !=0) //���� �ڸ��� 369�� ���
    		   System.out.println("2��");
    	   else //���� 369�ε� ���� x
    		   System.out.println("1��");
       }
       else {//���� 369 X
    	   if(ten % 3 == 0 && ten != 0) //���� �ڸ��� 369�� ���
    		   System.out.println("1��");
    	   else // �� 369 X, �� 369X
    		   System.out.println("0��");
       }
       
        // 6. ���� ���ǹ��� ���� �����ڸ� �̿��� �� �������� ǥ�����ּ���.
        int a = 50;
        if(a > 100) a = 100;
        else a = 0;
       
        a = a > 100 ? 100 : 0;
        
       
        // 7-1. Scanner�� �̿��Ͽ� ��(1~12 �� �ϳ�)�� �Է¹޾��ּ���.
        // 7-2. ��ø if���� �̿��ؼ� � �������� ������ּ���. (3~5 ��, 6~8 ����, 9~11 ����, 12~2 �ܿ�)
       int m = sc.nextInt();
       
       if(m >= 3) {
    	   if(m <= 5)
    		   System.out.println("��");
    	   else {
    		   if(m <= 8)
    			   System.out.println("����");
    		   else {
    			   if(m <= 11)
    				   System.out.println("����");
    			   else
    				   System.out.println("�ܿ�");
    		   }
    	   }
       }
       else // m =1, 2
    	   System.out.println("�ܿ�");
       
       // 7-3. switch-case���� �̿��ؼ� � �������� ������ּ���.    
       switch(m) {
       		case 3:
       		case 4:
       		case 5:
       			System.out.println("��");
       			break;
       		case 6:
       		case 7:
       		case 8:
       			System.out.println("����");
       			break;
       		case 9:
       		case 10:
       		case 11:
       			System.out.println("����");
       			break;
       		default:
       			System.out.println("�ܿ�");
    	   
       }
       
       
       
       
       
        // 8. ���� switch-case���� c1�� ���� ������ ����� �������� �ܼ� if������ �ٲ��ּ���.
        int i8 = 0;
        char c1 = 'A';
        switch(c1) {
            case 'A':
                i8 += 100;
            case 'B':
                i8 += 50;
            case 'C':
                i8 += 30;
            case 'D':
                i8 += 10;
            default:
                i8 += 5;
        }
        System.out.println(c1);
        
        //���극��ũ�� ��� ������
        if(c1 == 'A') i8 += 195;
        if(c1 == 'B') i8 += 95;
        if(c1 == 'A') i8 += 45;
        if(c1 == 'D') i8 += 15;
        if(c1 != 'A' && c1 != 'B' && c1 != 'C'&& c1 != 'D') i8 += 5;
        
        
        
        
        
    }
}

		




