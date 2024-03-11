import java.util.Scanner;
public class SkewedArray {
	public static void main(String[] args) {
	
		// n = 5
		// 10 11 12 13 14
		// 20 21 22 23
		// 30 31 32
		// 40 41
		// 50
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[][] = new int[n][];
		for(int i=0 ; i<n ; i++) {
			a[i] = new int[n-i];  //각 행마다의 요소 개수
		}
		for(int i=0 ; i<n ; i++) {
			// i=0 -> n-0칸
			// i=1 -> n-1칸
			for(int j=0 ; j<n-i ; j++) {
				a[i][j] = (i+1)*10 + j;
			}
		}
		for(int i=0 ; i<a.length ; i++) {//출력
			for(int j: a[i]) {//a의 각각의 행들을 보는 것
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//for-each
		for(int[] i: a) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//둘다 기본
		for(int i=0 ; i<a.length ; i++) {
			//for(int j=0 ; j<a[0].length ; j++) { 2행은 5열이 없어서 에러남
			for(int j=0 ; j<a[i].length ; j++) {
				System.out.print(a[i][j] + " "); 
			}
			System.out.println();
		}
		//밖 for-each
		for(int[] i: a) {
			for(int j=0; j<i.length ; j++) {
				System.out.print(i[j] +" ");
			}
			System.out.println();
		}
		
	}

}
