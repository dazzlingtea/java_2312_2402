import java.util.Scanner;
public class ForEachExample {
	enum Week {월,화,수,목,금,토,일}; //메인 메소드 밖에 써야됨
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = {1, 2, 3, 4, 5};
		
		for(int i=0 ; i<n.length ; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
		for(int i: n) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		String fruit[] = new String[5];
		for(int i=0 ; i<fruit.length ; i++) {//입력받을땐 for-each 쓰면 안 됨
			fruit[i] = sc.nextLine();
		}
		for(String s: fruit) { //for-each는 가져올때만 쓰기
			System.out.println(s);
		}
		
		   //각각 Week라는 타입을 가짐
		for(Week day: Week.values())
			System.out.print(day +" ");
		System.out.println(Week.월);
		System.out.println(Week.valueOf("월"));
	}

}
