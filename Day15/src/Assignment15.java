import java.util.*;
import java.io.*;

public class Assignment15
{
    public static void main(String[] args) {
        // 1. Scanner�� FileWriter�� �̿��Ͽ� 5���� �̸��� ������ �� �ٷ� �Է¹޾�
        // ����ȭ�鿡 scores.txt�� �������ּ���
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
        
		// 2. 1������ ������ scores.txt�� �о�� ȭ�鿡 ������ּ���
		
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
		
        // 3. C:\Windows\system.ini ������ �о�� ��� ���ڸ� �ҹ��ڷ� �ٲپ� ������ּ���
		
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
		
        // 4. C:\Windows\system.ini ������ �о�� ���� �տ� �� ��ȣ�� �ٿ� ������ּ���
        // ����) 01: ; for 16-bit app support
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