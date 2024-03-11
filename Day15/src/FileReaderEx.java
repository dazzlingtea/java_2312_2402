import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("C:\\Users\\nr\\Desktop\\text.txt");
		
		int c;
		while((c = fin.read()) != -1) { //파일을 읽어서 넣고 파일 다보면 end fo file -1
			System.out.print((char)c);
		}
		fin.close();
	}

}
