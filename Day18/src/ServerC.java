import java.net.*;
import java.io.*;
import java.util.*;

public class ServerC {
	public static void main(String[] args) {
		ServerSocket listener = null; // null  IOException
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		
		HashMap<String, String> hm = new HashMap<String,String>();
		
		
		File f = new File("C:\\Users\\Administrator\\Desktop\\scores.txt");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
			String line = "";
			while((line = br.readLine()) != null) {
				String[] spl = line.split(" ");
				hm.put(spl[0], spl[1]);
			}
			br.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		
		try {
			listener = new ServerSocket(9997);
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
				
				if(hm.containsKey(clientInput)) {
					String result = clientInput + "는 " + hm.get(clientInput);
					out.write(result + "\n");
				}
				else {
					String result = clientInput + "는 명단에 없습니다";
					out.write(result + "\n");
				}
				
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