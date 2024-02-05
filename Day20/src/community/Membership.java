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
		System.out.print("아이디(필수) >>> ");
		String id = sc.nextLine();
		System.out.print("비밀번호(필수) >>> ");
		String pw = sc.nextLine();
		System.out.print("이름(필수) >>> ");
		String name = sc.nextLine();
		System.out.print("전화번호(필수) >>> ");
		String phone = sc.nextLine();
		
		System.out.print("성별(선택) >>> ");
		String gender = sc.nextLine();
		System.out.print("주소(선택) >>> ");
		String address = sc.nextLine();
		System.out.print("생년월일(선택) >>> ");
		String birth = sc.nextLine();
		System.out.print("나이(선택) >>> ");
		String ageInput = sc.nextLine();
		int age = 0;
		if(!ageInput.isEmpty()) 
			age = Integer.parseInt(ageInput);
		
		String sql = String.format("INSERT INTO member (id, password, name, phone) VALUES "
		 + "('%s', '%s', '%s', '%s')", id, pw, name, phone);
		
		try {
			int count = stmt.executeUpdate(sql);
			if(count == 1) {
				System.out.println("필수값 처리 완료");
				if(gender.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET gender='%s' WHERE id='%s'", gender, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("성별 처리 오류");
				}
				if(address.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET address='%s' WHERE id='%s'", address, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("주소 처리 오류");
				}
				if(birth.length() > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET birth='%s-%s-%s' WHERE id='%s'",
							birth.substring(0, 4),
							birth.substring(4, 6),
							birth.substring(6, 8), id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("생년월일 처리 오류");
				}
				if(age > 0) {
					String sqlG = String.format("UPDATE sampledb.member "
							+ "SET age='%d' WHERE id='%s'", age, id);
					int countG = stmt.executeUpdate(sqlG);
					if(countG != 1) System.out.println("나이 처리 오류");
				}
			}	
			else
				System.out.println("필수값 처리 중 에러 발생");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	static void login(Statement stmt) {
			while(true) { 
				System.out.print("아이디 입력 >>> ");
				String id = sc.nextLine();
				System.out.print("비밀번호 입력 >>> ");
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
					System.out.println(id + "님 환영합니다!");
					}
					else System.out.println("로그인 실패!");
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
	}
	static void mypage(Statement stmt) {
		if(loginId.equals(null)) {
			System.out.println("로그인을 먼저 해주세요");
			return;
		}
		String sql = String.format("SELECT * FROM sampledb.member " 
				+ "WHERE id='%s'", loginId);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
			System.out.println("이름: "+ rs.getString("name"));
			System.out.println("성별: "+ rs.getString("gender"));
			System.out.println("전화번호: "+ rs.getString("phone"));
			System.out.println("주소: "+ rs.getString("address"));
			System.out.println("생년월일: "+ rs.getString("birth"));
			System.out.println("나이: "+ rs.getInt("age"));
			System.out.println("수정할 정보를 입력하세요 >>> ");
			String inputEdit = sc.nextLine();
			System.out.println("수정할 내용을 입력하세요 >>> ");
			String inputContent = sc.nextLine();
			if(inputEdit.equals("생년월일")) {
				String sqlB = String.format("UPDATE sampledb.member "
						+ "SET birth='%s-%s-%s' WHERE id='%s'",
						inputContent.substring(0, 4),
						inputContent.substring(4, 6),
						inputContent.substring(6, 8));
				int countB = stmt.executeUpdate(sqlB);
				if(countB != 1) System.out.println("생년월일 처리 오류");
				else System.out.println("변경 완료되었습니다.");
			}
			else if(inputEdit.equals("취소")) {
				return;
			}
			else {
				String sqlColumn = null;
				switch(inputEdit) {
				case "이름": sqlColumn = "name"; break;
				case "성별": sqlColumn = "gender"; break;
				case "전화번호": sqlColumn = "phone"; break;
				case "주소": sqlColumn = "address"; break;
			}
			String sqlB = String.format("UPDATE sampledb.member"
					+ " SET %s='%s' WHERE id='%s'",
					sqlColumn, inputContent, loginId);
			int countB = stmt.executeUpdate(sqlB);
			if(countB != 1) System.out.println(inputEdit+" 처리 오류");
			else System.out.println("변경 완료되었습니다.");
			}
		}	
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	static void logout() {
		loginId = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "8730");
			System.out.println("연결 완료!");
			
			while(true) {
				System.out.print("모드를 선택하세요(회원가입/로그인) >>> ");
				String mode = sc.nextLine();
				Statement st1 = conn.createStatement();
				if(mode.equals("회원가입")) register(st1);
				else if(mode.equals("로그인")) login(st1);
				else if(mode.equals("정보수정")) mypage(st1);
				else if(mode.equals("게시글 입력")) Board.createArticle(st1, loginId, sc);
				else if(mode.equals("게시글")) Board.getBoard(st1);
				else if(mode.equals("게시글 보기")) Board.getArticle(st1, sc);
				else break;
			}
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
		}


	}

}
