import java.sql.*;


public class JDBCEx {
	static void printTable(ResultSet rs) throws SQLException {
		while(rs.next()) {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			for(int i=1; i<=columns; i++) {
				switch(i) {
				case 1: 
				case 4:
					System.out.println(rs.getInt(i)+" ");
					break;
				default:
					System.out.println(rs.getString(i)+" ");
				}
			}
			System.out.println(rs.getString("name"));
		}
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "8730");
			System.out.println("연결 완료!");
			
			Statement st1 = conn.createStatement();
			ResultSet rs1 = st1.executeQuery("SELECT * FROM employee");
			while(rs1.next()) {
				System.out.println(rs1.getString("name"));
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
		}

	}

}
