import java.io.*;
import java.text.*; //decimal포맷 클래스 사용

public class DesktopDir{

	public static void main(String[] args) throws IOException  {
		
		File f = new File("C:\\Users\\nr\\Desktop");
		File[] files = f.listFiles();
		String dir;
		int count=0;
		long totalbyte=0;
		int dircount=0;
		
		
		for(File file: files) {
			long t = file.lastModified();
			boolean isd = file.isDirectory();
			if(isd) {
				dir = "<DIR>";
				dircount++;
			} else dir = "";
			long sz = file.length();
			String name = file.getName();
			
			//String sisd = "";
			//if(isd) sisd = "<DIR>";
			
			//if(isd) dircount++;
			//else {count++; filesize}
			
			DecimalFormat df = new DecimalFormat("###,###");
			String formatSize = df.format(sz); //%10s로 오른쪽 정렬
			if(isd) formatSize = "";
			
			//%tF %tp(오전오후) %tH:%tm  %tI (12시간)
			System.out.printf("%tF %tH:%tm\t%s\t%10s\t%s\n", t, t, t, dir, sz, name);
			//System.out.println(t+"\t"+isd+"\t"+sz+"\t"+name);
			count++;
			totalbyte +=file.length();
		}
		System.out.println("\t"+count+"개 파일\t"+totalbyte+"바이트");
		System.out.println("\t"+dircount+"개 디렉터리");
		
		//System.out.printf("\t\t%d개 파일\t\t%s 바이트\n", count, formatSize);
		System.out.printf("\t\t%d개 디렉토리", dircount);
	}

}
