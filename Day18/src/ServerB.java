import java.util.*;
import java.net.*;
import java.io.*;

public class ServerB {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결 대기 중...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String clientInput = in.readLine();
				if(clientInput.equals("bye")) {
					System.out.println("클라이언트 측에서 종료");
					break;
				}
				if(clientInput.equals("start")) {
					int a = (int)(Math.random()*10);
					int b = (int)(Math.random()*10);
					System.out.print("퀴즈 부호를 입력하세요");
					String s = sc.next();
					String quiz = a + s + b +"?";
					out.write(quiz+"\n");
					out.flush();
				}
				clientInput = in.readLine();
				System.out.println("클라이언트: " + clientInput);
				String serverOutput = sc.nextLine();
				out.write(serverOutput);
				out.write(serverOutput+"\n");
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
