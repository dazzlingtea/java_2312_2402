import java.util.Scanner;
public class Assignment4
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
       Scanner sc = new Scanner(System.in);
       
        // 2. for 반복문을 이용해 1, 3, 5, 7, 9, 11, 13 을 출력해주세요.
       for(int i=1 ; i<=13 ; i+=2)
    	   System.out.print(i+" ");
       System.out.println();
       
        // 3. for 반복문을 이용해 10, 9, 8, 7, 6, 5, 4 를 출력해주세요.
       for(int i=10 ; i>=4 ; i--)
    	   System.out.print(i+" ");
       System.out.println();
       
        // 4. while 반복문을 이용해 1, 4, 7, 10, 13, 16, 19 를 출력해주세요.
       int i = 0;
       while(i <= 6) {
    	   System.out.print(i*3+1+" ");
    	   i++;
       }
       System.out.println();
       
        // 5. do-while 반복문을 이용해 1부터 100까지 3의 배수의 합을 출력해주세요.
       int i5 = 1, sum5 = 0;
       do {
    	   if(i5 % 3 == 0) {
    		   sum5 += i5;
    	   }
    	   i5++;
       } while(i5 <= 100);
       System.out.println(sum5);
       
        // 6. 다음 코드는 1부터 50까지의 합을 구하는 while문입니다.
        // 빈 칸에 적절한 코드를 작성해주세요.
        int sum6 = 0, i6 = 1;
        while(true) {
            if(i6 > 50)
                break;
            sum6 += i6;
            i6++;
        }
       System.out.println(sum6);
        // 7-1. 아래 while문 코드를 보고 for문을 이용해 동일하게 실행되는 코드를 작성해주세요.
        // 7-2. 아래 while문 코드를 보고 do-while문을 이용해 동일하게 실행되는 코드를 작성해주세요.
        int sum7 = 0, i7 = 0;
        while(i7 < 100) {
            sum7 += i7;
            i7 += 2;
        }
        System.out.println(sum7);
        
        //for문
        sum7 = 0; i7 = 0;
        for(i7=0 ; i7<100 ; i7+=2) { 
        	sum7 += i7;
        }
    	System.out.println(sum7);
    	
    	//do-while문
    	sum7 = 0; i7 = 0;
    	do {
    		sum7 += i7;
    		i7 += 2;
    	} while(i7 < 100);
    	System.out.println(sum7);    	
    	
        // 8-1. Scanner를 이용해 정수를 입력받아주세요.
        // 8-2. 아래의 형태로 별 찍기를 시행해주세요. (중첩 for문 사용)
    	int n = sc.nextInt();
        for(int i8=1 ; i8<=n ; i8++) {
     	   for(int j8=1; j8<=n-i8+1 ; j8++) {
     		   System.out.print("*");
     	   }
     	   System.out.println();
        }
       
        // 9. Scanner를 통해 소문자를 1개 입력받습니다. (이미 Scanner 코드가 입력되어 있습니다.)
        // 입력받은 소문자에 따라서 아래 형태로 알파벳이 출력되게 해주세요. (아무 반복문이나 가능)

        String s9 = sc.next();
        char c9 = s9.charAt(0); // 입력받은 문자열에서 1번째 알파벳을 가져오는 코드입니다.
        
        int n9 = (int)c9;
        for(int i9=97 ; i9 <=n9 ; i9++) {
        	for(int j=97 ; j<=n9-i9+97 ; j++) {
        		System.out.print((char)j);
        	}
        	System.out.println();
        }
    }
}