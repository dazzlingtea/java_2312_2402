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
		return String.format("{%d�� �Խñ�, �ۼ���: %s ����: %s ����: %s}",
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
			System.out.println("���� �Ϸ�");
			
			while(true) {
				System.out.println("TextBoard ����");
				System.out.print("��ɾ� �Է� >> ");
				String cmd = sc.nextLine();
				
				if(cmd.equals("/login")) {
					stmt = conn.createStatement();
				}
				
				else if(cmd.equals("/user/write")) {
					System.out.print("���� �Է� >>");
					title = sc.nextLine();
					System.out.print("���� �Է� >>");
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
			System.out.println("jdbc ����̹� �ε� ����");
		} catch(SQLException e) {
			System.out.println("DB ���� ����!");
		}
		
		
		

	}

}
