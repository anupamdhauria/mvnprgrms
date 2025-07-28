package pwskills.JdbcSelectApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelectApp {
    public static void main(String[] args) throws Exception {
    	
    	String url="jdbc:mysql:///enterprisebatch";
    	String userName="root";
    	String passWord="root";
    	

    	Connection connection = DriverManager.getConnection(url,userName,passWord);
    	Statement statement = connection.createStatement();
    	ResultSet resultSet = statement.executeQuery("select sid,sname,sage,saddress from student");

		System.out.println("SID\tSNAME\tSAGE\tSADDR");
		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String addr = resultSet.getString(4);
			System.out.println(id + "\t" + name + "\t" + age + "\t" + addr);
		}

		resultSet.close();
		statement.close();
		connection.close();
		
    }
}
