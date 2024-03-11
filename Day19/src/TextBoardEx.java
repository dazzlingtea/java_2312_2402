import java.util.*;
import java.sql.*;

class Article1 {
	int id_board = 0;
	String author;
	String title;
	String content;

	Article1(String author, String title, String content) {
		this.author = author;
		this.title = title;
		this.content = content;
		++this.id_board;
	}
	
	public String toString() {
		return String.format("{%d번 게시글, 작성자: %s 제목: %s 내용: %s}",
				id_board, author, title, content);
	}
}

public class TextBoardEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String content;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "8730");
			System.out.println("연결 완료");
			
			while(true) {
				System.out.println("TextBoard 시작");
				System.out.print("명령어 입력 >> ");
				String cmd = sc.nextLine();
				
				if(cmd.equals("/login")) {
					stmt = conn.createStatement();
				}
				
				else if(cmd.equals("/user/write")) {
					System.out.print("제목 입력 >>");
					title = sc.nextLine();
					System.out.print("내용 입력 >>");
					content = sc.nextLine();
				}
				else if(cmd.equals("/user/detail")) {
					
				}
				else if(cmd.equals("/user/exit")) {
					System.exit(0);
					break;
				}
			}
		} catch(ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 로딩 에러");
		} catch(SQLException e) {
			System.out.println("DB 연결 실패!");
		}
		
		
		

	}

}
