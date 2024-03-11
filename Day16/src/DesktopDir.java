import java.io.*;
import java.text.*; //decimal���� Ŭ���� ���

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
			String formatSize = df.format(sz); //%10s�� ������ ����
			if(isd) formatSize = "";
			
			//%tF %tp(��������) %tH:%tm  %tI (12�ð�)
			System.out.printf("%tF %tH:%tm\t%s\t%10s\t%s\n", t, t, t, dir, sz, name);
			//System.out.println(t+"\t"+isd+"\t"+sz+"\t"+name);
			count++;
			totalbyte +=file.length();
		}
		System.out.println("\t"+count+"�� ����\t"+totalbyte+"����Ʈ");
		System.out.println("\t"+dircount+"�� ���͸�");
		
		//System.out.printf("\t\t%d�� ����\t\t%s ����Ʈ\n", count, formatSize);
		System.out.printf("\t\t%d�� ���丮", dircount);
	}

}
