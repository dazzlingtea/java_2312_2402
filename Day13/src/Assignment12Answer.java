import java.util.*;
public class Assignment12Answer{
    public static void main(String[] args) {
        // 1. Scanner를 사용하기 위한 2가지 문장을 위치에 맞게 입력해주세요.
       Scanner sc = new Scanner(System.in);
       
        // 2. Calendar 클래스를 이용해 현재 시간에 따른 문구를 출력하게 해주세요.
        // 현재 시간이 3:00 ~ 11:59면 Good Morning, 12:00 ~ 16:59면 Good Afternoon
        // 17:00~22:59 이면 Good Evening, 23:00~2:59면 Good Night을 출력합니다.
       Calendar c = Calendar.getInstance();
       int h = c.get(Calendar.HOUR_OF_DAY);
       if(h >= 3 && h<12) System.out.println("Good Morning");
       else if(h >=12 && h<17) System.out.println("Good Afternoon");
       else if(h >= 17 && h<23) System.out.println("Good Evening");
       else System.out.println("Good Night");
       
        // 3. 랜덤 기능을 이용하여 랜덤 학점(0.0, 0.5, 1.0, 1.5, ... 4.5) 가 출력되는 코드를 작성해주세요.
       Random r = new Random();
       double grade = r.nextInt(10) / 2.0;
       System.out.println(grade);
       
        // 4. 현재 시간과 2024년 1월 1일 0시 0분 0초 (한국시간 기준) 이 몇 초 차이가 나는지 출력하는 코드를 작성해주세요.
       Calendar c4 = Calendar.getInstance(); //기준\
       c4.set(2024, 0, 1, 0, 0, 0);
       
        // 5. 아래 문자열에서 단어 사이에 있는 수들의 합을 구하는 코드를 작성해주세요.
        String s51 = "hello123java45is91fun14"; // 정답 273
        String s52 = "100hidden30number10finding20is40so60hard20"; // 정답 280
        String s53 = "a1b2c3d4e5f6g7"; // 정답 28
       
        String[] s51a = s51.split("[a-z]");
        String[] s52a = s52.split("[a-z]");
        String[] s53a = s53.split("[a-z]");
        
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(String i: s51a) {
        	if(i.length() > 0)
        		sum1 += Integer.parseInt(i);
        }
        for(String i: s52a) {
        	if(i.length() > 0)
        		sum2 += Integer.parseInt(i);
        }
        for(String i: s53a) {
        	if(i.length() > 0)
        		sum3 += Integer.parseInt(i);
        }
        System.out.println(sum1 + " " + sum2 + " " + sum3);
        
    }
}