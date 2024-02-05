package community;

import java.sql.*;
import java.util.*;

public class Board {
	static void createArticle(Statement stmt, String loginId, Scanner sc) {
		if(loginId == null) {
			System.out.println("�α����� ���ּ���!");
			return;
		}
		System.out.print("���� �Է� >>> ");
		String title = sc.nextLine();
		System.out.print("���� �Է� >>> ");
		String content = sc.nextLine();
		System.out.print("���� ÷��(����) >>> ");
		String file = sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		long currentMilli = cal.getTimeInMillis();
		
		String sql = String.format("INSERT INTO sampledb.board "
				+ "(title, author, date, content) VALUES "
				+ "('%s', '%s', '%tF %tT', '%s')",
				title, loginId, currentMilli, currentMilli, content);
		try {
			int count = stmt.executeUpdate(sql);
			if(count == 1) {
				System.out.println("�Խñ� �ʼ� �� ó�� �Ϸ�");
				String idSql = String.format("SELECT * FROM sampledb.board "
						+ "WHERE author='%s' AND date='%tF %tT'"
						, loginId, currentMilli, currentMilli);
				ResultSet idrs = stmt.executeQuery(idSql);
				int articleId = 0;
				if(idrs.next())
					articleId = idrs.getInt("id");
				
				if(file.length() > 0) {
					file = file.replaceAll("\\\\", "\\\\\\\\");
					String sqlF = String.format("UPDATE sampledb.board "
							+ "SET file='%s' WHERE id=%d", file, articleId);
					int countF = stmt.executeUpdate(sqlF);
					if(countF != 1) System.out.println("���� ó�� ����!");
				}
			}
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	static void getBoard(Statement stmt) {
		String sql = "SELECT * FROM sampledb.board";
		try {
			ResultSet rs1 = stmt.executeQuery(sql);
			System.out.printf("%-5s\t%-15s\t%-15s\t%-15s\n",
					"ID", "����", "�ۼ���", "�ۼ���");
			int count = 0;
			while(rs1.next()) {
				count++;
				System.out.printf("%-5d\t%-15s\t%-15s\t%-15s\n",
						rs1.getInt("id"), rs1.getString("title"), 
						rs1.getString("author"), 
						rs1.getString("date").substring(0, 10));
			}
			System.out.println("=================================");
			System.out.printf("�Խñ� %d �� �˻���\n", count);
		} catch(SQLException e) {
			System.out.println(e);
		}
	}

	static void getArticle(Statement stmt, Scanner sc) {
		System.out.print("�Խñ� ��ȣ�� �Է��ϼ��� >>> ");
		int articleId = sc.nextInt();
		sc.nextLine();
		
		String sql = String.format("SELECT * FROM sampledb.board "
				+ "WHERE id=%d", articleId);
		try {
			ResultSet rs1 = stmt.executeQuery(sql);
			if(rs1.next()) {
				System.out.println("����: " + rs1.getString("title"));
				System.out.println("�ۼ���: " + rs1.getString("author"));
				System.out.println("����: " + rs1.getString("content"));
				System.out.println("����: " + rs1.getString("file"));
			}
			else {
				System.out.println("���� �Խñ� ��ȣ�Դϴ�.");
				return;
			}
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
	}
}