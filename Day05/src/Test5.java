import java.util.Scanner;
public class Test5 {
		public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	       int T2 = sc.nextInt();
	       String P = "";
	       for(int i=0 ; i<T2 ; i++) {
		       int R = sc.nextInt();
		       String S = sc.next();
	    	   for(int j=0 ; j<S.length() ; j++) {
	    		   for(int k=1 ; k<=R ; k++) {
	    			   P += String.valueOf(S.charAt(j));
	    		   }
	    	   }
	    	   System.out.println(P);
	    	   P = "";
	       }
	       System.out.println();
	       
	       //GradeAverage
			double score[][] = {{3.8, 3.9},
								{4.2, 4.5},
								{3.1, 2.6},
								{4.3, 4.4},
			};		
			//2�� for���� length �ʵ带 �̿�
			// �� 8�� �б��� ������ ���
			//�ٱ� �� ���� ��
			double sum = 0;
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[0].length; j++) {
					sum += score[i][j];
				}
			}
			System.out.println("��ü ����� " + (sum/(score.length * score[0].length)));
			
			//skewed array �ǽ�
			int n = sc.nextInt();
			int a[][] = new int[n][];
			for(int i=0; i<n; i++) {
				a[i] = new int[n-i]; //�迭 ����
				for(int j=0; j<n-i; j++) {
					a[i][j] = (i+1)*10 + j;
				}
			}
			//����for
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j] +" ");
				}
				System.out.println();
			}
			//for-each
			for(int i=0; i<a.length; i++) {
				for(int j: a[i]) { // ���۷������� �ڸ��� a[i]�� �־�� a[0]���� �迭�� ����
					System.out.print(j +" ");
				}
				System.out.println();
			}
			
	}
}
