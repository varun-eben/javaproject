import java.sql.*;
public class Getlibrary {
	public void Libraryget() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/Library";
		String username="root";
		String password="9751510769";
		String Query="select * from book";
		Connection con = DriverManager.getConnection( url,username,password);
		 Statement smt =con.createStatement();
		 ResultSet rst = smt.executeQuery(Query);
		 while(rst.next()) {
			 System.out.println("book_id"+"-"+rst.getString(1));
			 System.out.println("book_name"+"-"+rst.getString(2));
			 System.out.println("pr_name"+"-"+rst.getString(3));
			 System.out.println("bt_time"+"-"+rst.getTimestamp(4));
			 System.out.println("br_time"+"-"+rst.getTimestamp(5));
			 
		 }
		 con.close();
}
	public static void main(String[]args) throws Exception{
		 Getlibrary ab = new Getlibrary();
		 ab.Libraryget();
	 }

}
