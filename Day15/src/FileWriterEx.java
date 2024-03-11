import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c; // cursor
		try {
			fout = new FileWriter("C:\\Users\\nr\\Desktop\\text2.txt");
			while((c = rd.read()) != -1) {
				fout.write(c);
			}
			rd.close();
			fout.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
