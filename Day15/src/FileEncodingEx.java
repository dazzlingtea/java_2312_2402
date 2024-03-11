import java.io.*;

public class FileEncodingEx {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\nr\\Desktop\\text2.txt");
			in = new InputStreamReader(fin, "UTF-8"); 
			// ÇÑ±Û ±úÁü UTF-16, US-ASCII -> "CP949""EUC-KR""KSC5601" Àß µÊ 
			
			int c;
			System.out.println("charset = " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.println((char)c);
			}
			
			in.close();
			fin.close();
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
