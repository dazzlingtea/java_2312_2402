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
							System.out.println("이동이 불가능합니다.");
						else
							f = f.getParentFile();
					}
					else if(spl[1].equals(".")) { // 현재 경로
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
							System.out.println("디렉토리가 존재하지 않습니다.");
						else if(!isdir)
							System.out.println("입력한 정보는 파일입니다.");
						else 
							f = new File(nextPath + "\\");
					}
					break;
					
				case "dir":
					System.out.println(f.getPath() + " 디렉터리");
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
					// listFiles 출력(숨김, 시스템 파일도 리스트로)과 cmd dir(숨김, 시스템 파일 X)은 다름
					DecimalFormat df = new DecimalFormat("###,###");
					String formatSize = df.format(filesz);
					
					System.out.printf("\t\t%d개 파일\t\t%s 바이트\n", count, formatSize);
					System.out.printf("\t\t%d개 디렉토리\n", dircount);
					break;
					
//					3. copy 파일명1 파일명2
//					파일명1 파일을 파일명2로 복사합니다. (바이너리 복사로 진행)
//					-> 단, 현재 디렉토리에 파일명1이 없는 경우 "파일이 존재하지 않습니다."
				case "copy":
					String fileName1 = f.getPath() +"\\"+ spl[1];
					File src = new File(fileName1);
					
					if(!src.exists())  System.out.println("파일이 존재하지 않습니다.");
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
//					현재 날짜를 아래 예시와 같은 형태로 출력
//					<예시>
//					현재 날짜: 2024-01-24
				case "date":
					Date currentDate = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String formatDate = sdf.format(currentDate);
					System.out.println("현재 날짜: " + formatDate);
					break;
					
//					5. time
//					현재 시간을 아래 예시와 같은 형태로 출력
//					<예시>
//					현재 시간: 21:16:06
				case "time":
					Calendar cld = Calendar.getInstance();
					System.out.printf("현재 시간: %2d:%2d:%2d\n"
							, cld.get(Calendar.HOUR_OF_DAY)
							, cld.get(Calendar.MINUTE)
							, cld.get(Calendar.SECOND));
					break;
					
//					6. exit
//					프로그램 종료
				case "exit":
					System.exit(0);
					break;
//
//					7. mkdir 폴더이름
//					현재 디렉토리에 폴더이름으로 디렉토리 생성
				case "mkdir":
					String newFolderName = f.getPath() +"\\"+ spl[1];
					File newFolder = new File(newFolderName);
					newFolder.mkdir();
					break;
					
//					8. cls
//					창을 클리어 (10번 엔터로 대체합니다.)
				case "cls":
					System.out.print("\n\n\n\n\n\n\n\n\n\n");
					break;
					
//					9. chdir
//					현재 디렉토리의 경로를 보여줍니다.
				case "chdir":
					System.out.println(f.getPath());
					break;
					
//					10. type 파일이름
//					파일 이름의 내용을 보여줍니다.
//					-> 파일이 없는 경우 "파일이 존재하지 않습니다."
//					-> 디렉토리인 경우 "입력한 정보는 디렉토리입니다."
				case "type":
						File fileToCheck = new File(f.getPath(), spl[1]);

						if(!fileToCheck.exists())
							System.out.println("파일이 존재하지 않습니다.");
						else if(fileToCheck.isDirectory())
							System.out.println("입력한 정보는 디렉토리입니다.");
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
