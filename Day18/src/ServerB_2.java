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
			System.out.println("���� ��� ��...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				int a, b, c, res;
				char op;
				String clientInput = in.readLine();
				if(clientInput.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ ������ ����");
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
				System.out.println("Ŭ���̾�Ʈ: " + clientInput);
				if(Integer.parseInt(clientInput) == res)
					out.write("�����Դϴ�.\n");
				else out.write("Ʋ�Ƚ��ϴ�.\n");
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