import java.util.Scanner;
public class Assignment4
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
       Scanner sc = new Scanner(System.in);
       
        // 2. for �ݺ����� �̿��� 1, 3, 5, 7, 9, 11, 13 �� ������ּ���.
       for(int i=1 ; i<=13 ; i+=2)
    	   System.out.print(i+" ");
       System.out.println();
       
        // 3. for �ݺ����� �̿��� 10, 9, 8, 7, 6, 5, 4 �� ������ּ���.
       for(int i=10 ; i>=4 ; i--)
    	   System.out.print(i+" ");
       System.out.println();
       
        // 4. while �ݺ����� �̿��� 1, 4, 7, 10, 13, 16, 19 �� ������ּ���.
       int i = 0;
       while(i <= 6) {
    	   System.out.print(i*3+1+" ");
    	   i++;
       }
       System.out.println();
       
        // 5. do-while �ݺ����� �̿��� 1���� 100���� 3�� ����� ���� ������ּ���.
       int i5 = 1, sum5 = 0;
       do {
    	   if(i5 % 3 == 0) {
    		   sum5 += i5;
    	   }
    	   i5++;
       } while(i5 <= 100);
       System.out.println(sum5);
       
        // 6. ���� �ڵ�� 1���� 50������ ���� ���ϴ� while���Դϴ�.
        // �� ĭ�� ������ �ڵ带 �ۼ����ּ���.
        int sum6 = 0, i6 = 1;
        while(true) {
            if(i6 > 50)
                break;
            sum6 += i6;
            i6++;
        }
       System.out.println(sum6);
        // 7-1. �Ʒ� while�� �ڵ带 ���� for���� �̿��� �����ϰ� ����Ǵ� �ڵ带 �ۼ����ּ���.
        // 7-2. �Ʒ� while�� �ڵ带 ���� do-while���� �̿��� �����ϰ� ����Ǵ� �ڵ带 �ۼ����ּ���.
        int sum7 = 0, i7 = 0;
        while(i7 < 100) {
            sum7 += i7;
            i7 += 2;
        }
        System.out.println(sum7);
        
        //for��
        sum7 = 0; i7 = 0;
        for(i7=0 ; i7<100 ; i7+=2) { 
        	sum7 += i7;
        }
    	System.out.println(sum7);
    	
    	//do-while��
    	sum7 = 0; i7 = 0;
    	do {
    		sum7 += i7;
    		i7 += 2;
    	} while(i7 < 100);
    	System.out.println(sum7);    	
    	
        // 8-1. Scanner�� �̿��� ������ �Է¹޾��ּ���.
        // 8-2. �Ʒ��� ���·� �� ��⸦ �������ּ���. (��ø for�� ���)
    	int n = sc.nextInt();
        for(int i8=1 ; i8<=n ; i8++) {
     	   for(int j8=1; j8<=n-i8+1 ; j8++) {
     		   System.out.print("*");
     	   }
     	   System.out.println();
        }
       
        // 9. Scanner�� ���� �ҹ��ڸ� 1�� �Է¹޽��ϴ�. (�̹� Scanner �ڵ尡 �ԷµǾ� �ֽ��ϴ�.)
        // �Է¹��� �ҹ��ڿ� ���� �Ʒ� ���·� ���ĺ��� ��µǰ� ���ּ���. (�ƹ� �ݺ����̳� ����)

        String s9 = sc.next();
        char c9 = s9.charAt(0); // �Է¹��� ���ڿ����� 1��° ���ĺ��� �������� �ڵ��Դϴ�.
        
        int n9 = (int)c9;
        for(int i9=97 ; i9 <=n9 ; i9++) {
        	for(int j=97 ; j<=n9-i9+97 ; j++) {
        		System.out.print((char)j);
        	}
        	System.out.println();
        }
    }
}