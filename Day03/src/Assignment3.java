import java.util.Scanner;
public class Assignment3
{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요
       Scanner sc = new Scanner(System.in);
       
        // 2-1. Scanner를 이용하여 정수 변수를 입력받아주세요.
        // 2-2. 입력 받은 정수 변수가 짝수라면 "even", 아니면 "odd"를
        //  문자열 변수에 저장하는 코드를 조건 연산자를 이용해 작성해주세요.
       int i2 = sc.nextInt();
       String s2 = (i2 % 2 == 0) ? "even" : "odd";
 
        // 3-1. Scanner를 이용하여 실수 변수를 입력받아주세요.
        // 3-2. 단순 if문을 이용하여 0 미만이면 "음수", 0 이상 1 미만이면 "소수",
        //      1 이상이면 "양수"를 문자열 변수에 저장하여 출력해주세요.
       double i3 = sc.nextDouble();
       String s3 = "";
       
       if(i3<0) s3 = "음수";
       if(i3>=1) s3 = "양수";
       if(i3>=0 && i3<1) s3 = "소수";
       System.out.println(s3);
       
        // 4-1. Scanner를 이용하여 서로 다른 3개의 정수를 입력받아주세요.
        // 4-2. 중첩 if문을 이용하여 3개의 수 중 두 번째로 큰 수를 출력해주세요.

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
       
        // 5-1. Scanner를 이용하여 정수 1개를 입력받아주세요. (1~99 사이)
        // 5-2. 중첩 if문을 이용하여 369게임에서 이 수가 박수를 몇 번 쳐야 하는지 출력해주세요.
       System.out.println("1~99 사이의 정수 1개를 입력해주세요.");
       
       int i5 = sc.nextInt();
       int x = i5 / 10;
       int y = i5 % 10;
       int clap;
       
       if(i5 >= 1 && i5 < 30) 
    	   clap = x * 3 + y / 3;
       else {
    	   if((x % 3) == 0)
    		   clap = x * 3 + y / 3 + y + 1;
    	   else
    		   clap = x * 3 + y / 3 + (i5 / 30) * 10 ;
       }
       System.out.println("박수 횟수: "+clap);
    	   
    	   
    	   
        // 6. 다음 조건문을 조건 연산자를 이용해 한 문장으로 표현해주세요.
        int a = 50;
        if(a > 100) a = 100;
        else a = 0;
       
        a = (a > 100)? 100:0;
       
        // 7-1. Scanner를 이용하여 월(1~12 중 하나)를 입력받아주세요.
        // 7-2. 중첩 if문을 이용해서 어떤 계절인지 출력해주세요. (3~5 봄, 6~8 여름, 9~11 가을, 12~2 겨울)
        // 7-3. switch-case문을 이용해서 어떤 계절인지 출력해주세요.
       int month = sc.nextInt();
       String season1;
       
       //중첩 if문
       if(month >= 3 && month <= 11) {
    	   if(month <= 5) 
    		   season1 = "봄";
    	   else {
    		   if(month <=8)
    			   season1 = "여름";
    		   else season1 = "가을";
    	   }
       }
       else season1 = "겨울";
       
       System.out.println(season1);
       
       //switch-case문
       String season2;
       switch(month) {
       		case 3:
       		case 4:
       		case 5:
       			season2 = "봄";
       			break;
       		case 6:
       		case 7:
       		case 8:
       			season2 = "여름";
       			break;
       		case 9:
       		case 10:
       		case 11:
       			season2 = "가을";
       			break;
       		default:
       			season2 = "겨울";
       }
        System.out.println(season2);
        
       
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
        
        i8 = 0;
        char c2 = c1;
        if(c2 == 'A') i8 += 100;
        if(c2 == 'B') i8 += 50;
        if(c2 == 'C') i8 += 30;
        if(c2 == 'D') i8 += 10;
        if(c2!='A' && c2!='B' && c2!='C' && c2!='D') i8 += 5;
        System.out.println("c1: "+c2+" i8: "+i8);
    }
}