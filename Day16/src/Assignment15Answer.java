import java.util.*;
import java.io.*;

public class Assignment15Answer
{
    public static void main(String[] args) {
        // 1. Scanner와 FileWriter를 이용하여 5명의 이름과 점수를 한 줄로 입력받아
        // 바탕화면에 scores.txt로 저장해주세요
    	Scanner sc = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\nr\\Desktop\\scores2.txt");
			for(int i=0; i<5; i++) {
				String str = sc.next();
				int t = sc.nextInt();
				sc.nextLine();
				fw.write(str + " " + t + "\n");
			}
			fw.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
        
		// 2. 1번에서 저장한 scores.txt를 읽어와 화면에 출력해주세요
		
		try {
			FileReader fr = new FileReader("C:\\Users\\nr\\Desktop\\scores2.txt");
			int c;
			while((c=fr.read()) != -1) {
				System.out.print((char)c);
			}
			fr.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		
        // 3. C:\Windows\system.ini 파일을 읽어와 모든 글자를 소문자로 바꾸어 출력해주세요
		
		try {
			FileReader fr = new FileReader("C:\\Windows\\system.ini");
			int c;
			while((c=fr.read()) != -1) {
				System.out.print(Character.toLowerCase((char)c));
			}
			fr.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		
        // 4. C:\Windows\system.ini 파일을 읽어와 파일 앞에 줄 번호를 붙여 출력해주세요
        // 예시) 01: ; for 16-bit app support
        //       02: [386Enh]
        //       03: woafont=dosapp.fon
		try {
			FileReader fr = new FileReader("C:\\Windows\\system.ini");
			int c;
			int line = 1;
			System.out.printf("%02d: ", line);
			
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
				if(c == 10) {
					line++;
					System.out.printf("%02d: ", line);
				}
			}
			fr.close();
		} catch(IOException e) {
			System.out.println(e);
		}
    }
}