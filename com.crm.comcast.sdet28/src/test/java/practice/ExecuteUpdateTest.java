package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {

	public static void main(String[] args) throws SQLException {

		//Register the driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		//Establist the database connection
		Connection connection = DriverManager.getConnection("", "root", "root");

		//issue statement
		Statement statement = connection.createStatement();
		//execute querry
		String querry="insert into student values(103, 'Tom', 'computer');";
		int result = statement.executeUpdate(querry);
		if (result==1) {
			System.out.println("Database has been updated");

		}
		else System.out.println("Database has not been updated");

		//close the database connection
		connection.close();
	}

}
