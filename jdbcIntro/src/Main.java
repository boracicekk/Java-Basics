import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
    try{
        connection = helper.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select first_name from actor");
        while(resultSet.next()){
            System.out.println(resultSet.getString("first_name"));
        }
    }catch (SQLException exception){
        helper.showErrorMessage(exception);
    }finally {
        connection.close();
    }
    }
}