import java.io.*;
public class BlockBinaryCopy {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\nr\\Desktop\\신분증사진3.jpg");
		File dest = new File("C:\\Users\\nr\\Desktop\\신분증사진3_copy.jpg");
		
		FileInputStream fin = new FileInputStream(src);
		FileOutputStream fout = new FileOutputStream(dest);
		
		byte buf[] = new byte[1024]; //1KB 크기의 버퍼
		while(true) {
			int n = fin.read(buf);//버퍼 크기만큼 읽어서 읽은 크기를 반환
			System.out.println(n);
			fout.write(buf, 0, n); //buf[0~ n-1]까지 입력함
			if(n<buf.length) // 더 읽을 필요 없으니까 
				break;
		}

		fin.close();
		fout.close();	
		

	}

}
