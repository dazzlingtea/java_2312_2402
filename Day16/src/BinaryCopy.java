import java.io.*;
public class BinaryCopy {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\nr\\Desktop\\신분증사진3.jpg");
		File dest = new File("C:\\Users\\nr\\Desktop\\신분증사진3_copy.jpg");
		
		FileInputStream fin = new FileInputStream(src);
		FileOutputStream fout = new FileOutputStream(dest);
		
		int c; 
		while((c = fin.read()) != -1) {
			fout.write((byte)c);;
		}

		fin.close();
		fout.close();	
		

	}

}
