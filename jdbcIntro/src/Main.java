import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
    String hi = "I worked on Select, Insert, Update and delete operations with MySQL queries on Sakila database.";
    }
    public void delete() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "delete from actor where actor_id = ? ";
            statement.setInt(1,202);
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Deleted your data.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "update actor set first_name='Kenan',last_name='Tatlıtug' where actor_id = 201 ";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Updated your data.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
        public void selectDemo()throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            Statement statement = null;
            ResultSet resultSet = null;
            try{
                connection = helper.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select first_name,last_name from actor");
                ArrayList<Actor> actors= new ArrayList<Actor>();
                while(resultSet.next()) {
                    actors.add(new Actor(resultSet.getString("first_name"),resultSet.getString("last_name")));
                }
                System.out.println(actors.size());
            }catch (SQLException exception){
                helper.showErrorMessage(exception);
            }finally {
                connection.close();
            }
        }
        public void insertData() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            try {
                connection = helper.getConnection();
                String sql = "insert into actor (first_name,last_name) values (?,?)";
                statement = connection.prepareStatement(sql);
                statement.setString(1,"Ayhan");
                statement.setString(2,"Isık");

                statement.executeUpdate();
                System.out.println("Added your data.");
            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            } finally {
                statement.close();
                connection.close();
            }
        }
    }