//Because of NetBeans we have to add this import operation. 
//This situation depends on IDE for example; when we are using Intellij we didn't add like this import process.

import java.sql.*;
        
public class DbHelper {
private String userName="root";
private password="mysqlserver1!";
private dbUrl="jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";

//We have to write connection function for pair with database and our .java codes.

public Connection getConnection()throws SQLException {
    return DriverManager.getConnection(dbUrl,username,password);
}

public void showErrorMessage(SQLException exception){
    System.out.println("Error: "+exception.getMessage());
    System.out.println("Error code: "+exception.getErrorCode());
}
}
