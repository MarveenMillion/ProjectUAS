import java.sql.*;

public class DatabaseYuhuu {

private Connection conn;
	
	public DatabaseYuhuu() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/Yuhuu","root",""
				);
	}
	public boolean isConnected(){
		return (conn != null);
		}
	
	public void insertData(
			String Username, 
			String ip
			) 
					throws Exception {
		String query = "INSERT INTO Yuhuu(usernameyuhuu, ipaddress) VALUES (?, ?)";
		PreparedStatement stmt = conn.prepareStatement(query); 
		stmt.setString(1, Username);
		stmt.setString(2, ip);
		stmt.execute();
		stmt.close();
	}

public boolean cek(String username)throws Exception{
	String query = "SELECT 1 from Yuhuu WHERE usernameyuhuu = ?";
	PreparedStatement stmt = conn.prepareStatement(query);
	stmt.setString(1, username);
	ResultSet rs = stmt.executeQuery();
	//stmt.execute();
	//stmt.close();
	return rs.next();
	}
	
public void deleteuser(String username)
throws Exception {
	String query = "DELETE FROM Yuhuu WHERE usernameyuhuu = ?";
	PreparedStatement stmt = conn.prepareStatement(query);
	stmt.setString(1, username);
	stmt.execute();
	stmt.close();
}
	
public ResultSet selectuser() throws Exception{
	String query = "SELECT usernameyuhuu FROM Yuhuu";
	PreparedStatement stmt = conn.prepareStatement(query);
	ResultSet rs = stmt.executeQuery();
	return rs;
}

public String nyariip(String username) throws Exception{
	String query = "SELECT ipaddress FROM Yuhuu where usernameyuhuu = ?";
	PreparedStatement stmt = conn.prepareStatement(query);
	stmt.setString(1, username);
	stmt.execute();
	stmt.close();
	return query;
}

public ResultSet nyariip1() throws Exception{
	String query = "SELECT ipaddress FROM Yuhuu";
	PreparedStatement stmt = conn.prepareStatement(query);
	ResultSet rs = stmt.executeQuery();
	return rs;
}

}
