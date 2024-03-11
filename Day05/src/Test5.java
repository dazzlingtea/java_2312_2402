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
			//2중 for문과 length 필드를 이용
			// 총 8개 학기의 학점의 평균
			//바깥 행 안쪽 열
			double sum = 0;
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[0].length; j++) {
					sum += score[i][j];
				}
			}
			System.out.println("전체 평균은 " + (sum/(score.length * score[0].length)));
			
			//skewed array 실습
			int n = sc.nextInt();
			int a[][] = new int[n][];
			for(int i=0; i<n; i++) {
				a[i] = new int[n-i]; //배열 생성
				for(int j=0; j<n-i; j++) {
					a[i][j] = (i+1)*10 + j;
				}
			}
			//이중for
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j] +" ");
				}
				System.out.println();
			}
			//for-each
			for(int i=0; i<a.length; i++) {
				for(int j: a[i]) { // 레퍼런스변수 자리에 a[i]를 넣어야 a[0]행의 배열이 나옴
					System.out.print(j +" ");
				}
				System.out.println();
			}
			
	}
}
