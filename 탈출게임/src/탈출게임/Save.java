package 탈출게임;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Save {
	
	public static void main(String[] args) {
		
	}
	public static void save(String nick, String birth, String gender) {
		try {
			Connection conn = getConnection();
			PreparedStatement save = conn.prepareStatement(
					"INSERT INTO save(nick, birth, gender, score) "
					+ "VALUES ('"+nick+"','"+birth+"','"+gender+"',null)"
					);
			save.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String[][] getSaves() {
		try {
			Connection conn = getConnection(); // DB 연결, conn 객체 생성
			PreparedStatement statement = conn.prepareStatement(
					"SELECT * FROM save ORDER BY score DESC"
					);
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("nick"),
						results.getString("birth"),
						results.getString("gender"),
						results.getString("score")
				});
			}
			System.out.println("검색되었습니다.");
			String[][] arr = new String[list.size()][4];
			return list.toArray(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void createTable() {
		try {
			Connection conn = getConnection(); // DB 연결, conn 객체 생성
			PreparedStatement create = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "save(save_id int NOT NULL AUTO_INCREMENT,"
					+ "nick varChar(255),"
					+ "birth varChar(255),"
					+ "gender varChar(255),"
					+ "score varChar(255),"
					+ "PRIMARY KEY(save_id))"
					);
			create.execute();
			System.out.println("테이블을 만들었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void savescore(String score) {
		try {
			Connection conn = getConnection(); // DB 연결, conn 객체 생성
			PreparedStatement insert = conn.prepareStatement(
					"UPDATE save set score = "+score+" WHERE score is null"
					);
			insert.execute();
			System.out.println("세이브파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		try {
			Connection conn = getConnection(); // DB 연결, conn 객체 생성
			PreparedStatement insert = conn.prepareStatement(
					"DELETE FROM save WHERE score is null"
					);
			insert.execute();
			System.out.println("정리완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "123123";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 완료!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
