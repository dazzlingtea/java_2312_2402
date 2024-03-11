import java.util.Scanner;
public class OvenClockAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // 의미없는 if문 깔끔하게 정리
        
        B += C; // 반복되는 계산식을 미리 수행
        
        if (B > 59) {
            // 변수명 직관적으로 변경
            int addHour = B / 60; // 더해질 시간
            int hour = (A + addHour) % 24; // 굳이 아래 조건문 필요없이 처리
            int min = B % 60; // hour와 동일한 방식
            
            System.out.println(hour + " " + min);
            
            /* 이 조건문은 C가 60이하로 들어올 경우에만 참입니다.
            if (A == 23) {
                System.out.println((addHour-1)+" "+min);
            } else
                System.out.println((A+addHour)+" "+min);
            */
        } else System.out.println(A+" "+(B));
    }
}