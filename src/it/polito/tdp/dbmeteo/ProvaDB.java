package it.polito.tdp.dbmeteo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProvaDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcURL = "jdbc:mysql://localhost/magazzino?user=root";
		
		try {
			
			Connection connection = DriverManager.getConnection(jdbcURL);
			
			Statement stmt = connection.createStatement();
			
			String query = "SELECT qty FROM prodotti";
			
			ResultSet result = stmt.executeQuery(query);
			
			while(result.next()){
				
				System.out.println(result.getInt("qty"));
				
			}
			
			connection.close();

			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
