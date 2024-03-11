import java.io.*;
import java.util.concurrent.*; //�ڵ�ð� ���������ִ� �뵵

public class FileEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Windows\\system.ini");
		File f2 = new File("C:\\ProgramData");
		File f3 = new File("C:\\HelloJava");
		
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath()); //������
		System.out.println(f.getCanonicalPath());//�����, ��
		
		System.out.println(f.getParent());
		System.out.println(f.getName());
		
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f2.isHidden());//���� ������ true
		System.out.println(f.isDirectory());
		System.out.println(f2.isDirectory());
		
		System.out.println(f.exists());
		System.out.println(f3.exists());
		
		//f.delete();
		//f.renameTo(f3);
		
		System.out.println(f.length()); //219����Ʈ
		System.out.println(f.lastModified());//Ÿ�ӽ����� 1575709962|747 �и��� �ڸ��� epochŸ��
		
		File f4 = new File("C:\\Users\\nr\\Desktop\\Hello");
		System.out.println(f4.mkdir());
		f4.delete();
		f4.mkdir();
		TimeUnit.SECONDS.sleep(1); // �ð� ����
		
		File f5 = new File("C:\\Users\\nr\\Desktop\\Hello2");
		f4.renameTo(f5);
		
		File f6 = new File("C:\\Users\\nr\\Desktop");
		String[] files = f6.list();
		for(String file: files) {
			System.out.println(file);
		}
		
		File[] files2 = f6.listFiles();
		for(File file2: files2) {
			System.out.println(file2);
		}
		
	}

}
