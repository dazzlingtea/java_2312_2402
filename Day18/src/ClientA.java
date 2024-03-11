import java.net.*;
import java.io.*;
import java.util.*;

public class ClientA {
	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			socket = new Socket("192.168.7.254", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("������ ������ >>> ");
				String clientOutput = sc.nextLine();
				if(clientOutput.equals("bye")) {
					out.write(clientOutput + "\n");
					out.flush();
					break;
				}
				out.write(clientOutput+"\n");
				out.flush();
				String serverInput = in.readLine();
				System.out.println("����: " + serverInput);
			}
			
			
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				sc.close();
				if(socket != null) socket.close();
			} catch(IOException e) {
				System.out.println("���� ��� �� ����");
			}
		}

	}

}
