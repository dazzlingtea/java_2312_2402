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
				if(clientInput.equals("start")) {
					int a = (int)(Math.random()*10);
					int b = (int)(Math.random()*10);
					System.out.print("���� ��ȣ�� �Է��ϼ���");
					String s = sc.next();
					String quiz = a + s + b +"?";
					out.write(quiz+"\n");
					out.flush();
				}
				clientInput = in.readLine();
				System.out.println("Ŭ���̾�Ʈ: " + clientInput);
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
				System.out.println("��� �� ���� �߻�");
			}
		}
		
	}

}
