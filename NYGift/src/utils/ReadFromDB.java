package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;

import org.apache.derby.jdbc.EmbeddedDriver;

import sweets.Sweets;
import utils.IGift;

public class ReadFromDB implements IGift {
	
	public List<Sweets> getSweets() throws SQLException {
		
		System.out.println("\nNY Gift from DB:");
		
	 DriverManager.registerDriver(new EmbeddedDriver());
	 Connection connection = DriverManager.getConnection("jdbc:derby:my_db;create=true;user=me;password=mine");
	 Statement statement = connection.createStatement();
	 //statement.executeUpdate("CREATE TABLE gift ( ID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), NAME varchar(255) NOT NULL, WEIGHT double, PRICE double )");
	 //statement.addBatch("INSERT INTO gift (NAME, WEIGHT, PRICE) VALUES ('Минчанка', 200, 17)");
	 //statement.addBatch("INSERT INTO gift (NAME, WEIGHT, PRICE) VALUES ('Шахматное', 100, 15.6)");
	 //statement.addBatch("INSERT INTO gift (NAME, WEIGHT, PRICE) VALUES ('Бело-розовый', 250, 21)");
	 //statement.executeBatch();
	
	 ResultSet resultSet = statement.executeQuery("SELECT * FROM gift");
	 ResultSetMetaData metaData = resultSet.getMetaData();
	 
	 while (resultSet.next()) {
		 System.out.println("=============");
		 for (int i = 1, columnCount = metaData.getColumnCount(); i <= columnCount; i++) {
			 System.out.println(String.format("'%s' : '%s'", metaData.getColumnName(i), resultSet.getString(i))); 
		 }
		 System.out.println("=============");
	 }

	return null;
}
}
