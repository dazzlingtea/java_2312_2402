import java.io.*;

public class InputStraemEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		while(true) {
			// 키 입력을 받음 -> 키에 해당하는 문자 값
			int c = rd.read();
			System.out.println(c);
			if(c == -1) // ctrl+z 해야 종료 \r 13 \n 10
				break;
		}

	}

}
