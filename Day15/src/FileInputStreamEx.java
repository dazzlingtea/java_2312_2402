import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\nr\\Desktop\\text4.txt");
			int i=0, c; // i ¿Œµ¶Ω∫
			while((c = fin.read()) != -1) {
				b[i] = (byte)c;
				i++;
			}
			for(byte j: b)
				System.out.println(j);
			fin.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
