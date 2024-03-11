import java.net.*;
import java.util.*;
import java.io.*;

public class ServerB_2 {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			listener = new ServerSocket(9998);
			System.out.println("연결 대기 중...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				int a, b, c, res;
				char op;
				String clientInput = in.readLine();
				if(clientInput.equals("bye")) {
					System.out.println("클라이언트 측에서 종료");
					break;
				}
				else {
					a = (int)(Math.random()*10);
					b = (int)(Math.random()*10);
					c = (int)(Math.random()*3);
					op = '+';
					res = a + b;
					if(c == 1) {
						op = '-';
						res = a - b;
					}
					else if(c == 2) {
						op = '*';
						res = a * b;
					}
					
					String formula = a + " " + op + " " + b;
					out.write(formula + "\n");
					out.flush();
				}
				
				clientInput = in.readLine();
				System.out.println("클라이언트: " + clientInput);
				if(Integer.parseInt(clientInput) == res)
					out.write("정답입니다.\n");
				else out.write("틀렸습니다.\n");
				out.flush();
			}
			
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch(IOException e) {
				System.out.println("통신 중 오류 발생");
			}
		}
	}
}