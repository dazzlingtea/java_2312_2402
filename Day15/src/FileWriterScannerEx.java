import java.io.*;
import java.util.Scanner;

public class FileWriterScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("C:\\Users\\nr\\Desktop\\text3.txt");
			while(true) {
				String str = sc.nextLine();
				if(str.length() == 0) break;
				
				fout.write(str, 0, str.length());
				//�׷��� �ٹٲ� �߰�
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
		// ���ʹ� �� �� ���� scanner�� ������ �ٹٲޱ��� �� �޾Ƽ�..
	}

}
