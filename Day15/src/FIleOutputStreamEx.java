import java.io.*;
public class FIleOutputStreamEx {

	public static void main(String[] args) {
		byte[] b = {5, 17, -1, 3, 4, 100};
		
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\nr\\Desktop\\text4.txt");
			for(byte i: b) 
				fout.write(i);
			fout.close();				
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
