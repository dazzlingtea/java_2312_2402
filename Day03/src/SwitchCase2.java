
public class SwitchCase2 {

	public static void main(String[] args) {
		//double d = 3.14;
		//switch(d) switch안에 실수X 불린X 문자, 정수, 리터럴 가능)
		
		//문자 char O
		char a = 'A';
		switch(a) {
		case 'A':
			
		}
		//정수 리터럴 byte 범위를 벗어날 수 X
		//정수 리터럴 short
		short c = 1;
		switch(c) {
			case 0:
			//
				break;
		}
		//정수 리터럴 
		int d = 1;
			switch(d) {
			case 0:
				break;
			case 1+1:
				break;
			case 0x2A: // 리터럴 됨 42
				break;
				
			}
		//정수 리터럴 long 안됨
		//String 문자열 리터럴
		String f = "사과";
		switch(f) {
		case "사과":
		case "qo":
			// case '가': 문자 != 문자열
			break;	
		}
		int g = 100;
		//변수는 case에 들어갈 수 없음
	
	}

}
