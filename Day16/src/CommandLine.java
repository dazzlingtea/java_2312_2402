import java.io.*;
import java.util.*;
import java.text.*;

public class CommandLine {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String current = "C:\\";
		File f = new File(current);
		while(true) {
			System.out.print(f.getPath()+"> ");
			String s = sc.nextLine();
			String[] spl = s.split(" ");
			switch(spl[0]) {
				case "cd":
					if(spl[1].equals("..")) {
						if(f.getPath().equals("C:\\"))
							System.out.println("�̵��� �Ұ����մϴ�.");
						else
							f = f.getParentFile();
					}
					else if(spl[1].equals(".")) { // ���� ���
						continue;
					}
					else {
						String nextPath = f.getPath() + "\\" + spl[1];
						String[] files = f.list();
						boolean exist = false;
						boolean isdir = false;
						for(String file: files) {
							if(file.equals(spl[1])) {
								exist = true;
								File nfile = new File(nextPath);
								isdir = nfile.isDirectory();
							}
						}
						if(!exist)
							System.out.println("���丮�� �������� �ʽ��ϴ�.");
						else if(!isdir)
							System.out.println("�Է��� ������ �����Դϴ�.");
						else 
							f = new File(nextPath + "\\");
					}
					break;
					
				case "dir":
					System.out.println(f.getPath() + " ���͸�");
					File files[] = f.listFiles();
					
					int count = 0, dircount = 0;
					long filesz = 0;
					for(File file: files) {
						long t = file.lastModified();
						boolean isd = file.isDirectory();
						long sz = file.length();
						String name = file.getName();
						
						String sisd = "";
						if(isd) {
							sisd = "<DIR>";
							dircount++;
						}
						else {
							count++; 
							filesz += sz;
						}
						
						DecimalFormat df = new DecimalFormat("###,###");
						String formatSize = df.format(sz);
						if(isd) formatSize = "";
						
						System.out.printf("%tF  %tp %tI:%tM\t%s\t%10s\t%s\n",
										 t, t, t, t, sisd, formatSize, name);
					}
					// listFiles ���(����, �ý��� ���ϵ� ����Ʈ��)�� cmd dir(����, �ý��� ���� X)�� �ٸ�
					DecimalFormat df = new DecimalFormat("###,###");
					String formatSize = df.format(filesz);
					
					System.out.printf("\t\t%d�� ����\t\t%s ����Ʈ\n", count, formatSize);
					System.out.printf("\t\t%d�� ���丮\n", dircount);
					break;
					
//					3. copy ���ϸ�1 ���ϸ�2
//					���ϸ�1 ������ ���ϸ�2�� �����մϴ�. (���̳ʸ� ����� ����)
//					-> ��, ���� ���丮�� ���ϸ�1�� ���� ��� "������ �������� �ʽ��ϴ�."
				case "copy":
					String fileName1 = f.getPath() +"\\"+ spl[1];
					File src = new File(fileName1);
					
					if(!src.exists())  System.out.println("������ �������� �ʽ��ϴ�.");
					else {
								String fileName2 = f.getPath() +"\\"+ spl[2];
								File dest = new File(fileName2);
								FileInputStream fi = new FileInputStream(src);
								FileOutputStream fou = new FileOutputStream(dest);
								
								byte buf[] = new byte[1024]; 
								while(true) {
									int n = fi.read(buf);
									fou.write(buf, 0, n); 
									if(n<buf.length) break;
								}
								fi.close();
								fou.close();
						}
					break;
//
//					4. date
//					���� ��¥�� �Ʒ� ���ÿ� ���� ���·� ���
//					<����>
//					���� ��¥: 2024-01-24
				case "date":
					Date currentDate = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = sdf.format(currentDate);
					System.out.println("���� ��¥: " + formatDate);
					break;
					
//					5. time
//					���� �ð��� �Ʒ� ���ÿ� ���� ���·� ���
//					<����>
//					���� �ð�: 21:16:06
				case "time":
					Calendar cld = Calendar.getInstance();
					System.out.printf("���� �ð�: %2d:%2d:%2d\n"
							, cld.get(Calendar.HOUR_OF_DAY)
							, cld.get(Calendar.MINUTE)
							, cld.get(Calendar.SECOND));
					break;
					
//					6. exit
//					���α׷� ����
				case "exit":
					System.exit(0);
					break;
//
//					7. mkdir �����̸�
//					���� ���丮�� �����̸����� ���丮 ����
				case "mkdir":
					String newFolderName = f.getPath() +"\\"+ spl[1];
					File newFolder = new File(newFolderName);
					newFolder.mkdir();
					break;
					
//					8. cls
//					â�� Ŭ���� (10�� ���ͷ� ��ü�մϴ�.)
				case "cls":
					System.out.print("\n\n\n\n\n\n\n\n\n\n");
					break;
					
//					9. chdir
//					���� ���丮�� ��θ� �����ݴϴ�.
				case "chdir":
					System.out.println(f.getPath());
					break;
					
//					10. type �����̸�
//					���� �̸��� ������ �����ݴϴ�.
//					-> ������ ���� ��� "������ �������� �ʽ��ϴ�."
//					-> ���丮�� ��� "�Է��� ������ ���丮�Դϴ�."
				case "type":
						File fileToCheck = new File(f.getPath(), spl[1]);

						if(!fileToCheck.exists())
							System.out.println("������ �������� �ʽ��ϴ�.");
						else if(fileToCheck.isDirectory())
							System.out.println("�Է��� ������ ���丮�Դϴ�.");
						else {
							FileInputStream fin = new FileInputStream(fileToCheck);
							byte buf[] = new byte[1024];
							
							while(true) {
								int n = fin.read(buf);
								 String content = new String(buf, 0, n, "EUC-KR");
					             System.out.print(content); 
								if(n<buf.length)
									break;
							}
							System.out.println();
							fin.close();
						}
					break;
			}
			
		}
		
		
	}

}
