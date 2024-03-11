import java.util.Scanner;
public class Assignment5
{	
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
       Scanner sc = new Scanner(System.in);
       
       	// 2. while문과 break문을 이용하여 계속해서 정수를 입력받다가
       	// 0을 입력받으면 반복문을 탈출하는 코드를 작성해주세요.
       	int i2 = sc.nextInt();
       	while(i2 != 0) {
    	   System.out.println(i2);
    	   if(i2 == 0)
    		   break;
    	   i2 = sc.nextInt();
       	}
       
        // 3. 아래 설명을 보고 배열을 선언하세요
        // 3-1. 10개의 문자를 가지는 배열 c를 선언, 생성해주세요.
       		char c[];
       		c = new char[10];
        // 3-2. 0부터 5까지 정수 값으로 초기화된 정수 변수 n을 선언, 생성해주세요.
       		int n[] = {0, 1, 2, 3, 4, 5};
        // 3-3. 요일 값을 저장하는 문자열 배열 day를 선언, 생성해주세요.
       		String day[] = {"월", "화", "수", "목", "금", "토", "일"};
        // 3-4. 4개의 논리 값을 가지는 배열 b를 선언하고 true, false, true, false로 초기화해주세요.
       		boolean b[] = new boolean[4];
       		b = new boolean[]{true, false, true, false};
       
        // 4. 아래 자바 코드를 보고 올바르게 코드가 실행되도록 수정해주세요.
        int array4[];
        array4 = new int[2];
        array4[0] = 1;
        array4[1] = array4[0] + 1;
       
        // 5. 다음 alpha 배열에 있는 문자를 모두 출력하려고 합니다. 빈 칸에 적절한 코드를 작성해주세요.
        // 5-1
        char alpha1[] = {'a', 'b', 'c', 'd'};
        for(int i=0 ; i<alpha1.length ; i++)
            System.out.print(alpha1[i]);
       
        char alpha2[] = {'a', 'b', 'c', 'd'};
        for(char i: alpha2)
            System.out.print(i);
        System.out.println();
        
        // 6-1. 양의 정수 10개를 입력받아 배열에 저장해주세요.
        // 6-2. 배열에 있는 정수 중에서 3의 배수만 출력해주세요.
        int Array6[] = new int[10];
        for(int i=0; i<10 ; i++) {
        	Array6[i] = sc.nextInt();
        }
        for(int i: Array6) {
        	if(i % 3 == 0)
        		System.out.print(i +" ");
        }
        System.out.println();
        
        // 7-1. 정수 10개를 저장하는 배열을 만들어주세요.
        int Array7[] = new int[10];
        // 7-2. 1부터 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장해주세요.
        // 1부터 10까지 범위의 정수를 랜덤하게 생성하는 코드는 다음과 같습니다.
        int randomNumber = (int)(Math.random()*10 + 1);
        for(int i=0 ; i<10 ; i++) {
        	randomNumber = (int)(Math.random()*10 + 1);
        	Array7[i] = randomNumber;
        }
        // 7-3. 배열에 저장된 숫자를 한 줄에 모두 출력하고, 그 숫자들의 평균을 출력해주세요.
        int sum = 0;
        for(int i: Array7) {
           System.out.print(i +" ");
           sum += i;
        }
        System.out.println("평균:"+ sum/10.0);
       
        // 8-1. 4x4크기의 2차원 배열을 만들어주세요.
        // 8-2. 각각의 위치에 1부터 10까지의 범위의 정수를 랜덤하게 생성하여 베열에 저장해주세요.
        // 8-3. 2차원 배열을 4x4 형태로 출력해주세요.
       	int Array8[][] = new int[4][4];
        for(int i=0 ; i<4 ; i++) {
        	for(int j=0 ; j<4 ; j++) {
        	randomNumber = (int)(Math.random()*10 + 1);
        	Array8[i][j] = randomNumber;
        	System.out.print(Array8[i][j] +"");
        	}
        	System.out.println();
        }
       	
    }
}