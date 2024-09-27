import java.sql.*;
public class Deletelibrary {
	public void Librarydelete() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/Library";
		 String username ="root";
		 String password="9751510769";
		 String Query ="delete from book where book_id = 1E-102";
		 Connection con =DriverManager.getConnection(url, username, password);
		 PreparedStatement pst = con.prepareStatement(Query);
		 pst.executeUpdate();
		 con.close();
		 
	}
	public static void main(String[]args) throws Exception{
		Deletelibrary ab = new Deletelibrary();
		ab.Librarydelete();
		}

	}

