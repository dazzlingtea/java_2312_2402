import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ڵ��׽�Ʈ ����_02���ǹ�
		//����ð� �丮�� ������ �ð�
	        //���� B��+C%60 >=60 �ð�+1
	        //���� A��+C/60 >=24 �ð�-24
	      int A = sc.nextInt();
	      int B = sc.nextInt();
	      int C = sc.nextInt();
	      
	      System.out.print(A +":"+ B +" ");
	      
	      if(A + C/60 >=23) {
	    	  if(B + C % 60 > 60) {
	    		  System.out.println((A+C/60-23) +":"+ (B+C%60-60));
	    	  } else if(B + C % 60 < 60) {
	    		  System.out.println((A+C/60-24) +":"+ (B+C%60));
	    	  } else {	
	    		  System.out.println((A+C/60-23) +":"+ 0);
	    	  }
	      } else {
	    	  if(B + C % 60 > 60) {
	    		  System.out.println((A+C/60+1) +":"+ (B+C%60-60));
	    	  } else if(B + C % 60 < 60) {
	    		  System.out.println((A+C/60) +":"+ (B+C%60));
	    	  } else {	
	    		  System.out.println((A+C/60+1) +":"+ 0);
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
	      
	        
	}

}
