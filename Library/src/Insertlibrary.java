import java.sql.*;
public class Insertlibrary {
public void Library()throws Exception {
	String url ="jdbc:mysql://127.0.0.1:3306/Library";
	String username ="root";
	String password ="9751510769";
	String Query = "insert into book values (?,?,?,?,?)";
	Connection con=DriverManager.getConnection(url, username,password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setString(1, "1E-103");
	pst.setString(2,"microwave engg");
	pst.setString(3, "thilak");
	pst.setTimestamp(4,Timestamp.valueOf("2024-08-13 10:00:00"));
	pst.setTimestamp(5,Timestamp.valueOf("2024-08-25 12:00:00"));
	pst.executeUpdate();
	con.close();
}
public static void main(String[]args) throws Exception {
	Insertlibrary ab=new Insertlibrary();
	ab.Library();
}
}
