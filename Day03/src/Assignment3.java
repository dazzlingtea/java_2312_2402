import java.util.Scanner;
public class Assignment3
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���
       Scanner sc = new Scanner(System.in);
       
        // 2-1. Scanner�� �̿��Ͽ� ���� ������ �Է¹޾��ּ���.
        // 2-2. �Է� ���� ���� ������ ¦����� "even", �ƴϸ� "odd"��
        //  ���ڿ� ������ �����ϴ� �ڵ带 ���� �����ڸ� �̿��� �ۼ����ּ���.
       int i2 = sc.nextInt();
       String s2 = (i2 % 2 == 0) ? "even" : "odd";
 
        // 3-1. Scanner�� �̿��Ͽ� �Ǽ� ������ �Է¹޾��ּ���.
        // 3-2. �ܼ� if���� �̿��Ͽ� 0 �̸��̸� "����", 0 �̻� 1 �̸��̸� "�Ҽ�",
        //      1 �̻��̸� "���"�� ���ڿ� ������ �����Ͽ� ������ּ���.
       double i3 = sc.nextDouble();
       String s3 = "";
       
       if(i3<0) s3 = "����";
       if(i3>=1) s3 = "���";
       if(i3>=0 && i3<1) s3 = "�Ҽ�";
       System.out.println(s3);
       
        // 4-1. Scanner�� �̿��Ͽ� ���� �ٸ� 3���� ������ �Է¹޾��ּ���.
        // 4-2. ��ø if���� �̿��Ͽ� 3���� �� �� �� ��°�� ū ���� ������ּ���.

       System.out.println("���� �ٸ� 3���� ������ �Է��ϼ���.");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       int midNum;
       
       if(num1 > num2) {
    	   if(num2 > num3) midNum = num2;
    	   else {
    		   if(num1 > num3) midNum = num3;
    		   else midNum = num1;
    	   }
       }
       else {
    	   if(num2 > num3) {
    		   if(num3 > num1) midNum = num3;
    		   else midNum = num1;
    	   }
    	   else midNum = num2;
       }
       System.out.println("�� ��°�� ū ��: "+midNum);
       
        // 5-1. Scanner�� �̿��Ͽ� ���� 1���� �Է¹޾��ּ���. (1~99 ����)
        // 5-2. ��ø if���� �̿��Ͽ� 369���ӿ��� �� ���� �ڼ��� �� �� �ľ� �ϴ��� ������ּ���.
       System.out.println("1~99 ������ ���� 1���� �Է����ּ���.");
       
       int i5 = sc.nextInt();
       int x = i5 / 10;
       int y = i5 % 10;
       int clap;
       
       if(i5 >= 1 && i5 < 30) 
    	   clap = x * 3 + y / 3;
       else {
    	   if((x % 3) == 0)
    		   clap = x * 3 + y / 3 + y + 1;
    	   else
    		   clap = x * 3 + y / 3 + (i5 / 30) * 10 ;
       }
       System.out.println("�ڼ� Ƚ��: "+clap);
    	   
    	   
    	   
        // 6. ���� ���ǹ��� ���� �����ڸ� �̿��� �� �������� ǥ�����ּ���.
        int a = 50;
        if(a > 100) a = 100;
        else a = 0;
       
        a = (a > 100)? 100:0;
       
        // 7-1. Scanner�� �̿��Ͽ� ��(1~12 �� �ϳ�)�� �Է¹޾��ּ���.
        // 7-2. ��ø if���� �̿��ؼ� � �������� ������ּ���. (3~5 ��, 6~8 ����, 9~11 ����, 12~2 �ܿ�)
        // 7-3. switch-case���� �̿��ؼ� � �������� ������ּ���.
       int month = sc.nextInt();
       String season1;
       
       //��ø if��
       if(month >= 3 && month <= 11) {
    	   if(month <= 5) 
    		   season1 = "��";
    	   else {
    		   if(month <=8)
    			   season1 = "����";
    		   else season1 = "����";
    	   }
       }
       else season1 = "�ܿ�";
       
       System.out.println(season1);
       
       //switch-case��
       String season2;
       switch(month) {
       		case 3:
       		case 4:
       		case 5:
       			season2 = "��";
       			break;
       		case 6:
       		case 7:
       		case 8:
       			season2 = "����";
       			break;
       		case 9:
       		case 10:
       		case 11:
       			season2 = "����";
       			break;
       		default:
       			season2 = "�ܿ�";
       }
        System.out.println(season2);
        
       
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
        
        i8 = 0;
        char c2 = c1;
        if(c2 == 'A') i8 += 100;
        if(c2 == 'B') i8 += 50;
        if(c2 == 'C') i8 += 30;
        if(c2 == 'D') i8 += 10;
        if(c2!='A' && c2!='B' && c2!='C' && c2!='D') i8 += 5;
        System.out.println("c1: "+c2+" i8: "+i8);
    }
}