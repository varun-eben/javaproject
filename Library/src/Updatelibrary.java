import java.sql.*;
public class Updatelibrary {
	public void Libraryupdate() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/Library";
		String username="root";
		String password="9751510769";
		String Query="update book set book_name='transmission line' where book_id=?";
		Connection con = DriverManager.getConnection( url,username,password);
		PreparedStatement pst =con.prepareStatement(Query);
		pst.setString(1, "1E-101");
		
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception{
		Updatelibrary ab = new Updatelibrary();
		ab.Libraryupdate();
	}
}

