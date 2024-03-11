import java.io.*;

public class FileReaderEx2 {

	public static void main(String[] args) {
		FileReader fin;
		try {
			fin = new FileReader("C:\\Windows\\system.ini");
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch(FileNotFoundException e) {
			System.out.println(e);
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			System.out.println(e);
			System.out.println("����� ���� �߻�!");
		} 
		
	}

}
