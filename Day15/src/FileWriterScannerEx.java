import java.io.*;
import java.util.Scanner;

public class FileWriterScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("C:\\Users\\nr\\Desktop\\text3.txt");
			while(true) {
				String str = sc.nextLine();
				if(str.length() == 0) break;
				
				fout.write(str, 0, str.length());
				//그래서 줄바꿈 추가
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
		// 엔터는 안 들어가 있음 scanner는 마지막 줄바꿈까진 안 받아서..
	}

}
