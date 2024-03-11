import java.util.*;
import java.io.*;

public class Assignment15Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� FileWriter�� �̿��Ͽ� 5���� �̸��� ������ �� �ٷ� �Է¹޾�
        // ����ȭ�鿡 scores.txt�� �������ּ���
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
        
		// 2. 1������ ������ scores.txt�� �о�� ȭ�鿡 ������ּ���
		
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
		
        // 3. C:\Windows\system.ini ������ �о�� ��� ���ڸ� �ҹ��ڷ� �ٲپ� ������ּ���
		
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
		
        // 4. C:\Windows\system.ini ������ �о�� ���� �տ� �� ��ȣ�� �ٿ� ������ּ���
        // ����) 01: ; for 16-bit app support
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