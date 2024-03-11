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
				
				if(hm.containsKey(clientInput)) {
					String result = clientInput + "�� " + hm.get(clientInput);
					out.write(result + "\n");
				}
				else {
					String result = clientInput + "�� ��ܿ� �����ϴ�";
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
				System.out.println("��� �� ���� �߻�");
			}
		}
		
	}

}