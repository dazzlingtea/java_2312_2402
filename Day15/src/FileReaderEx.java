import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("C:\\Users\\nr\\Desktop\\text.txt");
		
		int c;
		while((c = fin.read()) != -1) { //������ �о �ְ� ���� �ٺ��� end fo file -1
			System.out.print((char)c);
		}
		fin.close();
	}

}
