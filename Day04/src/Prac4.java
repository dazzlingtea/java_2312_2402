import java.util.Scanner;
public class Prac4 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 // A + B
     int t = sc.nextInt();
	 int T[][] = new int[t][2];
     for(int i=0; i<T.length ; i++) {
  	   	T[i][0] = sc.nextInt();
  	   	T[i][1] = sc.nextInt();
     }
     for(int i=0; i<T.length; i++) {
    	 System.out.println("Case #" + (i+1) +": "+ T[i][0]
    		 +" + "+ T[i][1] +" = "+ (T[i][0] + T[i][1]));
     }
 }
}
