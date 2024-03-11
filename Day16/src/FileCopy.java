import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Windows\\system.ini");
		File dest = new File("C:\\Users\\nr\\Desktop\\system.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		
		int c;
		while((c=fr.read()) != -1) {
			fw.write((char)c);
		}
		fr.close();
		fw.close();
	}

}
