package community;
import java.sql.*;
import java.util.*;

public class Membership {
	static Scanner sc;
	static String loginId = null;
	
	static void printTable(ResultSet rs) throws SQLException {
		while(rs.next()) {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			
			System.out.println();
		}
	}
	
	static void register(Statement stmt) {
		System.out.print("���̵�(�ʼ�) >>> ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ(�ʼ�) >>> ");
		String pw = sc.nextLine();
		System.out.print("�̸�(�ʼ�) >>> ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ(�ʼ�) >>> ");
		String phone = sc.nextLine();
		
		System.out.print("����(����) >>> ");
		String gender = sc.nextLine();
		System.out.print("�ּ�(����) >>> ");
		String address = sc.nextLine();
		System.out.print("�������(����) >>> ");
		String birth = sc.nextLine();
		System.out.print("����(����) >>> ");
		String ageInput = sc.nextLine();
		int age = 0;
		if(!ageInput.isEmpty()) 
			age = Integer.parseInt(ageInput);
		
		String sql = String.format("INSERT INTO member (id, password, name, phone) VALUES "
		 + "('%s', '%s', '%s', '%s')", id, pw, name, phone);
		
		try {
			int count = stmt.executeUpdate(sql);
			if(count == 1) {
				System.out.println("�ʼ��� ó�� �Ϸ�");
				if(gender.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET gender='%s' WHERE id='%s'", gender, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("���� ó�� ����");
				}
				if(address.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET address='%s' WHERE id='%s'", address, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("�ּ� ó�� ����");
				}
				if(birth.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET birth='%s-%s-%s' WHERE id='%s'",
							birth.substring(0, 4),
							birth.substring(4, 6),
							birth.substring(6, 8), id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("������� ó�� ����");
				}
				if(age > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET age='%d' WHERE id='%s'", age, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("���� ó�� ����");
				}
			}	
			else
				System.out.println("�ʼ��� ó�� �� ���� �߻�");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	static void login(Statement stmt) {
			while(true) { 
				System.out.print("���̵� �Է� >>> ");
				String id = sc.nextLine();
				System.out.print("��й�ȣ �Է� >>> ");
				String pw = sc.nextLine();
				
				try {
					String sql = String.format("SELECT * FROM sampledb.member "
							+ "WHERE id='%s' AND password='%s'", id, pw);
					ResultSet rs = stmt.executeQuery(sql);
					String loginId = null;
					while(!rs.next()) {
						loginId = rs.getString("id");
					}
					if(loginId.equals(id)) {
					System.out.println(id + "�� ȯ���մϴ�!");
					}
					else System.out.println("�α��� ����!");
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
	}
	static void mypage(Statement stmt) {
		if(loginId.equals(null)) {
			System.out.println("�α����� ���� ���ּ���");
			return;
		}
		String sql = String.format("SELECT * FROM sampledb.member " 
				+ "WHERE id='%s'", loginId);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
			System.out.println("�̸�: "+ rs.getString("name"));
			System.out.println("����: "+ rs.getString("gender"));
			System.out.println("��ȭ��ȣ: "+ rs.getString("phone"));
			System.out.println("�ּ�: "+ rs.getString("address"));
			System.out.println("�������: "+ rs.getString("birth"));
			System.out.println("����: "+ rs.getInt("age"));
			System.out.println("������ ������ �Է��ϼ��� >>> ");
			String inputEdit = sc.nextLine();
			System.out.println("������ ������ �Է��ϼ��� >>> ");
			String inputContent = sc.nextLine();
			if(inputEdit.equals("�������")) {
				String sqlB = String.format("UPDATE sampledb.member "
						+ "SET birth='%s-%s-%s' WHERE id='%s'",
						inputContent.substring(0, 4),
						inputContent.substring(4, 6),
						inputContent.substring(6, 8));
				int countB = stmt.executeUpdate(sqlB);
				if(countB != 1) System.out.println("������� ó�� ����");
				else System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			}
			else if(inputEdit.equals("���")) {
				return;
			}
			else {
				String sqlColumn = null;
				switch(inputEdit) {
				case "�̸�": sqlColumn = "name"; break;
				case "����": sqlColumn = "gender"; break;
				case "��ȭ��ȣ": sqlColumn = "phone"; break;
				case "�ּ�": sqlColumn = "address"; break;
			}
			String sqlB = String.format("UPDATE sampledb.member"
					+ " SET %s='%s' WHERE id='%s'",
					sqlColumn, inputContent, loginId);
			int countB = stmt.executeUpdate(sqlB);
			if(countB != 1) System.out.println(inputEdit+" ó�� ����");
			else System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			}
		}	
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	static void logout() {
		loginId = null;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "8730");
			System.out.println("���� �Ϸ�!");
			
			while(true) {
				System.out.print("��带 �����ϼ���(ȸ������/�α���) >>> ");
				String mode = sc.nextLine();
				Statement st1 = conn.createStatement();
				if(mode.equals("ȸ������")) register(st1);
				else if(mode.equals("�α���")) login(st1);
				else if(mode.equals("��������")) mypage(st1);
				else if(mode.equals("�Խñ� �Է�")) Board.createArticle(st1, loginId, sc);
				else if(mode.equals("�Խñ�")) Board.getBoard(st1);
				else if(mode.equals("�Խñ� ����")) Board.getArticle(st1, sc);
				else break;
			}
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����!");
		}


	}

}
