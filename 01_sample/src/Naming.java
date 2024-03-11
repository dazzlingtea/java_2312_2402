
public class Naming {
	public static void main(String[] args) {
		// 특수문자 불가능, 공백 불가능: 예외 _, $
		int name;
		int _a;
		int $a;
		// int a!; -> 불가능
		
		// 한글 가능
		int 이름;
		
		// 키워드 불가능
		// int if; -> 불가능
		// int public;
		
		// 대소문자 구분
		int Public; // 소문자 public은 키워드
		// 숫자가 앞에 X
		int a1;
		//int 1a; -> 불가능
	}
}
