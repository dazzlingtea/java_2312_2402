import java.util.Scanner;
public class Practice5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		//�ڵ��׽�Ʈ ����_02���ǹ�
		//����ð� ����ð�
       	int A = sc.nextInt();
       	int B = sc.nextInt();
       	int C = sc.nextInt();
       	int x = C / 60;
       	int y = C % 60;
       
       	System.out.print(A +":"+ B +" ");
       
       	if(B + y >= 60) {
     	  if(A + x < 23) {
     		  System.out.println((A+x+1) +":"+ ((B+y)%60));
     	  } else {
     		  System.out.println((A+x-23) +":"+ ((B+y)%60));
     	  } 
       	} else {
      	 if(A + x < 24) {
        		  System.out.println((A+x) +":"+ B+y);
        	  } else {
        		  System.out.println((A+x-24) +":"+ B+y);
        	  }
       	}
	      
       	//�ֻ��� ���
       	int r1 = sc.nextInt();
       	int r2 = sc.nextInt();
       	int r3 = sc.nextInt();
	      
       	if(r1 != r2 && r2 != r3 && r3 != r1) {
       		if(r1 > r2) {
       			if(r1 > r3) {
       				System.out.println(r1 * 100);
       			} else {
       				System.out.println(r3 * 100);
       			}
       		} else {
       			if(r2 > r3) {
       				System.out.println(r2 * 100);
       			} else {
       				System.out.println(r3 * 100);
       			}
       		}
       	} else if(r1 == r2 && r1 != r3) {
       		System.out.println(1000 + r1 * 100);
       	} else if(r1 == r3 && r1 != r2) {
       		System.out.println(1000 + r1 * 100);
       	} else if(r2 == r3 && r1 != r3) {
       		System.out.println(1000 + r2 * 100);
       	} else {
       		System.out.println(10000 + r1 * 1000);
       	}
       
       //�ڵ��׽�Ʈ ����_03 �ݺ���
       //������
       int N = sc.nextInt();
       for(int i=1; i<=9; i++)
    	   System.out.println(N +" * "+ i +" = "+ N*i);
       
       
       // A + B 
       int T = sc.nextInt();
       A = sc.nextInt();
       B = sc.nextInt();
       for(int i=1; i<=T ; i++) {
    	   System.out.println("Case #" + i +": "+ A +" + "+ B +" = "+ (A+B));
    	   A = sc.nextInt();
    	   B = sc.nextInt();
       }
       //���ڿ� �ݺ�
       int T2 = sc.nextInt();
       int R = sc.nextInt();
       String S = sc.next();
       String P = "";
       for(int i=0 ; i<T2 ; i++) {
    	   for(int j=0 ; j<S.length() ; j++) {
    		   for(int k=1 ; k<=R ; k++) {
    			   P += String.valueOf(S.charAt(j));
    		   }
    	   }
    	   System.out.println(P);
    	   R = sc.nextInt();
    	   S = sc.next();
    	   P = "";
       }

   	}
}

