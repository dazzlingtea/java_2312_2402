import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i8 = 0;
        char c1 = 'A';
        char c2 = c1;
        if(c2 == 'A') i8 += 100;
        if(c2 == 'B') i8 += 50;
        if(c2 == 'C') i8 += 30;
        if(c2 == 'D') i8 += 10;
        if(c2!='A' && c2!='B' && c2!='C' && c2!='D') i8 += 5;
        System.out.println(c2);
        
        
        System.out.println("서로 다른 3개의 정수를 입력하세요.");
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
        System.out.println("두 번째로 큰 수: "+midNum);
	}

}
