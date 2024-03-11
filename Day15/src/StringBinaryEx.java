import java.io.*;
import java.util.*;

public class StringBinaryEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char c[] = s.toCharArray();
		
		byte[] b = new byte[s.length() * 2];
		// 문자열 바이트로 바꾸기
		for(int i =0; i<c.length; i++) {
			b[i*2] = (byte)(c[i] / 256 - 128); // 0~256 -> -128 ~127
			b[i*2+1] = (byte)(c[i] % 256 - 128);
		}
		
		// 파일에 저장
		int cur;
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\nr\\Desktop\\text5.txt");
			fout.write(b);
			fout.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		// 파일에 저장된 바이너리 읽어와서 문자열로 바꾸기
		byte bin[] = new byte[200];
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\nr\\Desktop\\text5.txt");
			int size = fin.read(bin); //저장하고
			for(int i=0; i<size/2; i++) {
				// (b[0] +128)*256 + b[1]+128
				int key = (b[i*2] +128)*256 + b[i*2+1]+128;
				System.out.print((char)key);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
