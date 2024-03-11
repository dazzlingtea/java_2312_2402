import java.io.*;
public class BlockBinaryCopy {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\nr\\Desktop\\�ź�������3.jpg");
		File dest = new File("C:\\Users\\nr\\Desktop\\�ź�������3_copy.jpg");
		
		FileInputStream fin = new FileInputStream(src);
		FileOutputStream fout = new FileOutputStream(dest);
		
		byte buf[] = new byte[1024]; //1KB ũ���� ����
		while(true) {
			int n = fin.read(buf);//���� ũ�⸸ŭ �о ���� ũ�⸦ ��ȯ
			System.out.println(n);
			fout.write(buf, 0, n); //buf[0~ n-1]���� �Է���
			if(n<buf.length) // �� ���� �ʿ� �����ϱ� 
				break;
		}

		fin.close();
		fout.close();	
		

	}

}
