import java.net.*;
import java.io.*;
import java.util.*;

public class ServerC_2 {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		HashMap<String, String> hm = new HashMap<String, String>();
		try {
			FileReader fin = new FileReader("C:\\Users\\nr\\Desktop\\scores\\scores.txt");
			int c;
			String s="";
			while((c = fin.read()) != -1) {
				char ch = (char)c;
				s += ch;
			}
			String[] str = s.split("[\\s\\n]+");
			for(int i=0; i<str.length-1; i+=2) {
				if(i+1 < str.length) {
					hm.put(str[i], str[i+1]);
					System.out.println(str[i] +" "+ str[i+1]);
				}
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try {
			listener = new ServerSocket(9996);
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
				if(hm.containsKey(clientInput)) {
					String result = clientInput + "는 "+hm.get(clientInput)+"입니다.";
					out.write(result+"\n");
				}
				else {
					String result = clientInput + "는 명단에 없습니다.";
					out.write(result + "\n");
				}

				System.out.println("클라이언트: " + clientInput);

				out.flush();
			}
			
		} catch(IOException e) {
			System.out.println(e);

		} finally {
			try {
				sc.close();
				if(socket != null) socket.close();
				if(listener != null) listener.close();
//				listener.close();
			} catch(IOException e) {
				System.out.println("통신 중 오류 발생");
			}
		}

	}

}
