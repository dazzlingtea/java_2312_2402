import java.io.*;

public class InputStraemEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		while(true) {
			// Ű �Է��� ���� -> Ű�� �ش��ϴ� ���� ��
			int c = rd.read();
			System.out.println(c);
			if(c == -1) // ctrl+z �ؾ� ���� \r 13 \n 10
				break;
		}

	}

}
