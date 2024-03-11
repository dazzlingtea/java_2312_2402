import java.util.*;
import java.io.*;

public class Assignment15
{
    public static void main(String[] args) {
        // 1. Scanner와 FileWriter를 이용하여 5명의 이름과 점수를 한 줄로 입력받아
        // 바탕화면에 scores.txt로 저장해주세요
    	Scanner sc = new Scanner(System.in);
		
		try {
			FileWriter fout = new FileWriter("C:\\Users\\nr\\Desktop\\scores.txt");
			for(int i=0; i<5; i++) {
				String str = sc.nextLine();
				fout.write(str, 0, str.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
        
		// 2. 1번에서 저장한 scores.txt를 읽어와 화면에 출력해주세요
		
		try {
			FileReader fin = new FileReader("C:\\Users\\nr\\Desktop\\scores.txt");
			int c;
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		
        // 3. C:\Windows\system.ini 파일을 읽어와 모든 글자를 소문자로 바꾸어 출력해주세요
		
		try {
			FileReader fin = new FileReader("C:\\Windows\\system.ini");
			int c;
			while((c=fin.read()) != -1) {
				System.out.print(Character.toLowerCase((char)c));
			}
			fin.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		
        // 4. C:\Windows\system.ini 파일을 읽어와 파일 앞에 줄 번호를 붙여 출력해주세요
        // 예시) 01: ; for 16-bit app support
        //       02: [386Enh]
        //       03: woafont=dosapp.fon
		try {
			FileReader fin = new FileReader("C:\\Windows\\system.ini");
			BufferedReader br = new BufferedReader(fin);
			int n=1;
			String s;
			
			while((s=br.readLine()) != null) {
				System.out.printf("%02d: %s%n", n, s);
				n++;
			}
			br.close();
			fin.close();
		} catch(IOException e) {
			System.out.println(e);
		}
    }
}