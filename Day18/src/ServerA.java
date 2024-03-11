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
			System.out.println("���� ��� ��...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String clientInput = in.readLine();
				if(clientInput.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ ������ ����");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ: "+clientInput);
				System.out.println("���� ������ >>> ");
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
				System.out.println("��� �� ���� �߻�");
			}
		}
		
	}

}
