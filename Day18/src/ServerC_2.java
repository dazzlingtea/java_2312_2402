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
				if(hm.containsKey(clientInput)) {
					String result = clientInput + "�� "+hm.get(clientInput)+"�Դϴ�.";
					out.write(result+"\n");
				}
				else {
					String result = clientInput + "�� ��ܿ� �����ϴ�.";
					out.write(result + "\n");
				}

				System.out.println("Ŭ���̾�Ʈ: " + clientInput);

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
				System.out.println("��� �� ���� �߻�");
			}
		}

	}

}
