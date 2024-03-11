import java.util.Scanner;
public class Assignment3Answer
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요
       Scanner sc = new Scanner(System.in);
       
        // 2-1. Scanner를 이용하여 정수 변수를 입력받아주세요.
        // 2-2. 입력 받은 정수 변수가 짝수라면 "even", 아니면 "odd"를
        //  문자열 변수에 저장하는 코드를 조건 연산자를 이용해 작성해주세요.
       int i1 = sc.nextInt();
       String s1 = i1 % 2 == 0 ? "even" : "odd";
       
        // 3-1. Scanner를 이용하여 실수 변수를 입력받아주세요.
        // 3-2. 단순 if문을 이용하여 0 미만이면 "음수", 0 이상 1 미만이면 "소수",
        //      1 이상이면 "양수"를 문자열 변수에 저장하여 출력해주세요.
       double d1 = sc.nextDouble();
       String s2 = "";
       if(d1 < 0)
    	   s2 = "음수";
       if(d1 >= 0 && d1 < 1)
    	   s2 = "소수";
       if(d1 >= 1)
    	   s2 = "양수";
       
        // 4-1. Scanner를 이용하여 서로 다른 3개의 정수를 입력받아주세요.
        // 4-2. 중첩 if문을 이용하여 3개의 수 중 두 번째로 큰 수를 출력해주세요.
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       
       if(num1 < num2) {
    	   if(num2 < num3) 
    		   System.out.println(num2);
    	   else {
    		   if(num1 < num3) 
    			   System.out.println(num3);
    		   else
    			   System.out.println(num1);
    	   }
       }
       else {
    	   if(num1 < num3)
    		   System.out.println(num1);
    	   else {
    		   if(num2 < num3)
    			   System.out.println(num3);
    		   else
    			   System.out.println(num2);
    	   }
       }
       
       
       
        // 5-1. Scanner를 이용하여 정수 1개를 입력받아주세요. (1~99 사이)
        // 5-2. 중첩 if문을 이용하여 369게임에서 이 수가 박수를 몇 번 쳐야 하는지 출력해주세요.
       int i2 = sc.nextInt();
       int one = i2 % 10;  // 1의 자리 
       int ten = i2 / 10;  // 10의 자리 
       
       if(one % 3 == 0 && one != 0) {//일의 자리가 369인 경우
    	   if(ten % 3 == 0 && ten !=0) //십의 자리가 369인 경우
    		   System.out.println("2번");
    	   else //일은 369인데 십은 x
    		   System.out.println("1번");
       }
       else {//일이 369 X
    	   if(ten % 3 == 0 && ten != 0) //십의 자리가 369인 경우
    		   System.out.println("1번");
    	   else // 일 369 X, 십 369X
    		   System.out.println("0번");
       }
       
        // 6. 다음 조건문을 조건 연산자를 이용해 한 문장으로 표현해주세요.
        int a = 50;
        if(a > 100) a = 100;
        else a = 0;
       
        a = a > 100 ? 100 : 0;
        
       
        // 7-1. Scanner를 이용하여 월(1~12 중 하나)를 입력받아주세요.
        // 7-2. 중첩 if문을 이용해서 어떤 계절인지 출력해주세요. (3~5 봄, 6~8 여름, 9~11 가을, 12~2 겨울)
       int m = sc.nextInt();
       
       if(m >= 3) {
    	   if(m <= 5)
    		   System.out.println("봄");
    	   else {
    		   if(m <= 8)
    			   System.out.println("여름");
    		   else {
    			   if(m <= 11)
    				   System.out.println("가을");
    			   else
    				   System.out.println("겨울");
    		   }
    	   }
       }
       else // m =1, 2
    	   System.out.println("겨울");
       
       // 7-3. switch-case문을 이용해서 어떤 계절인지 출력해주세요.    
       switch(m) {
       		case 3:
       		case 4:
       		case 5:
       			System.out.println("봄");
       			break;
       		case 6:
       		case 7:
       		case 8:
       			System.out.println("여름");
       			break;
       		case 9:
       		case 10:
       		case 11:
       			System.out.println("가을");
       			break;
       		default:
       			System.out.println("겨울");
    	   
       }
       
       
       
       
       
        // 8. 다음 switch-case문을 c1에 따라 동일한 결과가 나오도록 단순 if문으로 바꿔주세요.
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
        
        //ㄴ브레이크가 없어서 누적임
        if(c1 == 'A') i8 += 195;
        if(c1 == 'B') i8 += 95;
        if(c1 == 'A') i8 += 45;
        if(c1 == 'D') i8 += 15;
        if(c1 != 'A' && c1 != 'B' && c1 != 'C'&& c1 != 'D') i8 += 5;
        
        
        
        
        
    }
}

		




