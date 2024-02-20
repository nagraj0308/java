import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.Scanner; 
  
public class prog26 { 
  
    public static void main(String[] args) throws Exception { 
  
        Connection connection = null; 
        Statement statement = null; 
        Scanner scanner = null; 
  
        try { 
            int studentNo = 0; 
            String studentName = null; 
            String studentAddress = null; 
            int studentAge = 0; 
            scanner = new Scanner(System.in); 
            if (scanner != null) { 
                System.out.println("Enter Student No"); 
                studentNo = scanner.nextInt(); 
                System.out.println("Enter Student Name"); 
                studentName = scanner.next(); 
                System.out.println("Enter Student Address"); 
                studentAddress = scanner.next(); 
                System.out.println("Enter Student Age"); 
                studentAge = scanner.nextInt(); 
            } 
              
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
            connection = DriverManager.getConnection("jdbc:odbc:mysqldb"); 
            if (connection != null) { 
                statement = connection.createStatement(); 
		//String createQuery = "create table student(studentNo int,studentName varchar(30),studentAddress varchar(30),studentAge int)"; 
		//if(!statement.execute(createQuery))
                String insertQuery = "insert into student values(studentNo,studentName,studentAddress,studentAge)"; 
                int result = statement.executeUpdate(insertQuery); 
  
                if (result == 0) { 
                    System.out.println("Record Inserted Failed"); 
                } else { 
                    System.out.println(result+ " Record(s) Inserted "); 
                } 
            } 
  
        } catch (ClassNotFoundException cnfe) { 
  
            cnfe.printStackTrace(); 
        } catch (SQLException sqe) { 
            sqe.printStackTrace(); 
  
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            try { 
                if (statement != null) { 
                    statement.close(); 
                } 
            } catch (SQLException sqe) { 
                sqe.printStackTrace(); 
  
            } 
  
            try { 
                if (connection != null) { 
                    connection.close(); 
                } 
            } catch (SQLException sqe) { 
                sqe.printStackTrace(); 
  
            } 
  
        } 
  
    } 
} 