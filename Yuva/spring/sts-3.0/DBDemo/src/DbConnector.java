import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
	public static void main(String[] args){
	try {
		Connection connc = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bookstore","root","password");
		Statement stmt = connc.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM book");
        System.out.println("id	title	author	price");
        
        while (rs.next()) {
            int id = rs.getInt("book_id");
            String name = rs.getString("title");
            String job = rs.getString("author");
            float price = rs.getFloat("price");
            System.out.println(id+"   "+name+"    "+job+"	"+price);
         }
        
        connc.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
