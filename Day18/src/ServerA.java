import java.net.*;
import java.io.*;
import java.util.*;

public class ServerA {
	public static void main(String[] args) {
		ServerSocket listener = null; // null  IOException
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
				System.out.println("클라이언트: "+clientInput);
				System.out.println("답장 보내기 >>> ");
				String serverOutput = sc.nextLine();
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
